package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.navigation_button

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import com.majid2851.neolinestudio.R
import com.majid2851.neolinestudio.presentation.component.ImgBox
import com.majid2851.neolinestudio.presentation.theme.Dimen.NavButtonImgSize
import com.majid2851.neolinestudio.presentation.theme.Dimen.NavButtonItemHeight
import com.majid2851.neolinestudio.presentation.theme.Dimen.NavButtonItemWidth
import com.majid2851.neolinestudio.presentation.theme.Dimen.VeryHighCorner2
import com.majid2851.neolinestudio.presentation.theme.PinkF3
import com.majid2851.neolinestudio.presentation.theme.White
import com.majid2851.neolinestudio.presentation.theme.proDisplay
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_10px
import com.walletline.android.presentation.theme.Padding.extraSmall

@Composable
fun NavButtonItem(
    isClicked:Boolean,
    img:Int,
    title:String,
    noTint:Boolean=false,
    onNavClick:()->Unit
)
{
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(start = extraSmall, end = extraSmall)
            .width(NavButtonItemWidth)
            .height(NavButtonItemHeight)
            .background(
                color = if (isClicked == true) White else Color.Transparent,
                shape = RoundedCornerShape(VeryHighCorner2)
            )
            .clickable {
                onNavClick()
            }
            .padding(extraSmall)
    )
    {
        ImgBox(
            img = img,
            width = NavButtonImgSize,
            height =NavButtonImgSize,
            tint = if (noTint==true) null
                   else if (isClicked==true ) PinkF3 else White

        )

        Text(
            text =title ,
            color = if (isClicked==true) PinkF3 else White,
            fontWeight = FontWeight.Bold,
            fontSize = Fonts_Equal_10px,
            fontFamily = proDisplay,
            lineHeight = Fonts_Equal_10px
        )

    }



}

@Composable
@Preview
fun NavButtonItemPreview()
{
    NavButtonItem(
        isClicked = true,
        img = R.drawable.home2 ,
        title ="home" )
    {

    }
}