package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.post

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
import com.majid2851.neolinestudio.domain.model.PostData
import com.majid2851.neolinestudio.presentation.component.ImgBox
import com.majid2851.neolinestudio.presentation.theme.Dimen
import com.majid2851.neolinestudio.presentation.theme.Dimen.MoreSize
import com.majid2851.neolinestudio.presentation.theme.Dimen.PostToolbarImgSize
import com.majid2851.neolinestudio.presentation.theme.Dimen.PostToolbarSmallCircle
import com.majid2851.neolinestudio.presentation.theme.Dimen.PostToolbarSmallImg
import com.majid2851.neolinestudio.presentation.theme.GrayCB
import com.majid2851.neolinestudio.presentation.theme.MyBush
import com.majid2851.neolinestudio.presentation.theme.White
import com.majid2851.neolinestudio.presentation.theme.proDisplay
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_10px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_11px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_13px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_16px
import com.walletline.android.presentation.theme.Padding.extraSmall

@Composable
fun PostToolbar(postModel: PostData)
{
    Row(
        verticalAlignment = Alignment.CenterVertically
    )
    {
        Box(
            modifier= Modifier
                .size(PostToolbarImgSize)
                .border(
                    width = Dimen.BorderSmallWidth,
                    shape = RoundedCornerShape(Dimen.VeryHighCorner),
                    brush = MyBush

                    )
        )
        {
            ImgBox(img = postModel.profileImg)
        }

        Spacer(modifier = Modifier.width(extraSmall))
        
        Column(
            horizontalAlignment = Alignment.Start
        )
        {
            Row(verticalAlignment = Alignment.CenterVertically)
            {

                Text(
                    text = postModel.userName,
                    fontSize = Fonts_Equal_16px,
                    color = White,
                    fontWeight = FontWeight.Medium,
                    lineHeight = Fonts_Equal_13px ,
                    fontFamily = proDisplay
                )



                ImgBox(
                    img = R.drawable.verified_fill0_wght400_grad0_opsz48_2,
                    width = PostToolbarSmallImg,
                    height =PostToolbarSmallImg

                )
            }



            Row(
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Text(
                    text = postModel.name,
                    fontSize = Fonts_Equal_11px,
                    color = GrayCB,
                    fontWeight = FontWeight.Medium,
                    lineHeight = Fonts_Equal_11px ,
                    fontFamily = proDisplay
                )


                Spacer(modifier = Modifier.width(extraSmall))

                Box(
                    modifier= Modifier
                        .size(PostToolbarSmallCircle)
                        .background(
                            color = GrayCB,
                            shape = CircleShape
                        )
                )


                Spacer(modifier = Modifier.width(extraSmall))


                Text(
                    text = postModel.time,
                    fontSize = Fonts_Equal_10px,
                    color = GrayCB,
                    fontWeight = FontWeight.Normal,
                    lineHeight = Fonts_Equal_10px ,
                    fontFamily = proDisplay
                )

            }

        }

        Spacer(modifier = Modifier
            .wrapContentHeight()
            .weight(1f))

        ImgBox(
            img = R.drawable.more,
            width = MoreSize,
            height = MoreSize
        )


    }




}