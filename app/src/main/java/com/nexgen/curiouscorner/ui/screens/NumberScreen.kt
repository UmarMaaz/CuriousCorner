package com.nexgen.curiouscorner.ui.screens

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
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.android.gms.ads.AdSize
import com.nexgen.curiouscorner.NativeAdView
import com.nexgen.curiouscorner.R
import com.nexgen.curiouscorner.ui.components.BannerAdView

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NumberScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Numbers 1-10",
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
                    .background(Color(0xFFF0F0F0)) // Background color with transparency
                    .padding(padding)
            ) {
                Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top) {
                    NativeAdView(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    )
                    // Create a list of rows with numbers 1-10
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly // Space evenly
                    ) {
                        NumberBox(number = 1) { navController.navigate("no1_screen") }
                        NumberBox(number = 2) { navController.navigate("no2_screen") }
                        NumberBox(number = 3) { navController.navigate("no3_screen") }
                        NumberBox(number = 4) { navController.navigate("no4_screen") }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        NumberBox(number = 5) { navController.navigate("no5_screen") }
                        NumberBox(number = 6) { navController.navigate("no6_screen") }
                        NumberBox(number = 7) { navController.navigate("no7_screen") }
                        NumberBox(number = 8) { navController.navigate("no8_screen") }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .padding(horizontal = 24.dp),
                        horizontalArrangement = Arrangement.spacedBy(24.dp) // Adds spacing between 9 and 10
                    ) {
                        NumberBox(number = 9) { navController.navigate("no9_screen") }
                        NumberBox(number = 10) { navController.navigate("no10_screen") }
                    }
                }
            }
        }
    )
}

// Composable for each number box
@Composable
fun NumberBox(number: Int, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(64.dp) // Fixed size for each box
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0xFFF0F0F0))
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = number.toString(),
            fontSize = 40.sp,
            fontFamily = FontFamily(Font(R.font.irish_grover)), // Use your custom font here
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
    }
}
