package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.post

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import com.majid2851.neolinestudio.R
import com.majid2851.neolinestudio.data.local.timeline_following.postListData
import com.majid2851.neolinestudio.domain.model.PostData
import com.majid2851.neolinestudio.presentation.component.ImgBox
import com.majid2851.neolinestudio.presentation.theme.Blue03
import com.majid2851.neolinestudio.presentation.theme.Dimen.PostImgHeight
import com.majid2851.neolinestudio.presentation.theme.White
import com.majid2851.neolinestudio.presentation.theme.proDisplay
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_15px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_22px

@Composable
fun PostContent(
    postModel: PostData
)
{


    // Create an annotated string with customized styling for hashtags within a postModel.
    val combinedText = buildAnnotatedString {
        // Apply a style with white color to the entire text.
        withStyle(style = SpanStyle(
            color = White
        )) {
            // Append the original text from postModel.
            append(postModel.text)
        }

        // Define a regular expression to find hashtags (words starting with '#').
        val hashtagRegex = Regex("#\\w+")
        val hashtags = hashtagRegex.findAll(postModel.hashtak)
        var prevEnd = 0

        // Iterate through each hashtag found in the postModel.
        hashtags.forEachIndexed { index, result ->
            val start = result.range.first
            val end = result.range.last + 1 // Include the '#' in the span

            // Insert a space before hashtags (except the first one) for proper spacing.
            if (index > 0) {
                val space = " "
                append(space)
                prevEnd += space.length
            }

            // Apply a style with blue color to the hashtag, and add an annotation for future use.
            withStyle(style = SpanStyle(color = Blue03)) {
                addStringAnnotation(
                    tag = "hashtag",
                    start = start,
                    end = end,
                    annotation = ""
                )
                // Append the hashtag text with the specified style.
                append(postModel.hashtak.substring(start, end))
            }
        }
    }

// Create a remember block to store the generated annotated string for later use.
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
        img = postModel.postImg,
        height = PostImgHeight
    )




}

@Composable
@Preview
fun PostContentPreview()
{
    PostContent(postModel = postListData.get(0))
}