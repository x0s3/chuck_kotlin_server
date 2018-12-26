package com.kchuck.kchuck.controllers

import com.kchuck.kchuck.services.KhuckService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestParam

@RestController
@RequestMapping("/chuck")
class KhuckController(private val chuckService: KhuckService) {

    @GetMapping("/joke")
    fun getAllJokes() = chuckService.listAllJokes()

    @PostMapping("/joke")
    fun postJoke(@RequestParam("text") text: String) = chuckService.postJoke(text)

    @GetMapping("/random", produces = [MediaType.APPLICATION_JSON_VALUE])
    suspend fun randomJoke(): String = chuckService.getApiJoke()
}
