package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.post

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.majid2851.neolinestudio.domain.model.PostData
import com.majid2851.neolinestudio.presentation.theme.Black14
import com.majid2851.neolinestudio.presentation.theme.Dimen.MediumCorner
import com.walletline.android.presentation.theme.Padding.extraSmall
import com.walletline.android.presentation.theme.Padding.small

@Composable
fun Post(
    postModel:PostData,
    showBid:Boolean=true,
    onBidClick:()->Unit,
    onCommentClick:()->Unit
)
{
    Column(
        modifier = Modifier
            .padding(small)
            .background(
                color = Black14,
                shape = RoundedCornerShape(MediumCorner)
            )
            .padding(small)
    )
    {

        PostToolbar(postModel=postModel)

        Spacer(modifier = Modifier.height(extraSmall))

        PostContent(
            postModel=postModel,
        )

        PostTabs(
            postModel=postModel,
            onCommentClick={
                onCommentClick()
            }
        )

        PostDate(
            show = showBid,
            onBidClick = {
                onBidClick()
            }
        )

    }



}