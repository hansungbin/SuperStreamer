package com.example.superstreamer.navigation.menu

data class StationDTO(
    var idx : Int? = 0,
    var streamerName: String? = null,
    var streamerExplain: String? = null,
    var youtubeAddress: String? = null,
    var afreecaAddress: String? = null,
    var twichAddress: String? = null,
    var fuid: String? = null,
    var uid: String? = null,
    var userId: String? = null,
    var timestamp: Long? = null,
    var favoriteCount: Int = 0,
    var favorites: MutableMap<String, Boolean> = HashMap()
//idx, fuid
) {
    data class Comment(
        var uid: String? = null,
        var userId: String? = null,
        var timestamp: Long? = null

    )

}