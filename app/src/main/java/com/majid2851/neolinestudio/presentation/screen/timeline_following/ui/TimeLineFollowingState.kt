package com.majid2851.personalwallet.presentation.screens.main_page.accounts.ui


data class TimeLineFollowingState(
    val newPriceValue:String="",
    val followingCat:Boolean=true,
    val forYouCat:Boolean=false,
    val trendingCat:Boolean=false,
    val isPlaceBidSheetOpen:Boolean=false,
    val offerFieldFocused:Boolean=false,
    val isPlacedBidSheetSuccessOpen:Boolean=false,
    val isCommentSheetOpen:Boolean=false,
)