package com.albert.socialktormediaapp.data.remote

import com.albert.socialktormediaapp.domain.model.Message


interface MessageService {

    suspend fun getAllMessages(): List<Message>

    companion object {
        const val BASE_URL = "http://192.168.0.2:8082"
    }

    sealed class Endpoints(val url: String) {
        object GetAllMessages: Endpoints("$BASE_URL/messages")
    }
}