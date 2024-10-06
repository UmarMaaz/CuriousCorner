package com.nexgen.curiouscorner.ui.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.android.gms.ads.AdSize
import com.nexgen.curiouscorner.NativeAdView
import com.nexgen.curiouscorner.R
import com.nexgen.curiouscorner.ui.components.BannerAdView

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UrduAlphabetScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Urdu Letter's",
                        color = Color.White,
                        fontFamily = FontFamily(Font(R.font.interbold)),
                        style = MaterialTheme.typography.headlineSmall
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate("home") }) {
                        Icon(
                            painter = painterResource(id = R.drawable.back_arrow),
                            contentDescription = "Navigation Icon",
                            tint = Color.White
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* Handle more icon click */ }) {
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = "More Icon",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color(0xFF1A61A5) // Top bar background color
                )
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.Transparent, // Bottom bar background color
            ) {
                BannerAdView(adSize = AdSize.FULL_BANNER,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp), // Adjust the height of the ad view as needed
                )
            }
        },
        content = { padding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFFFFFFF)) // Background color with transparency
                    .padding(padding)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.Center
                ) {
                    NativeAdView(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    )
                    // Create a list of rows with images for Urdu letters or numbers
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly // Space evenly
                    ) {
                        UrduImageBox(imageResId = R.drawable.taa) { navController.navigate("ta_screen") }
                        UrduImageBox(imageResId = R.drawable.paa) { navController.navigate("paa_screen")}
                        UrduImageBox(imageResId = R.drawable.baa) { navController.navigate("baa_screen") }
                        UrduImageBox(imageResId = R.drawable.alif) { navController.navigate("alif_screen") }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        UrduImageBox(imageResId = R.drawable.che) { navController.navigate("che_screen")}
                        UrduImageBox(imageResId = R.drawable.jeem) { navController.navigate("jeem_screen")}
                        UrduImageBox(imageResId = R.drawable.thaa) { navController.navigate("saa_screen")}
                        UrduImageBox(imageResId = R.drawable.taaa) { navController.navigate("taa_screen") }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        UrduImageBox(imageResId = R.drawable.daaal) { navController.navigate("daaal_screen") }
                        UrduImageBox(imageResId = R.drawable.daal) { navController.navigate("daal_screen") }
                        UrduImageBox(imageResId = R.drawable.khaa) { navController.navigate("kha_screen") }
                        UrduImageBox(imageResId = R.drawable.haa) { navController.navigate("ha_screen") }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        UrduImageBox(imageResId = R.drawable.zaa) { navController.navigate("zaa_screen") }
                        UrduImageBox(imageResId = R.drawable.raaa) { Log.d("UrduImageGrid", "Clicked: 6") }
                        UrduImageBox(imageResId = R.drawable.raa) { navController.navigate("raa_screen") }
                        UrduImageBox(imageResId = R.drawable.zaal) { navController.navigate("zaal_screen")}
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        UrduImageBox(imageResId = R.drawable.saad) { navController.navigate("saad_screen")}
                        UrduImageBox(imageResId = R.drawable.sheen) { navController.navigate("sheen_screen") }
                        UrduImageBox(imageResId = R.drawable.seen) { navController.navigate("seen_screen") }
                        UrduImageBox(imageResId = R.drawable.zhaaa) { Log.d("UrduImageGrid", "Clicked: 8") }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        UrduImageBox(imageResId = R.drawable.ain) { navController.navigate("ain_screen")}
                        UrduImageBox(imageResId = R.drawable.zoa) { navController.navigate("zoa_screen") }
                        UrduImageBox(imageResId = R.drawable.toa) { navController.navigate("toa_screen") }
                        UrduImageBox(imageResId = R.drawable.zhaad) { navController.navigate("zhaad_screen") }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        UrduImageBox(imageResId = R.drawable.kaaf) { navController.navigate("kaaf_screen") }
                        UrduImageBox(imageResId = R.drawable.qaaf) { navController.navigate("qaaf_screen") }
                        UrduImageBox(imageResId = R.drawable.faa) { navController.navigate("fa_screen") }
                        UrduImageBox(imageResId = R.drawable.ghen) { navController.navigate("ghen_screen") }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        UrduImageBox(imageResId = R.drawable.noon) { navController.navigate("noon_screen") }
                        UrduImageBox(imageResId = R.drawable.meem) { navController.navigate("meem_screen") }
                        UrduImageBox(imageResId = R.drawable.laam) { navController.navigate("laam_screen") }
                        UrduImageBox(imageResId = R.drawable.gaaf) {navController.navigate("gaaf_screen") }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        UrduImageBox(imageResId = R.drawable.ya) { navController.navigate("ya_screen") }
                        UrduImageBox(imageResId = R.drawable.ha) { navController.navigate("haa_screen") }
                        UrduImageBox(imageResId = R.drawable.hamza) { navController.navigate("haaa_screen") }
                        UrduImageBox(imageResId = R.drawable.wow) { navController.navigate("wow_screen") }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .padding(end = 36.dp),
                        horizontalArrangement = Arrangement.End
                    ) {
                        UrduImageBox(imageResId = R.drawable.yaaa) { navController.navigate("yaa_screen") }
                    }
                }
            }
        }
    )
}

// Composable for each Urdu image box
@Composable
fun UrduImageBox(imageResId: Int, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(48.dp) // Fixed size for each box
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0xFFFFFFFFF))
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = "Urdu Image",
            modifier = Modifier.fillMaxSize() // Fill the box size
        )
    }
}
