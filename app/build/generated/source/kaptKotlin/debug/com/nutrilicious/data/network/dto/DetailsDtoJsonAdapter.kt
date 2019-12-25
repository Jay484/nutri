// Code generated by moshi-kotlin-codegen. Do not edit.
package com.nutrilicious.data.network.dto

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonDataException
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import java.lang.NullPointerException
import kotlin.String
import kotlin.collections.List

class DetailsDtoJsonAdapter(moshi: Moshi) : JsonAdapter<DetailsDto>() {
    private val options: JsonReader.Options = JsonReader.Options.of("desc", "nutrients")

    private val descriptionDtoAdapter: JsonAdapter<DescriptionDto> =
            moshi.adapter(DescriptionDto::class.java).nonNull()

    private val listOfNutrientDtoAdapter: JsonAdapter<List<NutrientDto>> =
            moshi.adapter<List<NutrientDto>>(Types.newParameterizedType(List::class.java, NutrientDto::class.java)).nonNull()

    override fun toString(): String = "GeneratedJsonAdapter(DetailsDto)"

    override fun fromJson(reader: JsonReader): DetailsDto {
        var desc: DescriptionDto? = null
        var nutrients: List<NutrientDto>? = null
        reader.beginObject()
        while (reader.hasNext()) {
            when (reader.selectName(options)) {
                0 -> desc = descriptionDtoAdapter.fromJson(reader) ?: throw JsonDataException("Non-null value 'desc' was null at ${reader.path}")
                1 -> nutrients = listOfNutrientDtoAdapter.fromJson(reader) ?: throw JsonDataException("Non-null value 'nutrients' was null at ${reader.path}")
                -1 -> {
                    // Unknown name, skip it.
                    reader.skipName()
                    reader.skipValue()
                }
            }
        }
        reader.endObject()
        var result = DetailsDto(
                desc = desc ?: throw JsonDataException("Required property 'desc' missing at ${reader.path}"),
                nutrients = nutrients ?: throw JsonDataException("Required property 'nutrients' missing at ${reader.path}"))
        return result
    }

    override fun toJson(writer: JsonWriter, value: DetailsDto?) {
        if (value == null) {
            throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
        }
        writer.beginObject()
        writer.name("desc")
        descriptionDtoAdapter.toJson(writer, value.desc)
        writer.name("nutrients")
        listOfNutrientDtoAdapter.toJson(writer, value.nutrients)
        writer.endObject()
    }
}
