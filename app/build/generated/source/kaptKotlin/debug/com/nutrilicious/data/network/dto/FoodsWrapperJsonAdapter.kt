// Code generated by moshi-kotlin-codegen. Do not edit.
package com.nutrilicious.data.network.dto

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonDataException
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import java.lang.NullPointerException
import java.lang.reflect.Type
import kotlin.Array
import kotlin.String
import kotlin.collections.List

class FoodsWrapperJsonAdapter<T>(moshi: Moshi, types: Array<Type>) : JsonAdapter<FoodsWrapper<T>>() {
    private val options: JsonReader.Options = JsonReader.Options.of("foods")

    private val listOfTAdapter: JsonAdapter<List<T>> =
            moshi.adapter<List<T>>(Types.newParameterizedType(List::class.java, types[0])).nonNull()

    override fun toString(): String = "GeneratedJsonAdapter(FoodsWrapper)"

    override fun fromJson(reader: JsonReader): FoodsWrapper<T> {
        var foods: List<T>? = null
        reader.beginObject()
        while (reader.hasNext()) {
            when (reader.selectName(options)) {
                0 -> foods = listOfTAdapter.fromJson(reader) ?: throw JsonDataException("Non-null value 'foods' was null at ${reader.path}")
                -1 -> {
                    // Unknown name, skip it.
                    reader.skipName()
                    reader.skipValue()
                }
            }
        }
        reader.endObject()
        var result = FoodsWrapper<T>()
        result.foods = foods ?: result.foods
        return result
    }

    override fun toJson(writer: JsonWriter, value: FoodsWrapper<T>?) {
        if (value == null) {
            throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
        }
        writer.beginObject()
        writer.name("foods")
        listOfTAdapter.toJson(writer, value.foods)
        writer.endObject()
    }
}
