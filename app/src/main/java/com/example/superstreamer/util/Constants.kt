package com.example.superstreamer.util

object Constants {
    var TAG : String? = "로그 Constants.kt"
}

enum class SELECT_CONTENT {
    streamerName
}

enum class RESPONSE_STATE{
    OKAY,
    FAIL
}

object API {
    const val BASE_URL : String = "https://happynewmind1.cafe24.com/"

    const val STREAMERNAME : String = ""

    const val SEARCH_STATION : String = "select_content"
}