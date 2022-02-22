package com.bluemoonl.ch14usedgoodstradeapp.chatdetail

data class ChatItem(
    val senderId: String,
    val message: String
) {
    constructor(): this("", "")
}
