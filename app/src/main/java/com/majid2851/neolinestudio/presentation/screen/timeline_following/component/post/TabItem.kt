package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.post

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.majid2851.neolinestudio.R
import com.majid2851.neolinestudio.presentation.component.ImgBox
import com.majid2851.neolinestudio.presentation.theme.Dimen.PostTabBelowIcon
import com.majid2851.neolinestudio.presentation.theme.GrayCB
import com.majid2851.neolinestudio.presentation.theme.proDisplay
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_13px
import com.walletline.android.presentation.theme.Padding.extraSmall
import com.walletline.android.presentation.theme.Padding.small

@Composable
fun TabItem(
    img:Int,
    title:String,
    onItemClick:()->Unit
)
{
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clickable { onItemClick() }
            .padding(small)
    )
    {
        ImgBox(
            img=img,
            width = PostTabBelowIcon,
            height = PostTabBelowIcon,
            onClick = {onItemClick()}
        )

        Spacer(modifier = Modifier.width(extraSmall))

        Text(
            text = title,
            color = GrayCB,
            fontSize = Fonts_Equal_13px ,
            fontFamily = proDisplay ,
            fontWeight = FontWeight.Normal,
            lineHeight = Fonts_Equal_13px

        )



    }


}

@Composable
@Preview
fun TabItemPreview()
{
    TabItem(
        img = R.drawable.test_profile,
        title ="David"
    )
    {

    }
}