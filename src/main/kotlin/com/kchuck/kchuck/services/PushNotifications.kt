package com.kchuck.kchuck.services

import khttp.post as httpPost

class PushNotifications {
    private val FCM_URL: String = "https://fcm.googleapis.com/fcm/send"
    private val serverKey: String = ""

    fun sendNotificationToAll() {
        try {
            val headers = mapOf("Authorization" to "key=$serverKey", "Content-Type" to "application/json")
            val payload = mapOf(
                    "to" to "/topics/all",
                    "notification" to mapOf("title" to "Title Joke", "body" to "Body Joke"),
                    "content_available" to true,
                    "priority" to "high"
            )
            val url = httpPost(FCM_URL, headers = headers, json = payload)
            println(url)
        } catch (e: Exception) {
            println(e)
        }
    }
}
