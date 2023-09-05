package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.sheet_place_bid

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
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_10px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_11px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_13px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_16px
import com.walletline.android.presentation.theme.Padding

@Composable
fun BidToolbar()
{
    Row(
        modifier=Modifier.fillMaxWidth(),
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
            ImgBox(img = R.drawable.test_profile)
        }

        Spacer(modifier = Modifier.width(Padding.extraSmall))

        Column(
            horizontalAlignment = Alignment.Start
        )
        {
            Row(verticalAlignment = Alignment.CenterVertically)
            {

                Text(
                    text = "Damla",
                    fontSize = Fonts_Equal_16px,
                    color = White,
                    fontWeight = FontWeight.Medium,
                    lineHeight = Fonts_Equal_13px ,
                    fontFamily = proDisplay
                )



                ImgBox(
                    img = R.drawable.verified_fill0_wght400_grad0_opsz48_2,
                    width = Dimen.PostToolbarSmallImg,
                    height = Dimen.PostToolbarSmallImg

                )
            }



            Row(
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Text(
                    text = "Ayemnut.moseiki.app",
                    fontSize = Fonts_Equal_11px,
                    color = GrayCB,
                    fontWeight = FontWeight.Medium,
                    lineHeight = Fonts_Equal_11px ,
                    fontFamily = proDisplay
                )


                Spacer(modifier = Modifier.width(Padding.extraSmall))

                Box(
                    modifier= Modifier
                        .size(Dimen.PostToolbarSmallCircle)
                        .background(
                            color = GrayCB,
                            shape = CircleShape
                        )
                )


                Spacer(modifier = Modifier.width(Padding.extraSmall))


                Text(
                    text = "Created 30 Jun 2023",
                    fontSize = Fonts_Equal_10px,
                    color = GrayCB,
                    fontWeight = FontWeight.Normal,
                    lineHeight = Fonts_Equal_10px ,
                    fontFamily = proDisplay
                )

            }

        }



    }
}