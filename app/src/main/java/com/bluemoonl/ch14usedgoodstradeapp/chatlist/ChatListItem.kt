package com.bluemoonl.ch14usedgoodstradeapp.chatlist

data class ChatListItem(
    val buyerId: String,
    val sellerId: String,
    val itemTitle: String,
    val key: Long
) {
    constructor(): this("", "", "", 0)
}
