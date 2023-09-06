package com.majid2851.neolinestudio.presentation.screen.timeline_following.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.majid2851.neolinestudio.R
import com.majid2851.neolinestudio.presentation.component.ImgBox
import com.majid2851.neolinestudio.presentation.theme.Dimen.TimeLineTopToolbar_Height
import com.majid2851.neolinestudio.presentation.theme.Dimen.TimeLineTopToolbar_Width
import com.majid2851.personalwallet.presentation.screens.main_page.accounts.ui.TimeLineFollowingState
import com.walletline.android.presentation.theme.Padding.medium
import com.walletline.android.presentation.theme.Padding.small
import com.walletline.android.presentation.theme.Padding.smallMedium

@Composable
fun TopToolbar()
{
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    )
    {
        ImgBox(
            img = R.drawable.group_2184_12_1
            , height =TimeLineTopToolbar_Height
            , width = TimeLineTopToolbar_Width
        )


    }


}
@Composable
@Preview
fun TopToolbarPreview() {
   TopToolbar()
}