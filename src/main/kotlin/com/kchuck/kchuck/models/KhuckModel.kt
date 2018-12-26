package com.kchuck.kchuck.models

import com.google.gson.annotations.SerializedName
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "jokes")
data class KhuckModel(
        @SerializedName("joke")
        val joke: String
)
