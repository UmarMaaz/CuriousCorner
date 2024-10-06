package com.nexgen.curiouscorner

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.android.gms.ads.nativead.NativeAd
import com.google.android.gms.ads.nativead.NativeAdView
import com.nexgen.curiouscorner.ui.components.AdManager
import com.nexgen.curiouscorner.ui.components.NativeAdManager
import com.nexgen.curiouscorner.ui.screens.A_Screen
import com.nexgen.curiouscorner.ui.screens.B_Screen
import com.nexgen.curiouscorner.ui.screens.C_Screen
import com.nexgen.curiouscorner.ui.screens.D_Screen
import com.nexgen.curiouscorner.ui.screens.E_Screen
import com.nexgen.curiouscorner.ui.screens.F_Screen
import com.nexgen.curiouscorner.ui.screens.G_Screen
import com.nexgen.curiouscorner.ui.screens.H_Screen
import com.nexgen.curiouscorner.ui.screens.HomeScreen
import com.nexgen.curiouscorner.ui.screens.I_Screen
import com.nexgen.curiouscorner.ui.screens.J_Screen
import com.nexgen.curiouscorner.ui.screens.K_Screen
import com.nexgen.curiouscorner.ui.screens.L_Screen
import com.nexgen.curiouscorner.ui.screens.LowerCaseLetterScreen
import com.nexgen.curiouscorner.ui.screens.M_Screen
import com.nexgen.curiouscorner.ui.screens.N_Screen
import com.nexgen.curiouscorner.ui.screens.NumberScreen
import com.nexgen.curiouscorner.ui.screens.O_Screen
import com.nexgen.curiouscorner.ui.screens.OnboardingScreen1
import com.nexgen.curiouscorner.ui.screens.OnboardingScreen2
import com.nexgen.curiouscorner.ui.screens.OnboardingScreen3
import com.nexgen.curiouscorner.ui.screens.P_Screen
import com.nexgen.curiouscorner.ui.screens.Q_Screen
import com.nexgen.curiouscorner.ui.screens.R_Screen
import com.nexgen.curiouscorner.ui.screens.S_Screen
import com.nexgen.curiouscorner.ui.screens.SplashScreen
import com.nexgen.curiouscorner.ui.screens.T_Screen
import com.nexgen.curiouscorner.ui.screens.U_Screen
import com.nexgen.curiouscorner.ui.screens.UpperCaseLetterScreen
import com.nexgen.curiouscorner.ui.screens.UrduAlphabetScreen
import com.nexgen.curiouscorner.ui.screens.V_Screen
import com.nexgen.curiouscorner.ui.screens.W_Screen
import com.nexgen.curiouscorner.ui.screens.X_Screen
import com.nexgen.curiouscorner.ui.screens.Y_Screen
import com.nexgen.curiouscorner.ui.screens.Z_Screen
import com.nexgen.curiouscorner.ui.screens.ain_Screen
import com.nexgen.curiouscorner.ui.screens.alif_Screen
import com.nexgen.curiouscorner.ui.screens.be_Screen
import com.nexgen.curiouscorner.ui.screens.che_Screen
import com.nexgen.curiouscorner.ui.screens.daaal_Screen
import com.nexgen.curiouscorner.ui.screens.daal_Screen
import com.nexgen.curiouscorner.ui.screens.duaad_Screen
import com.nexgen.curiouscorner.ui.screens.fa_Screen
import com.nexgen.curiouscorner.ui.screens.gaaf_Screen
import com.nexgen.curiouscorner.ui.screens.ghen_Screen
import com.nexgen.curiouscorner.ui.screens.ha_Screen
import com.nexgen.curiouscorner.ui.screens.haa_Screen
import com.nexgen.curiouscorner.ui.screens.haaa_Screen
import com.nexgen.curiouscorner.ui.screens.jeem_Screen
import com.nexgen.curiouscorner.ui.screens.kaaf_Screen
import com.nexgen.curiouscorner.ui.screens.kha_Screen
import com.nexgen.curiouscorner.ui.screens.laam_Screen
import com.nexgen.curiouscorner.ui.screens.meem_Screen
import com.nexgen.curiouscorner.ui.screens.no10_Screen
import com.nexgen.curiouscorner.ui.screens.no1_Screen
import com.nexgen.curiouscorner.ui.screens.no2_Screen
import com.nexgen.curiouscorner.ui.screens.no3_Screen
import com.nexgen.curiouscorner.ui.screens.no4_Screen
import com.nexgen.curiouscorner.ui.screens.no5_Screen
import com.nexgen.curiouscorner.ui.screens.no6_Screen
import com.nexgen.curiouscorner.ui.screens.no7_Screen
import com.nexgen.curiouscorner.ui.screens.no8_Screen
import com.nexgen.curiouscorner.ui.screens.no9_Screen
import com.nexgen.curiouscorner.ui.screens.noon_Screen
import com.nexgen.curiouscorner.ui.screens.pe_Screen
import com.nexgen.curiouscorner.ui.screens.qaaf_Screen
import com.nexgen.curiouscorner.ui.screens.raa_Screen
import com.nexgen.curiouscorner.ui.screens.raaa_Screen
import com.nexgen.curiouscorner.ui.screens.saad_Screen
import com.nexgen.curiouscorner.ui.screens.se_Screen
import com.nexgen.curiouscorner.ui.screens.seen_Screen
import com.nexgen.curiouscorner.ui.screens.sheen_Screen
import com.nexgen.curiouscorner.ui.screens.small_A_Screen
import com.nexgen.curiouscorner.ui.screens.small_B_Screen
import com.nexgen.curiouscorner.ui.screens.small_C_Screen
import com.nexgen.curiouscorner.ui.screens.small_D_Screen
import com.nexgen.curiouscorner.ui.screens.small_E_Screen
import com.nexgen.curiouscorner.ui.screens.small_F_Screen
import com.nexgen.curiouscorner.ui.screens.small_G_Screen
import com.nexgen.curiouscorner.ui.screens.small_H_Screen
import com.nexgen.curiouscorner.ui.screens.small_I_Screen
import com.nexgen.curiouscorner.ui.screens.small_J_Screen
import com.nexgen.curiouscorner.ui.screens.small_K_Screen
import com.nexgen.curiouscorner.ui.screens.small_L_Screen
import com.nexgen.curiouscorner.ui.screens.small_M_Screen
import com.nexgen.curiouscorner.ui.screens.small_N_Screen
import com.nexgen.curiouscorner.ui.screens.small_O_Screen
import com.nexgen.curiouscorner.ui.screens.small_P_Screen
import com.nexgen.curiouscorner.ui.screens.small_Q_Screen
import com.nexgen.curiouscorner.ui.screens.small_R_Screen
import com.nexgen.curiouscorner.ui.screens.small_S_Screen
import com.nexgen.curiouscorner.ui.screens.small_T_Screen
import com.nexgen.curiouscorner.ui.screens.small_U_Screen
import com.nexgen.curiouscorner.ui.screens.small_V_Screen
import com.nexgen.curiouscorner.ui.screens.small_W_Screen
import com.nexgen.curiouscorner.ui.screens.small_X_Screen
import com.nexgen.curiouscorner.ui.screens.small_Y_Screen
import com.nexgen.curiouscorner.ui.screens.small_Z_Screen
import com.nexgen.curiouscorner.ui.screens.taa_Screen
import com.nexgen.curiouscorner.ui.screens.te_Screen
import com.nexgen.curiouscorner.ui.screens.toa_Screen
import com.nexgen.curiouscorner.ui.screens.wow_Screen
import com.nexgen.curiouscorner.ui.screens.ya_Screen
import com.nexgen.curiouscorner.ui.screens.yaa_Screen
import com.nexgen.curiouscorner.ui.screens.zaa_Screen
import com.nexgen.curiouscorner.ui.screens.zaal_Screen
import com.nexgen.curiouscorner.ui.screens.zhe_Screen
import com.nexgen.curiouscorner.ui.screens.zoa_Screen
import com.nexgen.curiouscorner.ui.theme.CuriousCornerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AdManager.loadAd(this)
        // Add delay before loading native ad
        Handler(Looper.getMainLooper()).postDelayed({
            NativeAdManager.loadAd(this)
        }, 3000) // 3 seconds delay (3000 milliseconds)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CuriousCornerTheme {
                AppNavigation()
            }
        }
    }
    override fun onResume() {
        super.onResume()
        AdManager.loadAd(this)
    }
    override fun onDestroy() {
        super.onDestroy()
        NativeAdManager.destroyNativeAd() // Make sure to clean up
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    // Handle back press
    BackHandler(enabled = navController.currentDestination?.route != "home") {
        navController.navigate("home") {
            // Clear the back stack and prevent going back to the previous screen
            popUpTo(navController.graph.startDestinationId) { inclusive = true }
        }
    }

    NavHost(navController = navController, startDestination = "splash_screen") {
        composable("splash_screen") { SplashScreen(onSplashComplete = { navController.navigate("onboard1") }) }
        composable("onboard1") { OnboardingScreen1(navController) }
        composable("onboard2") { OnboardingScreen2(navController) }
        composable("onboard3") { OnboardingScreen3(navController) }
        composable("home") { HomeScreen(navController) }
        composable("upper_case_letter_screen") { UpperCaseLetterScreen(navController) }
        composable("lower_case_letter_screen") { LowerCaseLetterScreen(navController) }
        composable("number_screen") { NumberScreen(navController) }
        composable("urdu_letter_screen") { UrduAlphabetScreen(navController) }
        composable("a_screen"){ A_Screen(navController) }
        composable("b_screen"){ B_Screen(navController) }
        composable("c_screen"){ C_Screen(navController) }
        composable("d_screen"){ D_Screen(navController) }
        composable("e_screen"){ E_Screen(navController) }
        composable("f_screen"){ F_Screen(navController) }
        composable("g_screen"){ G_Screen(navController) }
        composable("h_screen"){ H_Screen(navController) }
        composable("i_screen"){ I_Screen(navController) }
        composable("j_screen"){ J_Screen(navController) }
        composable("k_screen"){ K_Screen(navController) }
        composable("l_screen"){ L_Screen(navController) }
        composable("m_screen"){ M_Screen(navController) }
        composable("n_screen"){ N_Screen(navController) }
        composable("o_screen"){ O_Screen(navController) }
        composable("p_screen"){ P_Screen(navController) }
        composable("q_screen"){ Q_Screen(navController) }
        composable("r_screen"){ R_Screen(navController) }
        composable("s_screen"){ S_Screen(navController) }
        composable("t_screen"){ T_Screen(navController) }
        composable("u_screen"){ U_Screen(navController) }
        composable("v_screen"){ V_Screen(navController) }
        composable("w_screen"){ W_Screen(navController) }
        composable("x_screen"){ X_Screen(navController) }
        composable("y_screen"){ Y_Screen(navController) }
        composable("z_screen"){ Z_Screen(navController) }
        composable("no1_screen"){ no1_Screen(navController) }
        composable("no2_screen"){ no2_Screen(navController) }
        composable("no3_screen"){ no3_Screen(navController) }
        composable("no4_screen"){ no4_Screen(navController) }
        composable("no5_screen"){ no5_Screen(navController) }
        composable("no6_screen"){ no6_Screen(navController) }
        composable("no7_screen"){ no7_Screen(navController) }
        composable("no8_screen"){ no8_Screen(navController) }
        composable("no9_screen"){ no9_Screen(navController) }
        composable("no10_screen"){ no10_Screen(navController) }
        composable("small_a_screen"){ small_A_Screen(navController) }
        composable("small_b_screen"){ small_B_Screen(navController) }
        composable("small_c_screen"){ small_C_Screen(navController) }
        composable("small_d_screen"){ small_D_Screen(navController) }
        composable("small_e_screen"){ small_E_Screen(navController) }
        composable("small_f_screen"){ small_F_Screen(navController) }
        composable("small_g_screen"){ small_G_Screen(navController) }
        composable("small_h_screen"){ small_H_Screen(navController) }
        composable("small_i_screen"){ small_I_Screen(navController) }
        composable("small_j_screen"){ small_J_Screen(navController) }
        composable("small_k_screen"){ small_K_Screen(navController) }
        composable("small_l_screen"){ small_L_Screen(navController) }
        composable("small_m_screen"){ small_M_Screen(navController) }
        composable("small_n_screen"){ small_N_Screen(navController) }
        composable("small_o_screen"){ small_O_Screen(navController) }
        composable("small_p_screen"){ small_P_Screen(navController) }
        composable("small_q_screen"){ small_Q_Screen(navController) }
        composable("small_r_screen"){ small_R_Screen(navController) }
        composable("small_s_screen"){ small_S_Screen(navController) }
        composable("small_t_screen"){ small_T_Screen(navController) }
        composable("small_u_screen"){ small_U_Screen(navController) }
        composable("small_v_screen"){ small_V_Screen(navController) }
        composable("small_w_screen"){ small_W_Screen(navController) }
        composable("small_x_screen"){ small_X_Screen(navController) }
        composable("small_y_screen"){ small_Y_Screen(navController) }
        composable("small_z_screen"){ small_Z_Screen(navController) }
        composable("alif_screen"){ alif_Screen(navController) }
        composable("baa_screen"){ be_Screen(navController) }
        composable("paa_screen"){ pe_Screen(navController) }
        composable("ta_screen"){ te_Screen(navController) }
        composable("taa_screen"){ taa_Screen(navController) }
        composable("saa_screen"){ se_Screen(navController) }
        composable("jeem_screen"){ jeem_Screen(navController) }
        composable("che_screen"){ che_Screen(navController) }
        composable("ha_screen"){ ha_Screen(navController) }
        composable("kha_screen"){ kha_Screen(navController) }
        composable("daal_screen"){ daal_Screen(navController) }
        composable("daaal_screen"){ daaal_Screen(navController) }
        composable("zaal_screen"){ zaal_Screen(navController) }
        composable("raa_screen"){ raa_Screen(navController) }
        composable("zaa_screen"){ zaa_Screen(navController) }
        composable("seen_screen"){ seen_Screen(navController) }
        composable("sheen_screen"){ sheen_Screen(navController) }
        composable("saad_screen"){ saad_Screen(navController) }
        composable("duaad_screen"){ duaad_Screen(navController) }
        composable("toa_screen"){ toa_Screen(navController) }
        composable("zoa_screen"){ zoa_Screen(navController) }
        composable("ain_screen"){ ain_Screen(navController) }
        composable("ghen_screen"){ ghen_Screen(navController) }
        composable("fa_screen"){ fa_Screen(navController) }
        composable("qaaf_screen"){ qaaf_Screen(navController) }
        composable("kaaf_screen"){ kaaf_Screen(navController) }
        composable("gaaf_screen"){ gaaf_Screen(navController) }
        composable("laam_screen"){ laam_Screen(navController) }
        composable("meem_screen"){ meem_Screen(navController) }
        composable("noon_screen"){ noon_Screen(navController) }
        composable("wow_screen"){ wow_Screen(navController) }
        composable("haaa_screen"){ haaa_Screen(navController) }
        composable("haa_screen"){ haa_Screen(navController) }
        composable("ya_screen"){ ya_Screen(navController) }
        composable("yaa_screen"){ yaa_Screen(navController) }
        composable("zhe_screen"){ zhe_Screen(navController) }
        composable("raaa_screen"){ raaa_Screen(navController) }
    }

}

@Composable
fun NativeAdView(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val nativeAd = NativeAdManager.getNativeAd()

    if (nativeAd != null) {
        AndroidView(
            modifier = modifier,
            factory = { ctx ->
                val adView = LayoutInflater.from(ctx).inflate(R.layout.native_ad_layout, null) as NativeAdView
                populateNativeAdView(nativeAd, adView)
                adView
            }
        )
    } else {
        Text("Ad loading...")
    }
}

fun populateNativeAdView(nativeAd: NativeAd, adView: NativeAdView) {
    // Set the headline
    val headlineView = adView.findViewById<TextView>(R.id.ad_headline)
    headlineView.text = nativeAd.headline
    adView.headlineView = headlineView

    // Set the body
    val bodyView = adView.findViewById<TextView>(R.id.ad_body)
    if (nativeAd.body != null) {
        bodyView.text = nativeAd.body
        bodyView.visibility = View.VISIBLE
    } else {
        bodyView.visibility = View.GONE
    }
    adView.bodyView = bodyView

    // Set the image
    val imageView = adView.findViewById<ImageView>(R.id.ad_image)
    val images = nativeAd.images
    if (images != null && images.isNotEmpty()) {
        imageView.setImageDrawable(images[0].drawable)
        imageView.visibility = View.VISIBLE
    } else {
        imageView.visibility = View.GONE
    }
    adView.imageView = imageView

    // Set the call to action button
    val callToActionView = adView.findViewById<Button>(R.id.ad_call_to_action)
    if (nativeAd.callToAction != null) {
        callToActionView.text = nativeAd.callToAction
        callToActionView.visibility = View.VISIBLE
    } else {
        callToActionView.visibility = View.GONE
    }
    adView.callToActionView = callToActionView
}

