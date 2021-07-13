package com.example.superstreamer.navigation.menu

// 조회할 데이터형태
data class StationDTO
    (var code: Int, var data: List<Station_result>)

// 리턴 받을 데이터형태
data class Station_result
    (
    var idx: Int = 0,
    var streamerName: String = "",
    var streamerExplain: String = "",
    var youtubeAddress: String = ""
)


//data class StationDTO(
//    var idx : Int? = 0,
//    var streamerName: String? = null,
//    var streamerExplain: String? = null,
//    var youtubeAddress: String? = null,
//    var afreecaAddress: String? = null,
//    var twichAddress: String? = null,
//    var fuid: String? = null,
//    var uid: String? = null,
//    var userId: String? = null,
//    var timestamp: Long? = null,
//    var favoriteCount: Int = 0,
//    var favorites: MutableMap<String, Boolean> = HashMap()
////idx, fuid
//) {
//    data class Comment(
//        var uid: String? = null,
//        var userId: String? = null,
//        var timestamp: Long? = null
//
//    )
//
//}