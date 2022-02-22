package com.bluemoonl.ch14usedgoodstradeapp.home

data class ArticleMddel(
    val sellerId: String,
    val title: String,
    val createdAt: Long,
    val price: String,
    val imageUrl: String
) {
    constructor(): this("", "", 0, "", "")
}
