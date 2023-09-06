package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.sheet_comment

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.majid2851.neolinestudio.R
import com.majid2851.neolinestudio.presentation.component.ImgBox
import com.majid2851.neolinestudio.presentation.theme.Black0D
import com.majid2851.neolinestudio.presentation.theme.Black3C
import com.majid2851.neolinestudio.presentation.theme.Dimen
import com.majid2851.neolinestudio.presentation.theme.Dimen.BidFieldCoinInfoWidth
import com.majid2851.neolinestudio.presentation.theme.Dimen.BidFieldHeight
import com.majid2851.neolinestudio.presentation.theme.Dimen.BorderSmallWidth
import com.majid2851.neolinestudio.presentation.theme.Dimen.BorderVerySmallWidth
import com.majid2851.neolinestudio.presentation.theme.Dimen.VeryHighCorner
import com.majid2851.neolinestudio.presentation.theme.PinkF3
import com.majid2851.neolinestudio.presentation.theme.White
import com.majid2851.neolinestudio.presentation.theme.White_Alpha30
import com.majid2851.neolinestudio.presentation.theme.proDisplay
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_14px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_17px
import com.majid2851.personalwallet.presentation.theme.St_Post
import com.walletline.android.presentation.theme.Padding.medium
import com.walletline.android.presentation.theme.Padding.small
import com.walletline.android.presentation.theme.Padding.veryExtraSmall

@Composable
fun AddComment(
    commentValue:String,
    onCommentChange:(String)->Unit
)
{
    Row(
        verticalAlignment = Alignment.CenterVertically
    )
    {
        ImgBox(
            img = R.drawable.test_profile,
            width = Dimen.PostToolbarImgSize,
            height = Dimen.PostToolbarImgSize
        )

        Spacer(modifier = Modifier.width(small))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(BidFieldHeight)
                .border(
                    color = White_Alpha30,
                    shape = RoundedCornerShape(VeryHighCorner),
                    width = BorderVerySmallWidth
                )
                .padding(
                    start = medium,
                    end = veryExtraSmall,
                    top = veryExtraSmall,
                    bottom = veryExtraSmall
                )
        )
        {
            BasicTextField(
                value = commentValue,
                onValueChange = {
                    onCommentChange(it)
                }
                , textStyle = TextStyle(
                    color = White,
                    fontSize = Fonts_Equal_14px,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = proDisplay ,
                    lineHeight = Fonts_Equal_17px
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterStart)

            )


            Box(
                modifier = Modifier
                    .width(BidFieldCoinInfoWidth)
                    .fillMaxHeight()
                    .background(
                        color = PinkF3,
                        shape = RoundedCornerShape(VeryHighCorner)
                    )
                    .align(Alignment.CenterEnd)

            )
            {

                Text(
                    text = St_Post,
                    color = White,
                    fontFamily = proDisplay,
                    fontWeight = FontWeight.Bold ,
                    fontSize = Fonts_Equal_14px,
                    lineHeight = Fonts_Equal_17px,
                    modifier = Modifier.align(Alignment.Center)


                )

            }



        }


    }



}
@Composable
@Preview
fun AddCommentPreview()
{
    AddComment(
        commentValue = "commentValue"
        , onCommentChange ={} )

}