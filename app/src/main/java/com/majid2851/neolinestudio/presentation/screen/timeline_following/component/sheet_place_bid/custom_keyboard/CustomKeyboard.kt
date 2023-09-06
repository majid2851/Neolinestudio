package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.sheet_place_bid.custom_keyboard

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.majid2851.neolinestudio.R
import com.majid2851.neolinestudio.presentation.component.ImgBox
import com.majid2851.neolinestudio.presentation.theme.Black
import com.majid2851.neolinestudio.presentation.theme.Dimen
import com.majid2851.neolinestudio.presentation.theme.Dimen.KeySymbolWidth
import com.majid2851.neolinestudio.presentation.theme.White_Alpha30
import com.majid2851.personalwallet.presentation.theme.ABC
import com.majid2851.personalwallet.presentation.theme.DEF
import com.majid2851.personalwallet.presentation.theme.GHI
import com.majid2851.personalwallet.presentation.theme.JKL
import com.majid2851.personalwallet.presentation.theme.MNO
import com.majid2851.personalwallet.presentation.theme.PQRS
import com.majid2851.personalwallet.presentation.theme.TUV
import com.majid2851.personalwallet.presentation.theme.WXYZ
import com.walletline.android.presentation.theme.Padding.extraSmall

@Composable
fun CustomKeyboard(
    offerFieldFocused: Boolean,
    onNumClick:(String)->Unit,
    onDeleteClick:()->Unit
)
{
    if (offerFieldFocused==true)
    {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Black)
                .padding(extraSmall),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Row()
            {
                Key(
                    number = "1",
                    textValue = "",
                    onNumClick = { onNumClick("1") }
                )
                Key(
                    number = "2",
                    textValue = ABC,
                    onNumClick = { onNumClick("2") }
                )
                Key(
                    number = "3",
                    textValue = DEF,
                    onNumClick = { onNumClick("3") }
                )
            }
            Row()
            {
                Key(
                    number = "4",
                    textValue = GHI,
                    onNumClick = { onNumClick("4") }
                )
                Key(
                    number = "5",
                    textValue = JKL,
                    onNumClick = { onNumClick("5") }
                )
                Key(
                    number = "6",
                    textValue = MNO,
                    onNumClick = { onNumClick("6") }
                )

            }
            Row()
            {
                Key(
                    number = "7",
                    textValue = PQRS,
                    onNumClick = { onNumClick("7") }
                )
                Key(
                    number = "8",
                    textValue = TUV,
                    onNumClick = { onNumClick("8") }
                )
                Key(
                    number = "9",
                    textValue = WXYZ,
                    onNumClick = { onNumClick("9") }
                )

            }
            Row()
            {
                Key(
                    number = "",
                    textValue = "",
                    backgroundColor = Black,
                    onNumClick = { }
                )

                Key(
                    number = "0",
                    textValue = DEF,
                    onNumClick = { onNumClick("0") }
                )

                Column(
                    modifier = Modifier
                        .padding(extraSmall)
                        .fillMaxWidth()
                        .height(Dimen.KeyHeight)
                        .clickable {
                            onDeleteClick()
                        }

                    ,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                )
                {
                    ImgBox(
                        img = R.drawable.symbol,
                        width = KeySymbolWidth,
                    )
                }

            }



        }
    }
}
@Composable
@Preview
fun CustomKeyboardPreview()
{
    CustomKeyboard(
        offerFieldFocused=true,
        onNumClick={},
        onDeleteClick={}
    )
}
