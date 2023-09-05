package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.sheet_comment

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.majid2851.neolinestudio.R
import com.majid2851.neolinestudio.presentation.component.ImgBox
import com.majid2851.neolinestudio.presentation.theme.Dimen
import com.majid2851.neolinestudio.presentation.theme.Dimen.PostToolbarImgSize
import com.majid2851.neolinestudio.presentation.theme.GrayCB
import com.majid2851.neolinestudio.presentation.theme.MyBush
import com.majid2851.neolinestudio.presentation.theme.White
import com.majid2851.neolinestudio.presentation.theme.proDisplay
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_10px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_11px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_13px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_16px
import com.walletline.android.presentation.theme.Padding
@Composable
fun Comment()
{
    Row(
        verticalAlignment = Alignment.CenterVertically
    )
    {

        ImgBox(
            img = R.drawable.test_profile,
            width = PostToolbarImgSize,
            height = PostToolbarImgSize
        )

        Spacer(modifier = Modifier.width(Padding.extraSmall))

        Column(
            horizontalAlignment = Alignment.Start
        )
        {

            Row(
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Text(
                    text = "Nickol",
                    fontSize = Fonts_Equal_16px,
                    color = White,
                    fontWeight = FontWeight.Medium,
                    lineHeight = Fonts_Equal_13px ,
                    fontFamily = proDisplay
                )


                Spacer(modifier = Modifier.width(Padding.small))

                Box(
                    modifier= Modifier
                        .size(Dimen.PostToolbarSmallCircle)
                        .background(
                            color = White,
                            shape = CircleShape
                        )
                )


                Spacer(modifier = Modifier.width(Padding.small))


                Text(
                    text = "5m",
                    fontSize = Fonts_Equal_16px,
                    color = White,
                    fontWeight = FontWeight.Medium,
                    lineHeight = Fonts_Equal_13px ,
                    fontFamily = proDisplay
                )

            }

            Text(
                text = "Nice content, thank you!",
                fontSize = Fonts_Equal_16px,
                color = White,
                fontWeight = FontWeight.Normal,
                lineHeight = Fonts_Equal_13px ,
                fontFamily = proDisplay
            )





        }

        Spacer(modifier = Modifier
            .wrapContentHeight()
            .weight(1f))

        ImgBox(
            img = R.drawable.icon,
            width = Dimen.MoreSize,
            height = Dimen.MoreSize
        )


    }
}