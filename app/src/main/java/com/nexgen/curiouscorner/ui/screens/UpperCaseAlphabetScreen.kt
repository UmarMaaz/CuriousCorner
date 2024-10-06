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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
fun UpperCaseLetterScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Upper Case Letters",
                        color = Color.White,
                        fontFamily = FontFamily(Font(R.font.interbold)),
                        fontSize = 18.sp,
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
                Column(modifier = Modifier.fillMaxSize()
                    .verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.Center) {
                    NativeAdView(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    )
                    // Create a list of rows with fixed alphabet letters
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly // Space evenly
                    ) {
                        UpperAlphabetBox(letter = 'A') { navController.navigate("a_screen") }
                        UpperAlphabetBox(letter = 'B') { navController.navigate("b_screen") }
                        UpperAlphabetBox(letter = 'C') { navController.navigate("c_screen") }
                        UpperAlphabetBox(letter = 'D') { navController.navigate("d_screen") }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        UpperAlphabetBox(letter = 'E') { navController.navigate("e_screen") }
                        UpperAlphabetBox(letter = 'F') { navController.navigate("f_screen") }
                        UpperAlphabetBox(letter = 'G') { navController.navigate("g_screen") }
                        UpperAlphabetBox(letter = 'H') { navController.navigate("h_screen") }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        UpperAlphabetBox(letter = 'I') { navController.navigate("i_screen") }
                        UpperAlphabetBox(letter = 'J') { navController.navigate("j_screen") }
                        UpperAlphabetBox(letter = 'K') { navController.navigate("k_screen") }
                        UpperAlphabetBox(letter = 'L') { navController.navigate("l_screen") }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        UpperAlphabetBox(letter = 'M') { navController.navigate("m_screen") }
                        UpperAlphabetBox(letter = 'N') { navController.navigate("n_screen") }
                        UpperAlphabetBox(letter = 'O') { navController.navigate("o_screen") }
                        UpperAlphabetBox(letter = 'P') { navController.navigate("p_screen") }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        UpperAlphabetBox(letter = 'Q') { navController.navigate("q_screen") }
                        UpperAlphabetBox(letter = 'R') { navController.navigate("r_screen") }
                        UpperAlphabetBox(letter = 'S') { navController.navigate("s_screen") }
                        UpperAlphabetBox(letter = 'T') { navController.navigate("t_screen") }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        UpperAlphabetBox(letter = 'U') { navController.navigate("u_screen")}
                        UpperAlphabetBox(letter = 'V') { navController.navigate("v_screen") }
                        UpperAlphabetBox(letter = 'W') { navController.navigate("w_screen") }
                        UpperAlphabetBox(letter = 'X') { navController.navigate("x_screen") }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .padding(horizontal = 24.dp),
                        horizontalArrangement = Arrangement.spacedBy(24.dp) // Adds spacing between Y and Z
                    ) {
                        UpperAlphabetBox(letter = 'Y') { navController.navigate("y_screen") }
                        UpperAlphabetBox(letter = 'Z') { navController.navigate("z_screen") }
                    }
                }
            }
        }
    )
}

// Composable for each alphabet box
@Composable
fun UpperAlphabetBox(letter: Char, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(64.dp) // Fixed size for each box
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0xFFF0F0F0))
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = letter.toString(),
            fontSize = 40.sp,
            fontFamily = FontFamily(Font(R.font.irish_grover)), // Use your custom font here
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
    }
}


