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
fun LowerCaseLetterScreen(navController: NavController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Lower Case Letters",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontFamily = FontFamily(Font(R.font.interbold)),
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
                    .verticalScroll(rememberScrollState())
                    , verticalArrangement = Arrangement.Center) {
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
                        LowerAlphabetBox(letter = 'a') { navController.navigate("small_a_screen") }
                        LowerAlphabetBox(letter = 'b') { navController.navigate("small_b_screen") }
                        LowerAlphabetBox(letter = 'c') { navController.navigate("small_c_screen") }
                        LowerAlphabetBox(letter = 'd') { navController.navigate("small_d_screen") }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        LowerAlphabetBox(letter = 'e') { navController.navigate("small_e_screen") }
                        LowerAlphabetBox(letter = 'f') { navController.navigate("small_f_screen") }
                        LowerAlphabetBox(letter = 'g') { navController.navigate("small_g_screen") }
                        LowerAlphabetBox(letter = 'h') { navController.navigate("small_h_screen") }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        LowerAlphabetBox(letter = 'i') { navController.navigate("small_i_screen") }
                        LowerAlphabetBox(letter = 'j') { navController.navigate("small_j_screen") }
                        LowerAlphabetBox(letter = 'k') { navController.navigate("small_k_screen") }
                        LowerAlphabetBox(letter = 'l') { navController.navigate("small_l_screen") }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        LowerAlphabetBox(letter = 'm') { navController.navigate("small_m_screen")}
                        LowerAlphabetBox(letter = 'n') { navController.navigate("small_n_screen")}
                        LowerAlphabetBox(letter = 'o') { navController.navigate("small_o_screen")}
                        LowerAlphabetBox(letter = 'p') { navController.navigate("small_p_screen")}
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        LowerAlphabetBox(letter = 'q') { navController.navigate("small_q_screen")}
                        LowerAlphabetBox(letter = 'r') { navController.navigate("small_r_screen")}
                        LowerAlphabetBox(letter = 's') { navController.navigate("small_s_screen")}
                        LowerAlphabetBox(letter = 't') { navController.navigate("small_t_screen")}
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        LowerAlphabetBox(letter = 'u') { navController.navigate("small_u_screen")}
                        LowerAlphabetBox(letter = 'v') { navController.navigate("small_v_screen")}
                        LowerAlphabetBox(letter = 'w') { navController.navigate("small_w_screen")}
                        LowerAlphabetBox(letter = 'x') { navController.navigate("small_x_screen")}
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .padding(horizontal = 24.dp),
                        horizontalArrangement = Arrangement.spacedBy(24.dp) // Adds spacing between y and z
                    ) {
                        LowerAlphabetBox(letter = 'y') { navController.navigate("small_y_screen") }
                        LowerAlphabetBox(letter = 'z') { navController.navigate("small_z_screen") }
                    }
                }
            }
        }
    )
}

// Composable for each alphabet box
@Composable
fun LowerAlphabetBox(letter: Char, onClick: () -> Unit) {
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
