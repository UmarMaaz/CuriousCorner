package com.nexgen.curiouscorner.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.android.gms.ads.AdSize
import com.nexgen.curiouscorner.R
import com.nexgen.curiouscorner.ui.components.BannerAdView

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    // Step 1: State to control dialog visibility
    var showDialog by remember { mutableStateOf(false) }
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Spacer(modifier = Modifier.width(8.dp)) // Space between icon and title
                        Text(
                            text = "Alphabet Adventures", // Title text
                            color = Color.White,
                            fontFamily = FontFamily(Font(R.font.interbold)),
                            fontSize = 18.sp,
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { /* Handle navigation click */ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.menu_icon), // Replace with your desired icon
                            contentDescription = "Navigation Icon",
                            tint = Color.White
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* Handle more icon click */ }) {
                        Icon(
                            imageVector = Icons.Default.MoreVert, // Icon at the end
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
                    .background(Color(0xFFF0F0F0)) // Set the screen background color
                    .padding(padding)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFFF0F0F0)) // Set the screen background color
                        .verticalScroll(rememberScrollState()) // Enable vertical scrolling
                        .padding(16.dp), // Add padding from the top to place it right under the top bar
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Hello Little!",
                        color = Color.Black,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(start = 16.dp),
                        fontFamily = FontFamily(Font(R.font.interbold))
                    )

                    Spacer(modifier = Modifier.height(4.dp)) // Space between texts

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        Text(
                            text = "Enjoy your Study",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            modifier = Modifier.padding(start = 16.dp),
                            fontFamily = FontFamily(Font(R.font.interbold))
                        )
                        Spacer(modifier = Modifier.padding(4.dp)) // Space between text and icon
                        Image(
                            painter = painterResource(id = R.drawable.handshake_icon), // Replace with your desired icon
                            contentDescription = "Study Icon",
                            modifier = Modifier.size(30.dp) // Adjust the size of the icon
                        )
                    }
                    Spacer(modifier = Modifier.height(4.dp)) // Space before the card

                    Box(modifier = Modifier
                        .padding(16.dp)
                        .background(Color(0xFFFFFFFF), shape = RoundedCornerShape(12.dp))) {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth(),
                            elevation = CardDefaults.cardElevation(4.dp),
                            shape = RoundedCornerShape(12.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFFECECFF)
                            )
                        ) {
                            Column(
                                modifier = Modifier
                                    .padding(16.dp),
                                horizontalAlignment = Alignment.Start
                            ) {
                                Text(
                                    text = "Explore the Alphabets", // Title for the card
                                    color = Color.Black,
                                    fontSize = 16.sp,
                                    fontFamily = FontFamily(Font(R.font.interbold))
                                )

                                Spacer(modifier = Modifier.height(8.dp)) // Space between title and description

                                Text(
                                    text = "Tap on each letter to explore the fascinating world of the alphabet! Helping you learn and remember the ABCs in an engaging and interactive way.", // Description
                                    color = Color(0xFF646464),
                                    fontSize = 10.sp,
                                    fontFamily = FontFamily(Font(R.font.inter_variable))
                                )

                                Spacer(modifier = Modifier.height(10.dp)) // Space before the button

                                Button(
                                    onClick = { showDialog = true },
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .clip(RoundedCornerShape(12.dp)),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(0xFF1A61A5),
                                        contentColor = Color.White
                                    ),
                                    shape = RoundedCornerShape(12.dp)
                                ) {
                                    Text(text = "Let's Begin" , modifier = Modifier.padding(4.dp)
                                        , color = Color.White ,
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Bold,
                                        fontFamily = FontFamily(Font(R.font.interbold))
                                    ) // Button text
                                }
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(4.dp)) // Space before the grid
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        // First Row with two Cards
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            // Card 1
                            Column(
                                modifier = Modifier.weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { navController.navigate("upper_case_letter_screen") }
                                        .height(150.dp), // Adjust the height of the card
                                    elevation = CardDefaults.cardElevation(4.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.home_card_img1), // Replace with your image
                                        contentDescription = "Card Image 1",
                                        contentScale = ContentScale.Crop, // Ensures image fills the entire card
                                        modifier = Modifier.fillMaxSize()
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "Upper Case",
                                    color = Color.Black,
                                    fontSize = 16.sp,
                                    fontFamily = FontFamily(Font(R.font.interbold))
                                )
                            }

                            // Card 2
                            Column(
                                modifier = Modifier.weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { navController.navigate("lower_case_letter_screen") }
                                        .height(150.dp), // Adjust the height of the card
                                    elevation = CardDefaults.cardElevation(4.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.home_card_img2), // Replace with your image
                                        contentDescription = "Card Image 2",
                                        contentScale = ContentScale.Crop, // Ensures image fills the entire card
                                        modifier = Modifier.fillMaxSize()
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "Lower Case",
                                    color = Color.Black,
                                    fontSize = 16.sp,
                                    fontFamily = FontFamily(Font(R.font.interbold))
                                )
                            }
                        }

                        // Second Row with two Cards
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            // Card 3
                            Column(
                                modifier = Modifier.weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { navController.navigate("number_screen") }
                                        .height(150.dp), // Adjust the height of the card
                                    elevation = CardDefaults.cardElevation(4.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.home_card_img3), // Replace with your image
                                        contentDescription = "Card Image 3",
                                        contentScale = ContentScale.Crop, // Ensures image fills the entire card
                                        modifier = Modifier.fillMaxSize()
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "Counting",
                                    color = Color.Black,
                                    fontSize = 16.sp,
                                    fontFamily = FontFamily(Font(R.font.interbold))
                                )
                            }

                            // Card 4
                            Column(
                                modifier = Modifier.weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { navController.navigate("urdu_letter_screen") }
                                        .height(150.dp), // Adjust the height of the card
                                    elevation = CardDefaults.cardElevation(4.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.home_card_img4), // Replace with your image
                                        contentDescription = "Card Image 4",
                                        contentScale = ContentScale.Crop, // Ensures image fills the entire card
                                        modifier = Modifier.fillMaxSize()
                                    )
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "Urdu Letter’s",
                                    color = Color.Black,
                                    fontSize = 16.sp,
                                    fontFamily = FontFamily(Font(R.font.interbold))
                                )
                            }
                        }
                    }
                    // Dialog that shows the image and text
                    if (showDialog) {
                        AlertDialog(
                            containerColor = Color(0xFFF0F0F0),
                            onDismissRequest = { showDialog = false }, // Close dialog on dismiss
                            title = {
                                    Text(text = "Coming Soon",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold,
                                        fontFamily = FontFamily(Font(R.font.interbold)),
                                        color = Color(0xFF3D3D3D)
                                        )
                            },
                            text = {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.new_app_icon), // Replace with your image
                                        contentDescription = "Dialog Image",
                                        modifier = Modifier
                                            .size(150.dp) // Adjust size as needed
                                            .padding(16.dp)
                                    )
                                    Text(
                                        text = "Sketchland",
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold,
                                        fontFamily = FontFamily(Font(R.font.interbold)),
                                        color = Color(0xFF3D3D3D)
                                    )
                                }
                            },
                            confirmButton = {
                                Button(
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color(0xFF1A61A5),
                                        contentColor = Color.White
                                    ),
                                    onClick = { showDialog = false } // Close dialog on confirm
                                ) {
                                    Text("OK")
                                }
                            }
                        )
                    }
                }
            }
        }
    )
}
