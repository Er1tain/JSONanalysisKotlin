package org.example.MainLogic.Serializers

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File

data class Order(
    val user_id: String,
    val ordered_at: String,
    val status: String,
    val total: String
)

class DataOrdersSerializer<Order>: Serializer<Order> {

    override fun Serialize(dataClassObjects: List<Order>): String {
        val serialized = Gson().toJson(dataClassObjects)
        return serialized
    }

    override fun Deserialize(jsonFile: String): List<Order> {
        try {
            val filePath =
                "C:\\Users\\Coder\\IdeaProjects\\ProcessingOrder\\src\\main\\kotlin\\data_for_testing\\${jsonFile}"
            val file = File(filePath)
            val json = file.readText()

            val typeToken = object : TypeToken<List<Order>>() {}.type
            val units = Gson().fromJson<List<Order>>(json, typeToken)

            return units
        } catch(e: Exception) {
            return listOf()
        }
    }

}