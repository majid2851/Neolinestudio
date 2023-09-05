package com.walletline.android.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.majid2851.neolinestudio.R
import com.majid2851.neolinestudio.presentation.util.ssp

val proDisplay = FontFamily(
    Font(R.font.sf_pro_display_medium, weight = FontWeight.Bold),
    Font(R.font.sf_pro_display_medium, weight = FontWeight.Normal),
)

@Composable
fun myTypography(): Typography =
     Typography(
        titleLarge = TextStyle(
            fontFamily = proDisplay,
            fontWeight = FontWeight.Bold,
            fontSize = 35.ssp,
            lineHeight = 45.ssp,
        ),
        titleMedium = TextStyle(
            fontFamily = proDisplay,
            fontWeight = FontWeight.Bold,
            fontSize = 25.ssp,
            lineHeight = 31.ssp,
        ),
        titleSmall = TextStyle(
            fontFamily = proDisplay,
            fontWeight = FontWeight.Normal,
            fontSize = 24.ssp,
            lineHeight = 31.ssp,
        ),
         bodyLarge = TextStyle(
             fontFamily = proDisplay,
             fontWeight = FontWeight.Bold,
             fontSize = 17.ssp,
             lineHeight = 25.ssp
         ),
        bodyMedium = TextStyle(
            fontFamily = proDisplay,
            fontWeight = FontWeight.Medium,
            fontSize = 15.ssp,
            lineHeight = 25.ssp,
        ),
        bodySmall = TextStyle(
            fontFamily = proDisplay,
            fontWeight = FontWeight.Bold,
            fontSize = 13.ssp,
            lineHeight = 20.ssp,
        ),
        labelSmall = TextStyle(
            fontFamily = proDisplay,
            fontWeight = FontWeight.Medium,
            fontSize = 12.ssp,
            lineHeight = 16.ssp,
        )
    )



