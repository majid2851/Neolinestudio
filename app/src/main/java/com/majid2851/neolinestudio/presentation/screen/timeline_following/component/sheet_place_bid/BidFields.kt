package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.sheet_place_bid

import androidx.compose.foundation.background
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
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.majid2851.neolinestudio.R
import com.majid2851.neolinestudio.presentation.component.ImgBox
import com.majid2851.neolinestudio.presentation.theme.Dimen.BidFieldHeight
import com.majid2851.neolinestudio.presentation.theme.Dimen.VeryHighCorner
import com.majid2851.neolinestudio.presentation.theme.White
import com.majid2851.neolinestudio.presentation.theme.Black0D
import com.majid2851.neolinestudio.presentation.theme.Black3C
import com.majid2851.neolinestudio.presentation.theme.Dimen.BidFieldCoinImgSize
import com.majid2851.neolinestudio.presentation.theme.Dimen.BidFieldCoinInfoWidth
import com.majid2851.neolinestudio.presentation.theme.Dimen.BidMinPriceTvHeight
import com.majid2851.neolinestudio.presentation.theme.White50
import com.majid2851.neolinestudio.presentation.theme.proDisplay
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_14px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_16px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_17px
import com.majid2851.personalwallet.presentation.theme.St_Price
import com.majid2851.personalwallet.presentation.theme.St_SubmitBid
import com.walletline.android.presentation.theme.Padding
import com.walletline.android.presentation.theme.Padding.extraSmall
import com.walletline.android.presentation.theme.Padding.medium
import com.walletline.android.presentation.theme.Padding.small
import com.walletline.android.presentation.theme.Padding.veryExtraSmall

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun BidFields(
    newPrice: String,
    offerFieldFocused: Boolean,
    onOfferFieldFocuse:()->Unit,
    onSubmitBidClick:()->Unit
)
{
    val keyboardController = LocalSoftwareKeyboardController.current
    keyboardController?.hide()

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(BidFieldHeight)
            .background(
                color = White,
                shape = RoundedCornerShape(VeryHighCorner)
            )
            .padding(
                start = medium,
                end = medium
            )
    )
    {
        Text(
            text = St_Price,
            fontFamily = proDisplay,
            fontWeight = FontWeight.SemiBold,
            fontSize = Fonts_Equal_14px,
            lineHeight = Fonts_Equal_17px,
            color = Black0D,
            modifier = Modifier.align(Alignment.CenterStart)
        )

        Text(
            text = "0.05 ETH",
            fontFamily = proDisplay,
            fontWeight = FontWeight.SemiBold,
            fontSize = Fonts_Equal_14px,
            lineHeight = Fonts_Equal_17px,
            color = Black0D,
            modifier = Modifier.align(Alignment.CenterEnd)
        )



    }


    Spacer(modifier = Modifier.height(Padding.small))



    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(BidFieldHeight)
            .background(
                color = White,
                shape = RoundedCornerShape(VeryHighCorner)
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
            value = newPrice,
            onValueChange = {

            }
            , textStyle = TextStyle(
                color = Black0D,
                fontSize = Fonts_Equal_14px,
                fontWeight = FontWeight.SemiBold,
                fontFamily = proDisplay ,
                lineHeight = Fonts_Equal_17px
            ),
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterStart)
                .onFocusEvent {
                    keyboardController?.hide()
                }
                .onFocusChanged {
                    keyboardController?.hide()
                    if (it.hasFocus == true) {
                        onOfferFieldFocuse()
                    }
                }
        )


        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement =Arrangement.Center,
            modifier = Modifier
                .width(BidFieldCoinInfoWidth)
                .fillMaxHeight()
                .background(
                    color = Black3C,
                    shape = RoundedCornerShape(VeryHighCorner)
                )
                .align(Alignment.CenterEnd)

        )
        {
            ImgBox(
                img = R.drawable.group,
                width = BidFieldCoinImgSize,
                height = BidFieldCoinImgSize,
            )
            
            Spacer(modifier = Modifier.width(extraSmall))

            Text(
                text = "ETH",
                color = White,
                fontFamily = proDisplay,
                fontWeight = FontWeight.Bold ,
                fontSize = Fonts_Equal_14px,
                lineHeight = Fonts_Equal_17px


            )

        }



    }


    Spacer(modifier = Modifier.height(Padding.extraSmall))

    if (offerFieldFocused==true)
    {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(BidMinPriceTvHeight)
                .padding(start = small)
        )
        {
            Text(
                text="Min Price 0.06 ETH",
                fontWeight = FontWeight.Normal,
                fontFamily = proDisplay,
                fontSize = Fonts_Equal_14px,
                color = White50,
                lineHeight = Fonts_Equal_16px,
                modifier = Modifier.align(Alignment.CenterStart)

            )
        }
    }



    Spacer(modifier = Modifier.height(Padding.extraSmall))

    BidSubmit(
        onSubmitClick = {onSubmitBidClick() },
        title = St_SubmitBid
    )

}

@Preview
@Composable
fun BidFieldsPreview()
{
    BidFields(
        newPrice="46",
        offerFieldFocused=true,
        onOfferFieldFocuse={},
        onSubmitBidClick={}
    )
}
