package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.sheet_comment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.majid2851.neolinestudio.R
import com.majid2851.neolinestudio.presentation.component.ImgBox
import com.majid2851.neolinestudio.presentation.theme.Dimen.ImogyIconSize
import com.majid2851.neolinestudio.presentation.theme.Dimen.LineSeperator
import com.majid2851.neolinestudio.presentation.theme.White
import com.majid2851.neolinestudio.presentation.theme.White50
import com.majid2851.neolinestudio.presentation.theme.proDisplay
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_14px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_18px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_22px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_24px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_28px
import com.majid2851.personalwallet.presentation.theme.St_Reactions
import com.walletline.android.presentation.theme.Padding.extraSmall
import com.walletline.android.presentation.theme.Padding.small

@Composable
fun Reactions(imogy:String)
{
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    )
    {
        Text(
            text = St_Reactions ,
            color = White,
            fontSize = Fonts_Equal_14px,
            fontFamily = proDisplay ,
            fontWeight = FontWeight.Normal,
            lineHeight = Fonts_Equal_22px
        )

        Text(
            text = imogy,
            fontSize = Fonts_Equal_24px,
            fontFamily = proDisplay,
            lineHeight = Fonts_Equal_18px,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.width(extraSmall))

        Box(
            modifier = Modifier
                .width(LineSeperator)
                .height(ImogyIconSize)
                .background(
                    color = White50
                )
        )

        Spacer(modifier = Modifier.width(small))

        ImgBox(
            img = R.drawable.group3,
            width =ImogyIconSize ,
            height =ImogyIconSize
        )

        Spacer(modifier = Modifier.width(small))

        ImgBox(
            img = R.drawable.frame_6845,
            width = ImogyIconSize,
            height =ImogyIconSize

        )





    }


}