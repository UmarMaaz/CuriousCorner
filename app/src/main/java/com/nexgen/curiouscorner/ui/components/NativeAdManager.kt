package com.nexgen.curiouscorner.ui.components

import android.content.Context
import android.util.Log
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdLoader
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.nativead.NativeAd

object NativeAdManager {
    private var nativeAd: NativeAd? = null

    fun loadAd(context: Context) {
        val adLoader = AdLoader.Builder(context, "ca-app-pub-3940256099942544/2247696110")
            .forNativeAd { ad: NativeAd ->
                nativeAd?.destroy() // Clear the old ad before showing the new one
                nativeAd = ad
            }
            .withAdListener(object : AdListener() {
                override fun onAdFailedToLoad(adError: LoadAdError) {
                    Log.e("AdManager", "Failed to load native ad: ${adError.message}")
                }
            })
            .build()

        adLoader.loadAd(AdRequest.Builder().build())
    }

    fun getNativeAd(): NativeAd? {
        return nativeAd
    }

    fun destroyNativeAd() {
        nativeAd?.destroy()
    }
}
