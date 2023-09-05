package com.majid2851.personalwallet.presentation.screens.main_page.accounts.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.holix.android.bottomsheetdialog.compose.BottomSheetDialog
import com.holix.android.bottomsheetdialog.compose.BottomSheetDialogProperties
import com.majid2851.neolinestudio.R
import com.majid2851.neolinestudio.presentation.screen.timeline_following.component.People
import com.majid2851.neolinestudio.presentation.screen.timeline_following.component.TopCats
import com.majid2851.neolinestudio.presentation.screen.timeline_following.component.TopToolbar
import com.majid2851.neolinestudio.presentation.screen.timeline_following.component.sheet_bid_success.BidPlaceSuccess
import com.majid2851.neolinestudio.presentation.screen.timeline_following.component.post.Post
import com.majid2851.neolinestudio.presentation.screen.timeline_following.component.sheet_bid.BidSheet
import com.majid2851.neolinestudio.presentation.screen.timeline_following.component.sheet_comment.SheetComment
import com.majid2851.neolinestudio.presentation.theme.Black
import com.majid2851.neolinestudio.presentation.theme.White
import com.majid2851.personalwallet.presentation.theme.St_YourCut
import com.walletline.android.presentation.theme.Padding.medium
import com.walletline.android.presentation.theme.Padding.small


@Composable
fun TimeLineFollowing(
    state: TimeLineFollowingState,
    event: (TimeLineFollowingEvent)->Unit,
)
{

    Box()
    {
        Column(
            modifier= Modifier.fillMaxSize()
            , horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Spacer(modifier = Modifier.height(small))

            TopToolbar()

            TopCats(
                state=state,
                onFollowingClick = {
                    event(TimeLineFollowingEvent.OnFollowingClick)
                },
                onTrendingClick = {
                    event(TimeLineFollowingEvent.OnTrendingClick)
                },
                onForYouClick = {
                    event(TimeLineFollowingEvent.OnForYouClick)

                }
            )



            Row()
            {
                People(
                    img = R.drawable.add,
                    name = St_YourCut,
                    backgroundColor = White,
                    imgPadding = medium,
                    onItemClick = {

                    },
                    addItem=true
                )

                LazyRow()
                {
                    items(10)
                    {
                        People(
                            img = R.drawable.test_profile,
                            name = "Damla",
                            backgroundColor = Black,
                            onItemClick = {

                            }
                        )
                    }
                }
            }



            LazyColumn(
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                items(2)
                {
                    Post(
                        onBidClick = {
                            event(TimeLineFollowingEvent.OnBidClick)
                        },
                        onCommentClick={
                            event(TimeLineFollowingEvent.OnCommentClick)
                        }
                    )
                }
            }


        }



        if (state.isPlaceBidSheetOpen==true)
        {
            BottomSheetDialog(
                onDismissRequest = {
                   event(TimeLineFollowingEvent.OnPlaceBidSheetDismiss)
                },
                properties = BottomSheetDialogProperties()
            ) {
                BidSheet(
                    offerFieldFocused = state.offerFieldFocused,
                    onOfferFieldFocus ={
                        event(TimeLineFollowingEvent.OnOfferFieldFocus(
                            dismissKeyboard = {

                            }
                        ))
                    },
                    newPriceValue = state.newPriceValue,

                    onNumClick={
                        event(TimeLineFollowingEvent.OnNumberKeyClick(it))
                    },
                    onDeleteClick = {
                        event(TimeLineFollowingEvent.OnDeleteKeyClick)
                    },
                    onSubmitBidClick={
                        event(TimeLineFollowingEvent.OnBidSubmitClick)
                    }

                )

            }
        }
        if (state.isPlacedBidSheetSuccessOpen==true)
        {
            BottomSheetDialog(
                onDismissRequest = {
                    event(TimeLineFollowingEvent.OnPlaceBidSuccessSheetDismiss)
                },
                properties = BottomSheetDialogProperties()
            ) {
                BidPlaceSuccess(
                    onBackHomeClick = {
                        event(TimeLineFollowingEvent.OnBackHomeClick)
                    }

                )

            }
        }

        if (state.isCommentSheetOpen==true)
        {
            BottomSheetDialog(
                onDismissRequest = {
                    event(TimeLineFollowingEvent.OnCommentSheetDismiss)
                },
                properties = BottomSheetDialogProperties()
            ) {
                SheetComment()

            }
        }


    }




}