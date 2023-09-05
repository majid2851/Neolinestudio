package com.majid2851.neolinestudio.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp


@Composable
fun ImgBox(
    img: Int
    ,tint: Color?=null
    ,width: Dp? = null
    ,height: Dp? = null
    ,padding: Dp?=null
    ,margin:Dp?=null
    ,widthScale:Float=1.0f
    ,corner:Dp?=null
    ,onClick:()->Unit={}
)
{
    val painter: Painter = painterResource(id = img)

    Box(
        modifier = Modifier
            .then(if (margin == null) Modifier.padding() else Modifier.padding(margin))
            .then(if (width == null) Modifier.fillMaxWidth() else Modifier.width(width))
            .then(if (height == null) Modifier.fillMaxHeight() else Modifier.height(height))
            .then(if (corner == null) Modifier
            else Modifier.background(
                shape = RoundedCornerShape(corner),
                color = Color.Transparent
            ))
//            .clickable {
//                onClick()
//            }
            .then(if (padding == null) Modifier.padding() else Modifier.padding(padding))
)
    {
        Image(
            painter = painter,
            contentDescription = null,
            colorFilter = if (tint!=null)
                ColorFilter.tint(tint)
            else null,
            modifier = Modifier
                .scale(widthScale)
                .fillMaxWidth()
                .fillMaxHeight()

        )
    }

}