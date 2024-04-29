package org.example

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File

data class Order(
    val user_id: String,
    val ordered_at: String,
    val status: String,
    val total: String
)


fun main() {

//    val filePath = "C:\\Users\\Coder\\IdeaProjects\\ProcessingOrder\\src\\main\\kotlin\\data_for_testing\\input.json"
//    val file = File(filePath)
//    val json = file.readText()
//
//    val typeToken = object: TypeToken<List<Order>>() {}.type
//    val orders = Gson().fromJson<List<Order>>(json, typeToken)
//    println(orders)


}