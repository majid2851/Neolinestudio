package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.navigation_button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.majid2851.neolinestudio.R
import com.majid2851.neolinestudio.presentation.theme.Dimen.NavigationButtonHeight
import com.majid2851.neolinestudio.presentation.theme.Dimen.VeryHighCorner2
import com.majid2851.neolinestudio.presentation.theme.MyBush
import com.majid2851.personalwallet.presentation.screens.main_page.accounts.ui.TimeLineFollowingEvent
import com.majid2851.personalwallet.presentation.screens.main_page.accounts.ui.TimeLineFollowingState
import com.majid2851.personalwallet.presentation.theme.St_Discover
import com.majid2851.personalwallet.presentation.theme.St_Element
import com.majid2851.personalwallet.presentation.theme.St_Home
import com.majid2851.personalwallet.presentation.theme.St_Profile
import com.majid2851.personalwallet.presentation.theme.St_NFT

@Composable
fun NavigationButton(
    state:TimeLineFollowingState,
    event: (TimeLineFollowingEvent)->Unit
)
{
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .height(NavigationButtonHeight)
            .background(
                shape = RoundedCornerShape(VeryHighCorner2),
                brush = MyBush
            )

    )
    {
        NavButtonItem(
            isClicked = state.navHomeState,
            img = R.drawable.home2,
            title =St_Home,
            onNavClick = {
                event(TimeLineFollowingEvent.OnNavHomeClick)
            }
        )
        NavButtonItem(
            isClicked = state.navDiscoverState,
            img = R.drawable.discover,
            title = St_Discover,
            onNavClick = {
                event(TimeLineFollowingEvent.OnNavDiscoverClick)
            }
        )

        NavButtonItem(
            isClicked =state.navNftMarketState,
            img = R.drawable.shop,
            title = St_NFT,
            onNavClick = {
                event(TimeLineFollowingEvent.OnNavNftMarketClick)
            }
        )

        NavButtonItem(
            isClicked = state.navMoreState,
            img =R.drawable.element_equal ,
            title = St_Element,
            onNavClick = {
                event(TimeLineFollowingEvent.OnNavMoreClick)
            }
        )

        NavButtonItem(
            isClicked = state.navProfileStatus,
            img = R.drawable.test_profile,
            title = St_Profile,
            onNavClick = {
                event(TimeLineFollowingEvent.OnNavProfileClick)
            },
            noTint = true////i used this paramter for not using tint for profile Image
        )


    }


}

@Composable
@Preview
fun NavigationButtonPreview()
{
    val state=TimeLineFollowingState()
    NavigationButton(state = state, event = {})
}