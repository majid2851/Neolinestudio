package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.sheet_place_bid

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.majid2851.neolinestudio.presentation.theme.Dimen
import com.majid2851.neolinestudio.presentation.theme.PinkF3
import com.majid2851.neolinestudio.presentation.theme.White
import com.majid2851.neolinestudio.presentation.theme.proDisplay
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_14px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_17px
import com.walletline.android.presentation.theme.Padding

@Composable
fun BidSubmit(
    onSubmitClick:()->Unit,
    title:String
)
{
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(Dimen.BidFieldHeight)
            .background(
                color = PinkF3,
                shape = RoundedCornerShape(Dimen.VeryHighCorner)
            )
            .clickable {
                onSubmitClick()
            }
            .padding(
                start = Padding.medium,
                end = Padding.medium
            )
    )
    {
        Text(
            text = title,
            fontFamily = proDisplay,
            fontWeight = FontWeight.SemiBold,
            fontSize = Fonts_Equal_14px,
            lineHeight = Fonts_Equal_17px,
            color = White,
            modifier = Modifier.align(Alignment.Center)
        )



    }

}