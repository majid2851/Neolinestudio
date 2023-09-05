package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.post

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import com.majid2851.neolinestudio.R
import com.majid2851.neolinestudio.presentation.component.ImgBox
import com.majid2851.neolinestudio.presentation.theme.Blue03
import com.majid2851.neolinestudio.presentation.theme.Dimen.PostImgHeight
import com.majid2851.neolinestudio.presentation.theme.White
import com.majid2851.neolinestudio.presentation.theme.proDisplay
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_15px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_16px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_22px

@Composable
fun PostContent(
     text1:String,
     hashtack:String
)
{


    val combinedText = buildAnnotatedString {
        withStyle(style = SpanStyle(
            color = White

        )) {
            append(text1)
        }

        val hashtagRegex = Regex("#\\w+")
        val hashtags = hashtagRegex.findAll(hashtack)
        var prevEnd=0
        hashtags.forEachIndexed() { index,result ->
            val start = result.range.first
            val end = result.range.last + 1 // Include the '#' in the span

            if (index > 0) {
                val space = " "
                append(space)
                prevEnd += space.length
            }

            withStyle(style = SpanStyle(color = Blue03)) {
                addStringAnnotation(
                    tag = "hashtag",
                    start = start,
                    end = end,
                    annotation = ""
                )
                append(hashtack.substring(start, end))
            }
        }
    }

    val annotatedString = remember { combinedText }



    Text(
        text =annotatedString ,
        color = White,
        fontSize = Fonts_Equal_15px,
        fontFamily = proDisplay,
        fontWeight = FontWeight.Normal,
        lineHeight = Fonts_Equal_22px,
    )

    ImgBox(
        img = R.drawable.frame_6714,
        height = PostImgHeight
    )




}