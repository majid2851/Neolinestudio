package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.sheet_bid

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import com.majid2851.neolinestudio.R
import com.majid2851.neolinestudio.presentation.component.ImgBox
import com.majid2851.neolinestudio.presentation.theme.Dimen.BidHideNft
import com.majid2851.neolinestudio.presentation.theme.White50
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_14px
import com.majid2851.personalwallet.presentation.theme.St_Hide
import com.majid2851.personalwallet.presentation.theme.St_ThisNtf
import com.majid2851.personalwallet.presentation.theme.St_YouCan
import com.walletline.android.presentation.theme.Padding.extraSmall
import com.walletline.android.presentation.theme.Padding.small

@Composable
fun HideNft()
{
    val text = buildAnnotatedString {
        withStyle(style = SpanStyle(fontWeight = FontWeight.Normal)) {
            append(St_YouCan)
            append(" ")
        }
        withStyle(style = SpanStyle(
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.Bold,
        )) {
            append(St_Hide)
        }
        withStyle( style = SpanStyle(fontWeight = FontWeight.Normal))
        {
            append(" ")
            append(St_ThisNtf)
        }

    }



    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    )
    {
        ImgBox(
            img = R.drawable.vector3,
            width = BidHideNft,
            height =BidHideNft
        )

        Spacer(modifier = Modifier.width(extraSmall))

        Text(
            text = text,
            fontSize = Fonts_Equal_14px,
            color = White50
        )


    }
}