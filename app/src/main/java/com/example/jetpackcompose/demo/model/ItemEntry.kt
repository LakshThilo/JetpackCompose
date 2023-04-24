package com.example.jetpackcompose.demo.model

data class ItemEntry(
    val id: Int,
    val name: String,
    val description: String,
    val imageId: Int = 0,
    val quantity: Int
)