package com.example.superstreamer.navigation.menu

data class StationDTO(
    var streamerName: String? = null,
    var streamerExplain: String? = null,
    var youtubeAddress: String? = null,
    var afreecaAddress: String? = null,
    var twichAddress: String? = null,
    var uid: String? = null,
    var userId: String? = null,
    var timestamp: Long? = null,
    var favoriteCount: Int = 0,
    var favorites: MutableMap<String, Boolean> = HashMap()

) {
    data class Comment(
        var uid: String? = null,
        var userId: String? = null,
        var timestamp: Long? = null

    )

}