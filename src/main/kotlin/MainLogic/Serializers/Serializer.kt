package org.example.MainLogic.Serializers

interface Serializer<T> {

    fun Serialize(dataclassobject: T)
    fun Deserialize(jsonString: String)
}