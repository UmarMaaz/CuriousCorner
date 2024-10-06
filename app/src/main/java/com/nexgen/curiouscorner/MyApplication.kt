package com.nexgen.curiouscorner

import android.app.Application
import com.google.android.gms.ads.MobileAds

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // Initialize Mobile Ads
        MobileAds.initialize(this) {}

        // Setup any other necessary global configurations
    }
}
