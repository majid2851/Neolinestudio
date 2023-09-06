package com.majid2851.neolinestudio.presentation.screen.timeline_following.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.majid2851.neolinestudio.presentation.theme.Black14
import com.majid2851.neolinestudio.presentation.theme.Dimen.HighCorner
import com.majid2851.neolinestudio.presentation.theme.Dimen.TopCatsItemHeight
import com.majid2851.neolinestudio.presentation.theme.Gray1A
import com.majid2851.neolinestudio.presentation.theme.White
import com.majid2851.neolinestudio.presentation.theme.proDisplay
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_15px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_18px
import com.walletline.android.presentation.theme.Padding.extraSmall
import com.walletline.android.presentation.theme.Padding.medium
import com.walletline.android.presentation.theme.Padding.small
import com.walletline.android.presentation.theme.Padding.smallMedium

@Composable
fun TopCatsItem(
    title:String,
    catStatus:Boolean,
    onItemClick:()->Unit
)
{
    Box(
        modifier = Modifier
            .padding(small)
            .background(
                color = if(catStatus==true) Gray1A else Color.Transparent,
                shape = RoundedCornerShape(HighCorner,)
            )
            .clickable {
                onItemClick()
            }
            .height(TopCatsItemHeight)
            .wrapContentWidth()


            .padding(
                start = medium,
                end = medium,
                top = extraSmall,
                bottom = extraSmall
            )

    )
    {
        Text(
            text = title,
            color = White,
            fontSize = Fonts_Equal_15px,
            fontWeight = FontWeight.SemiBold,
            lineHeight = Fonts_Equal_18px,
            fontFamily = proDisplay,
            modifier = Modifier.align(Alignment.Center)
        )

    }

}
@Preview
@Composable
fun TopCatsItemPreview()
{
    TopCatsItem(
        title="Title",
        catStatus=true,
        onItemClick={}
    )
}