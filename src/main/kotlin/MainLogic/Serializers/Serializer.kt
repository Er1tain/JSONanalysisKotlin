package org.example.MainLogic.Serializers

interface Serializer<T> {

    fun Serialize(dataclassobjects: List<T>): String
    fun Deserialize(jsonFile: String): Any
}