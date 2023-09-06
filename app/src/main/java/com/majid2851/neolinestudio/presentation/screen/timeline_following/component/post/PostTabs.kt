package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.post

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.majid2851.neolinestudio.R
import com.majid2851.neolinestudio.data.local.timeline_following.postListData
import com.majid2851.neolinestudio.domain.model.PostData

@Composable
fun PostTabs(
    onCommentClick: () -> Unit,
    postModel: PostData
)
{
    Row(
        verticalAlignment = Alignment.CenterVertically
    )
    {
        TabItem(
            img = R.drawable.frame_180,
            title =postModel.likes,
            onItemClick = {}
        )
        TabItem(
            img =R.drawable.frame_1802 ,
            title =postModel.commentsNum,
            onItemClick={onCommentClick()}
        )
        TabItem(
            img = R.drawable.vector,
            title =postModel.repostNum,
            onItemClick = {}
        )
        TabItem(
            img = R.drawable.frame_1803,
            title ="",
            onItemClick = {}
        )
        TabItem(
            img = R.drawable.vector2,
            title =postModel.viewNum,
            onItemClick = {}
        )


    }


}
@Composable
@Preview
fun PostTabsPreview()
{
    PostTabs(
        onCommentClick = {  },
        postModel = postListData.get(0) )

}