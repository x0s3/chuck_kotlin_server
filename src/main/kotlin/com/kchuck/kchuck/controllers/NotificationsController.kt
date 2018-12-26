package com.kchuck.kchuck.controllers

import com.kchuck.kchuck.services.PushNotifications
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/notifications")
class NotificationsController {

    @GetMapping("/all")
    fun sendNotificationToAll() {
        val pn = PushNotifications()
        pn.sendNotificationToAll()
    }
}