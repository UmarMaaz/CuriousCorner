package com.nexgen.curiouscorner.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView


// Define the ad unit ID constant once at the top
const val BANNER_AD_UNIT_ID = "ca-app-pub-3940256099942544/6300978111" // Replace with your actual Ad Unit ID

@Composable
fun BannerAdView(
    adSize: AdSize = AdSize.BANNER, // Default to standard banner, changeable to other sizes
    modifier: Modifier = Modifier
) {
    AndroidView(
        modifier = modifier,
        factory = { context ->
            AdView(context).apply {
                setAdSize(adSize)
                adUnitId = BANNER_AD_UNIT_ID
                loadAd(AdRequest.Builder().build())
            }
        }
    )
}