package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.sheet_place_bid.custom_keyboard

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.majid2851.neolinestudio.presentation.theme.White_Alpha30
import com.majid2851.neolinestudio.presentation.theme.Dimen.KeyHeight
import com.majid2851.neolinestudio.presentation.theme.Dimen.KeyWidth
import com.majid2851.neolinestudio.presentation.theme.Dimen.LowCorner
import com.majid2851.neolinestudio.presentation.theme.White
import com.majid2851.neolinestudio.presentation.theme.proDisplay
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_10px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_12px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_25px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_30px
import com.walletline.android.presentation.theme.Padding.extraSmall

@Composable
fun Key(
    number:String,
    textValue:String,
    backgroundColor:Color=White_Alpha30,
    onNumClick:(String)->Unit
)
{
    Box(
        modifier = Modifier
            .padding(extraSmall)
            .height(KeyHeight)
            .width(KeyWidth)
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(LowCorner)
            )
            .clickable {
                onNumClick(number)
            }
    )
    {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.align(Alignment.Center)
        )
        {
            Text(
                text = number,
                fontSize = Fonts_Equal_25px,
                fontFamily = proDisplay,
                fontWeight = FontWeight.Normal,
                color = White,
                lineHeight =Fonts_Equal_30px
            )

            Text(
                text = textValue,
                fontSize = Fonts_Equal_10px,
                fontFamily = proDisplay,
                fontWeight = FontWeight.Bold,
                color = White ,
                lineHeight = Fonts_Equal_12px
            )


        }

    }


}

@Composable
@Preview
fun KeyPreview()
{
    Key(
        number="2",
        textValue="ABC",
        backgroundColor=White_Alpha30,
        onNumClick={}
    )
}
