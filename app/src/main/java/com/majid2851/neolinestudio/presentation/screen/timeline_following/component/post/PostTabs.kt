package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.post

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.majid2851.neolinestudio.R

@Composable
fun PostTabs(
    onCommentClick:()->Unit
)
{
    Row(
        verticalAlignment = Alignment.CenterVertically
    )
    {
        TabItem(
            img = R.drawable.frame_180,
            title ="245K",
            onItemClick = {}
        )
        TabItem(
            img =R.drawable.frame_1802 ,
            title ="12",
            onItemClick={onCommentClick()}
        )
        TabItem(
            img = R.drawable.vector,
            title ="256K",
            onItemClick = {}
        )
        TabItem(
            img = R.drawable.frame_1803,
            title ="",
            onItemClick = {}
        )
        TabItem(
            img = R.drawable.vector2,
            title ="20K View",
            onItemClick = {}
        )


    }


}