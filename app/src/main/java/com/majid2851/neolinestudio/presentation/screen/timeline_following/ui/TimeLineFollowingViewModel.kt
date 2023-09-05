package com.majid2851.personalwallet.presentation.screens.main_page.accounts.ui

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.text.buildAnnotatedString
import androidx.lifecycle.ViewModel
import com.majid2851.neolinestudio.R
import com.majid2851.neolinestudio.data.local.timeline_following.fakePeopleData
import com.majid2851.neolinestudio.data.local.timeline_following.postListData
import com.majid2851.neolinestudio.domain.util.Constants
import com.walletline.android.presentation.theme.myTypography
import dagger.hilt.android.lifecycle.HiltViewModel
import java.lang.StringBuilder
import javax.inject.Inject

@HiltViewModel
class TimeLineFollowingViewModel
    @Inject constructor(
    ):ViewModel()
{
    val state:MutableState<TimeLineFollowingState>
        = mutableStateOf(TimeLineFollowingState())
    init {
        state.value=state.value.copy(
            imgoy = getImgoy()
            , postData = postListData
            , people = fakePeopleData
        )
    }

    fun onTriggerEvent(event: TimeLineFollowingEvent)
    {
        when(event)
        {
            is TimeLineFollowingEvent.OnFollowingClick->
            {
                state.value=state.value.copy(
                    followingCat = true,
                    forYouCat = false,
                    trendingCat = false
                )
            }
            is TimeLineFollowingEvent.OnForYouClick->
            {
                state.value=state.value.copy(
                    followingCat = false,
                    forYouCat = true,
                    trendingCat = false
                )
            }
            is TimeLineFollowingEvent.OnTrendingClick->
            {
                state.value=state.value.copy(
                    followingCat = false,
                    forYouCat = false,
                    trendingCat = true
                )
            }

            is TimeLineFollowingEvent.OnBidClick ->{
                state.value=state.value.copy(
                    isPlaceBidSheetOpen = true
                )
            }


            is TimeLineFollowingEvent.OnPlaceBidSheetDismiss ->{
                state.value=state.value.copy(
                    isPlaceBidSheetOpen = false,
                    offerFieldFocused = false
                )
            }

            is TimeLineFollowingEvent.OnOfferFieldFocus ->{
                state.value=state.value.copy(
                    offerFieldFocused = true
                )
                event.dismissKeyboard()
            }



            is TimeLineFollowingEvent.OnNumberKeyClick ->{
                val sb= buildAnnotatedString {
                    append(state.value.newPriceValue)
                    append(event.num)
                }
                if (state.value.newPriceValue.length<= Constants.MaxPriceLength)
                    state.value=state.value.copy(newPriceValue = sb.toString())

            }

            is TimeLineFollowingEvent.OnDeleteKeyClick ->{
                if (state.value.newPriceValue.length!=0)
                {
                    val newPrice=state.value.newPriceValue.dropLast(1)
                    state.value=state.value.copy(
                        newPriceValue = newPrice
                    )
                    Log.i("mag2851-droplast",newPrice.length.toString())
                }
            }

            is TimeLineFollowingEvent.OnBidSubmitClick ->{
                state.value=state.value.copy(
                    isPlacedBidSheetSuccessOpen = true,
                    isPlaceBidSheetOpen = false,
                    offerFieldFocused = false

                )
            }
            is TimeLineFollowingEvent.OnPlaceBidSuccessSheetDismiss ->{
                state.value=state.value.copy(
                    isPlacedBidSheetSuccessOpen = false
                )
            }

            is TimeLineFollowingEvent.OnBackHomeClick ->{
                state.value=state.value.copy(
                    isPlacedBidSheetSuccessOpen = false
                )
            }

            is TimeLineFollowingEvent.OnCommentSheetDismiss ->{
                state.value=state.value.copy(
                    isCommentSheetOpen = false
                )
            }
            is TimeLineFollowingEvent.OnCommentClick ->{
                state.value=state.value.copy(
                    isCommentSheetOpen = true
                )
            }

            is TimeLineFollowingEvent.OnCommentChange->{
                state.value=state.value.copy(
                    commentValue = event.value
                )
            }

            is TimeLineFollowingEvent.OnNavHomeClick->{
                refreshNavStatus()
                state.value=state.value.copy(
                    navHomeState = true
                )
            }
            is TimeLineFollowingEvent.OnNavDiscoverClick->{
                refreshNavStatus()
                state.value=state.value.copy(
                    navDiscoverState = true
                )
            }
            is TimeLineFollowingEvent.OnNavNftMarketClick->{
                refreshNavStatus()
                state.value=state.value.copy(
                    navNftMarketState = true
                )
            }
            is TimeLineFollowingEvent.OnNavMoreClick->{
                refreshNavStatus()
                state.value=state.value.copy(
                    navMoreState = true
                )
            }

            is TimeLineFollowingEvent.OnNavProfileClick->{
                refreshNavStatus()
                state.value=state.value.copy(
                    navProfileStatus = true
                )
            }



            else ->{}
        }
    }
    fun refreshNavStatus()
    {
        state.value=state.value.copy(
            navHomeState=false,
            navDiscoverState = false,
            navNftMarketState = false,
            navMoreState = false,
            navProfileStatus = false
        )
    }

    fun getImgoy(): String {
        val sb=StringBuilder()
        sb.append(" ")
        sb.append("\uD83D\uDE0D")//Imogy Code
        sb.append(" ")
        sb.append("\uD83D\uDE18")
        sb.append(" ")
        sb.append("\uD83E\uDD29")
        sb.append(" ")
        sb.append("\uD83E\uDD70")
        sb.append(" ")
        sb.append("\uD83D\uDE14")
        sb.append(" ")
        sb.append("\uD83D\uDE09")
        return sb.toString()
    }




}