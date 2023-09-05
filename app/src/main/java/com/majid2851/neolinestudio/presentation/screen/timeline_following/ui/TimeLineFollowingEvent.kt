package com.majid2851.personalwallet.presentation.screens.main_page.accounts.ui


sealed class TimeLineFollowingEvent
{

    object OnFollowingClick:TimeLineFollowingEvent()
    object OnForYouClick:TimeLineFollowingEvent()
    object OnTrendingClick:TimeLineFollowingEvent()

    object OnBidClick:TimeLineFollowingEvent()
    object OnPlaceBidSheetDismiss:TimeLineFollowingEvent()

    data class OnOfferFieldFocus(
        val dismissKeyboard:()->Unit
    ):TimeLineFollowingEvent()
    data class OnNumberKeyClick(val num:String):TimeLineFollowingEvent()

    object OnDeleteKeyClick:TimeLineFollowingEvent()
    object OnBidSubmitClick:TimeLineFollowingEvent()
    object OnPlaceBidSuccessSheetDismiss:TimeLineFollowingEvent()
    object OnBackHomeClick:TimeLineFollowingEvent()
    object OnCommentSheetDismiss:TimeLineFollowingEvent()
    object OnCommentClick:TimeLineFollowingEvent()
    data class OnCommentChange(val value:String):TimeLineFollowingEvent()


    object OnNavHomeClick:TimeLineFollowingEvent()
    object OnNavDiscoverClick:TimeLineFollowingEvent()
    object OnNavNftMarketClick:TimeLineFollowingEvent()
    object OnNavMoreClick:TimeLineFollowingEvent()
    object OnNavProfileClick:TimeLineFollowingEvent()


}