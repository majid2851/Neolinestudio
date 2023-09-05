package com.majid2851.neolinestudio.presentation.screen.timeline_following.component.sheet_bid

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.majid2851.neolinestudio.presentation.screen.timeline_following.component.custom_keyboard.CustomKeyboard
import com.majid2851.neolinestudio.presentation.theme.Black
import com.majid2851.neolinestudio.presentation.theme.Black14
import com.majid2851.neolinestudio.presentation.theme.Dimen.BidSheetTobBoxHeight
import com.majid2851.neolinestudio.presentation.theme.Dimen.BidSheetTopBoxWidth
import com.majid2851.neolinestudio.presentation.theme.Dimen.HighCorner
import com.majid2851.neolinestudio.presentation.theme.Dimen.MediumCorner
import com.majid2851.neolinestudio.presentation.theme.White
import com.majid2851.neolinestudio.presentation.theme.proDisplay
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_10px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_16px
import com.majid2851.personalwallet.presentation.theme.Fonts_Equal_24px
import com.majid2851.personalwallet.presentation.theme.St_BidPlace
import com.walletline.android.presentation.theme.Padding.medium
import com.walletline.android.presentation.theme.Padding.small

@Composable
fun BidSheet(
    offerFieldFocused: Boolean,
    onOfferFieldFocus: ()->Unit,
    newPriceValue:String,
    onNumClick:(String)->Unit,
    onDeleteClick:()->Unit,
    onSubmitBidClick:()->Unit
)
{
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Black14,
                shape = RoundedCornerShape(
                    topStart = HighCorner,
                    topEnd = HighCorner
                )
            )
            .padding(small)
        , horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Spacer(modifier = Modifier.height(small))
        Box(
            modifier = Modifier
                .width(BidSheetTopBoxWidth)
                .height(BidSheetTobBoxHeight)
                .background(color = Black)
        )


        Spacer(modifier = Modifier.height(medium))

        
        Text(
            text = St_BidPlace ,
            color = White,
            fontSize = Fonts_Equal_24px ,
            fontWeight = FontWeight.Bold,
            fontFamily = proDisplay,
            lineHeight = Fonts_Equal_10px
        )

        Spacer(modifier = Modifier.height(medium))

        Text(
            text = St_BidPlace ,
            color = White,
            fontSize = Fonts_Equal_16px ,
            fontWeight = FontWeight.Normal,
            fontFamily = proDisplay,
            lineHeight = Fonts_Equal_10px
        )

        BidToolbar()


        Spacer(modifier = Modifier.height(small))

        BidFields(
            newPrice = newPriceValue,
            offerFieldFocused=offerFieldFocused,
            onOfferFieldFocuse ={
                onOfferFieldFocus()
            },
            onSubmitBidClick={
                onSubmitBidClick()
            }
        )
        
        Spacer(modifier = Modifier.height(medium))

        HideNft()


        Spacer(modifier = Modifier.height(medium))

        CustomKeyboard(
            offerFieldFocused=offerFieldFocused,
            onNumClick={
                onNumClick(it)
            },
            onDeleteClick = {
                onDeleteClick()
            }
        )
    }





}