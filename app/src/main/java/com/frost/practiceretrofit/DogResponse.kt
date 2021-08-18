package com.frost.practiceretrofit

import com.google.gson.annotations.SerializedName

class DogResponse(
    @SerializedName("message")var images:List<String>,
    var status: String
    )