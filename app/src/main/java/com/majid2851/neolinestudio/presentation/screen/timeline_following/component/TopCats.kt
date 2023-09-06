package com.majid2851.neolinestudio.presentation.screen.timeline_following.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.majid2851.personalwallet.presentation.screens.main_page.accounts.ui.TimeLineFollowingState
import com.majid2851.personalwallet.presentation.theme.St_Following
import com.majid2851.personalwallet.presentation.theme.St_ForYou
import com.majid2851.personalwallet.presentation.theme.St_Trending

@Composable
fun TopCats(
    state:TimeLineFollowingState,
    onFollowingClick:()->Unit,
    onForYouClick:()->Unit,
    onTrendingClick:()->Unit,
)
{
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    )
    {
        TopCatsItem(
            title = St_Following,
            catStatus = state.followingCat,
            onItemClick = {
                onFollowingClick()
            }
        )

        TopCatsItem(
            title = St_ForYou,
            catStatus = state.forYouCat,
            onItemClick = {
               onForYouClick()
            },
        )

        TopCatsItem(
            title = St_Trending,
            catStatus=state.trendingCat,
            onItemClick = {
                onTrendingClick()
            }
        )


    }

}
@Composable
@Preview
fun TopCatsPreview() {

    val sampleState = TimeLineFollowingState(
        followingCat = true
    )
    TopCats(
        state = sampleState,
        onFollowingClick = {  },
        onForYouClick = {  },
        onTrendingClick = {  }
    )
}