package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.post

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.majid2851.neolinestudio.presentation.theme.Dimen.HighCorner
import com.majid2851.neolinestudio.presentation.theme.Dimen.LineSeperator
import com.majid2851.neolinestudio.presentation.theme.Dimen.MediumCorner
import com.majid2851.neolinestudio.presentation.theme.Dimen.PostBidHeight
import com.majid2851.neolinestudio.presentation.theme.Dimen.PostBidWidth
import com.majid2851.neolinestudio.presentation.theme.GrayCB
import com.majid2851.neolinestudio.presentation.theme.GrayF8
import com.majid2851.neolinestudio.presentation.theme.MyBush
import com.majid2851.neolinestudio.presentation.theme.OrangeF0
import com.majid2851.neolinestudio.presentation.theme.PinkED
import com.majid2851.neolinestudio.presentation.theme.PinkF3
import com.majid2851.neolinestudio.presentation.theme.White
import com.majid2851.neolinestudio.presentation.theme.proDisplay
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_13px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_18px
import com.majid2851.personalwallet.presentation.theme.St_Bid
import com.walletline.android.presentation.theme.Padding.extraSmall

@Composable
fun PostDate(
    show:Boolean,
    onBidClick:()->Unit
)
{
    if (show==true)
    {
        Column()
        {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(LineSeperator)
                    .background(
                        color = GrayF8
                    )
            )
            Spacer(modifier = Modifier.height(extraSmall))

            Box(
                modifier = Modifier
                    .fillMaxWidth()

            )
            {
                Text(
                    text ="Created 30 Jun 2023" ,
                    color = GrayCB,
                    fontSize = Fonts_Equal_13px ,
                    fontFamily = proDisplay,
                    fontWeight = FontWeight.Normal ,
                    lineHeight = Fonts_Equal_13px,
                    modifier = Modifier.align(Alignment.CenterStart)
                )

                Box(
                    modifier = Modifier
                        .width(PostBidWidth)
                        .height(PostBidHeight)
                        .clickable {
                            onBidClick()
                        }
                        .background(
                            shape = RoundedCornerShape(HighCorner),
                            brush = MyBush
                        )
                        .align(Alignment.CenterEnd)
                )
                {
                    Text(
                        text = St_Bid ,
                        color = White,
                        fontSize = Fonts_Equal_13px ,
                        fontFamily = proDisplay,
                        fontWeight = FontWeight.SemiBold ,
                        lineHeight = Fonts_Equal_18px,
                        modifier = Modifier.align(Alignment.Center)
                    )

                }
            }


        }
    }



}

@Composable
@Preview
fun PostDatePreview()
{
    PostDate(show = true) {
        
    }

}