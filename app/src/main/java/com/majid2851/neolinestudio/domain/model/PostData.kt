package com.majid2851.neolinestudio.domain.model

data class PostData(
    val userName:String,
    val name:String,
    val time:String,
    val text:String,
    val hashtak:String,
    val likes:String,
    val commentsNum:String,
    val repostNum:String,
    val viewNum:String,
    val profileImg:Int,
    val postImg:Int
)
