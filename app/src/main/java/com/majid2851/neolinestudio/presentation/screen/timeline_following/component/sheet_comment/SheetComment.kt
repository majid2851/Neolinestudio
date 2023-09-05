package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.sheet_comment

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
import androidx.compose.ui.text.font.FontWeight
import com.majid2851.neolinestudio.presentation.theme.Black
import com.majid2851.neolinestudio.presentation.theme.Black14
import com.majid2851.neolinestudio.presentation.theme.Dimen
import com.majid2851.neolinestudio.presentation.theme.White
import com.majid2851.neolinestudio.presentation.theme.proDisplay
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_10px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_13px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_16px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_17px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_22px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_24px
import com.majid2851.personalwallet.presentation.theme.St_Bid_SUCCESS
import com.majid2851.personalwallet.presentation.theme.St_Comments
import com.majid2851.personalwallet.presentation.theme.St_Reply
import com.walletline.android.presentation.theme.Padding
import com.walletline.android.presentation.theme.Padding.small

@Composable
fun SheetComment()
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
            .padding(Padding.medium)
        , horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Spacer(modifier = Modifier.height(Padding.medium))
        Box(
            modifier = Modifier
                .width(Dimen.BidSheetTopBoxWidth)
                .height(Dimen.BidSheetTobBoxHeight)
                .background(color = Black)
        )

        Spacer(modifier = Modifier.height(Padding.medium))

        Text(
            text = St_Comments,
            color = White,
            fontSize = Fonts_Equal_17px,
            fontFamily = proDisplay,
            fontWeight = FontWeight.SemiBold,
            lineHeight = Fonts_Equal_22px,
        )

        Spacer(modifier = Modifier.height(Padding.medium))

        Column(
            modifier = Modifier.height(Dimen.CommentsHeight)
        )
        {
            Comment()

            Box(
                modifier = Modifier.fillMaxWidth()
            )
            {
                Text(
                    text = St_Reply,
                    color = White,
                    fontSize = Fonts_Equal_16px,
                    fontFamily = proDisplay,
                    fontWeight = FontWeight.Medium,
                    lineHeight = Fonts_Equal_13px,
                    modifier = Modifier
                        .padding(start = Dimen.ReplayMargin, top = small)
                        .align(Alignment.CenterStart)
                )
            }

        }


        Spacer(modifier = Modifier.height(Padding.medium))





    }



}