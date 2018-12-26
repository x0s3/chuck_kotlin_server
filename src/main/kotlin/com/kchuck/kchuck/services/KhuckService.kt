package com.kchuck.kchuck.services

import com.kchuck.kchuck.models.KhuckModel
import com.kchuck.kchuck.repositories.KhuckRepository
import khttp.responses.Response
import kotlinx.coroutines.*
import org.springframework.stereotype.Service
import khttp.get as httpGet

interface KhuckInterface {
    fun listAllJokes(): List<KhuckModel>
    fun postJoke(text: String): List<KhuckModel>
    suspend fun getApiJoke(): String
}

@Service
class KhuckService(private val chuckRepository: KhuckRepository) : KhuckInterface {

    override fun listAllJokes(): List<KhuckModel> = chuckRepository.findAll()

    override fun postJoke(text: String): List<KhuckModel> {
        chuckRepository.insert(KhuckModel(text))
        return listAllJokes()
    }

    override suspend fun getApiJoke(): String {
        var response: Response? = null
        runBlocking {
            val getResponse = async { httpGet("https://api.chucknorris.io/jokes/random") }
            runBlocking {
                response = getResponse.await()
            }
        }
        return response!!.jsonObject.toString()
    }
}
