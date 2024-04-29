package org.example.MainLogic.Serializers

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File

class DataOrdersSerializer<T>: Serializer<T> {

    override fun Serialize(dataClassObject: T) {

    }

    override fun Deserialize(jsonFile: String): List<T> {

        val filePath = "C:\\Users\\Coder\\IdeaProjects\\ProcessingOrder\\src\\main\\kotlin\\data_for_testing\\${jsonFile}"
        val file = File(filePath)
        val json = file.readText()

        val typeToken = object: TypeToken<List<T>>() {}.type
        val units = Gson().fromJson<List<T>>(json, typeToken)
        return units
    }

}