package com.majid2851.personalwallet.presentation.screens.main_page.accounts.ui

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.text.buildAnnotatedString
import androidx.lifecycle.ViewModel
import com.majid2851.neolinestudio.domain.util.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TimeLineFollowingViewModel
    @Inject constructor(

    ):ViewModel()
{
    val state:MutableState<TimeLineFollowingState>
        = mutableStateOf(TimeLineFollowingState())
    init {

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
                    isPlaceBidSheetOpen = false
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



            else ->{}
        }
    }



}