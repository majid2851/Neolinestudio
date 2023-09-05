package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.sheet_bid_success

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.majid2851.neolinestudio.R
import com.majid2851.neolinestudio.presentation.component.ImgBox
import com.majid2851.neolinestudio.presentation.theme.Dimen
import com.majid2851.neolinestudio.presentation.theme.GrayCB
import com.majid2851.neolinestudio.presentation.theme.White
import com.majid2851.neolinestudio.presentation.theme.proDisplay
import com.majid2851.personalwallet.presentation.theme.St_Approve_ASSET
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_11px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_13px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_16px
import com.majid2851.personalwallet.presentation.theme.St_This_Transaction
import com.walletline.android.presentation.theme.Padding

@Composable
fun BidSuccessInfo()
{
    Row(
        modifier= Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    )
    {
        Box(
            modifier= Modifier
                .size(Dimen.PostToolbarImgSize)
                .background(
                    shape = CircleShape,
                    color = Color.Transparent
                )
        )
        {
            ImgBox(img = R.drawable.check_fill0_wght400_grad0_opsz48_1)
        }

        Spacer(modifier = Modifier.width(Padding.extraSmall))

        Column(
            horizontalAlignment = Alignment.Start
        )
        {

            Text(
                text = St_Approve_ASSET,
                fontSize = Fonts_Equal_16px,
                color = White,
                fontWeight = FontWeight.Medium,
                lineHeight = Fonts_Equal_13px ,
                fontFamily = proDisplay
            )

            Text(
                text = St_This_Transaction,
                fontSize = Fonts_Equal_11px,
                color = GrayCB,
                fontWeight = FontWeight.Medium,
                lineHeight = Fonts_Equal_11px ,
                fontFamily = proDisplay
            )



        }



    }
}