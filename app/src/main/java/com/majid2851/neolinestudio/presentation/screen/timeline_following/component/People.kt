package com.majid2851.neolinestudio.presentation.screen.timeline_following.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import com.majid2851.neolinestudio.presentation.component.ImgBox
import com.majid2851.neolinestudio.presentation.theme.Dimen.BorderMediumWidth
import com.majid2851.neolinestudio.presentation.theme.Dimen.HighCorner
import com.majid2851.neolinestudio.presentation.theme.Dimen.MediumCorner
import com.majid2851.neolinestudio.presentation.theme.Dimen.ProfileSize
import com.majid2851.neolinestudio.presentation.theme.Dimen.VeryHighCorner
import com.majid2851.neolinestudio.presentation.theme.OrangeF0
import com.majid2851.neolinestudio.presentation.theme.PinkED
import com.majid2851.neolinestudio.presentation.theme.PinkF3
import com.majid2851.neolinestudio.presentation.theme.White
import com.majid2851.neolinestudio.presentation.theme.proDisplay
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_13px
import com.walletline.android.presentation.theme.Padding.medium
import com.walletline.android.presentation.theme.Padding.small

@Composable
fun People(
    img:Int,
    name:String,
    backgroundColor:Color,
    imgPadding: Dp ?=null,
    addItem:Boolean=false,
    onItemClick:()->Unit,
)
{

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(small)
    )
    {
        Box(
            modifier = Modifier
                .border(
                    width = BorderMediumWidth ,
                    shape = RoundedCornerShape(VeryHighCorner),

                    brush = Brush.linearGradient(
                        colors = if(addItem==false)
                            listOf(
                                PinkED,
                                PinkF3,
                                OrangeF0
                            ) else listOf(White, White)
                        ,
                        start =  Offset(0f, 0f),
                        end = Offset(Float.POSITIVE_INFINITY, 0f)
                    ),

                )

                .background(
                    shape = RoundedCornerShape(VeryHighCorner),
                    color = backgroundColor

                )
                .width(ProfileSize)
                .height(ProfileSize)

                .clickable {
                    onItemClick()
                }

        )
        {
            ImgBox(
                img = img,
                padding = imgPadding
            )

        }

        Text(
            text =name ,
            color = White,
            fontSize = Fonts_Equal_13px,
            fontFamily =proDisplay,
            fontWeight =FontWeight.Medium,
        )
    }

}

