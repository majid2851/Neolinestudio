package com.majid2851.personalwallet.presentation.screens.main_page.accounts.ui

import com.majid2851.neolinestudio.domain.model.PeopleModel
import com.majid2851.neolinestudio.domain.model.PostData


data class TimeLineFollowingState(
    val postData:List<PostData> = listOf(),
    val people:List<PeopleModel> = listOf(),
    val newPriceValue:String="",
    val followingCat:Boolean=true,
    val forYouCat:Boolean=false,
    val trendingCat:Boolean=false,
    val isPlaceBidSheetOpen:Boolean=false,
    val offerFieldFocused:Boolean=false,
    val isPlacedBidSheetSuccessOpen:Boolean=false,
    val isCommentSheetOpen:Boolean=false,
    val imgoy:String="",
    val commentValue:String="",
    val navHomeState:Boolean=true,
    val navDiscoverState:Boolean=false,
    val navNftMarketState:Boolean=false,
    val navMoreState:Boolean=false,
    val navProfileStatus:Boolean=false,
)