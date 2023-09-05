package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.sheet_bid_success

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import com.majid2851.neolinestudio.R
import com.majid2851.neolinestudio.presentation.component.ImgBox
import com.majid2851.neolinestudio.presentation.screen.timeline_following.component.sheet_bid.BidSubmit
import com.majid2851.neolinestudio.presentation.theme.Black
import com.majid2851.neolinestudio.presentation.theme.Black14
import com.majid2851.neolinestudio.presentation.theme.Dimen
import com.majid2851.neolinestudio.presentation.theme.Dimen.BidPlaceSuccessSize
import com.majid2851.neolinestudio.presentation.theme.White
import com.majid2851.neolinestudio.presentation.theme.proDisplay
import com.majid2851.personalwallet.presentation.theme.St_Bid_SUCCESS
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_10px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_24px
import com.majid2851.personalwallet.presentation.theme.St_BackHome
import com.walletline.android.presentation.theme.Padding

@Composable
fun BidPlaceSuccess(
    onBackHomeClick:()->Unit
)
{
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Black14,
                shape = RoundedCornerShape(
                    topStart = Dimen.HighCorner,
                    topEnd = Dimen.HighCorner
                )
            )
            .padding(Padding.small)
        , horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Spacer(modifier = Modifier.height(Padding.small))
        Box(
            modifier = Modifier
                .width(Dimen.BidSheetTopBoxWidth)
                .height(Dimen.BidSheetTobBoxHeight)
                .background(color = Black)
        )

        Spacer(modifier = Modifier.height(Padding.medium))

        Text(
            text = St_Bid_SUCCESS,
            color = White,
            fontSize = Fonts_Equal_24px,
            fontFamily = proDisplay,
            fontWeight = Bold,
            lineHeight = Fonts_Equal_10px
        )


        Spacer(modifier = Modifier.height(Padding.medium))

        ImgBox(
            img = R.drawable.group2,
            width = BidPlaceSuccessSize,
            height = BidPlaceSuccessSize
        )

        Spacer(modifier = Modifier.height(Padding.medium))

        BidSuccessInfo()


        Spacer(modifier = Modifier.height(Padding.large))

        BidSubmit(
            onSubmitClick = {onBackHomeClick() },
            title = St_BackHome
        )

        Spacer(modifier = Modifier.height(Padding.medium))

    }



}