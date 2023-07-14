package com.albert.socialktormediaapp.presentation.chat

import com.albert.socialktormediaapp.domain.model.Message

data class ChatState(
    val messages: List<Message> = emptyList(),
    val isLoading: Boolean = false
)