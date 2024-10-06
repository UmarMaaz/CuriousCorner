package com.nexgen.curiouscorner.ui.screens

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.android.gms.ads.AdSize
import com.nexgen.curiouscorner.R
import com.nexgen.curiouscorner.ui.components.BannerAdView

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Q_Screen(navController: NavController) {
    // Get the context
    val context = LocalContext.current

    // Remember the MediaPlayer instance
    var mediaPlayer by remember { mutableStateOf<MediaPlayer?>(null) }

    var isMuted by remember { mutableStateOf(false) }

    // Clean up the MediaPlayer on disposal
    DisposableEffect(Unit) {
        onDispose {
            mediaPlayer?.release()
            mediaPlayer = null
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Alphabet Q",
                        color = Color.White,
                        style = MaterialTheme.typography.titleLarge
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate("upper_case_letter_screen") }) {
                        Icon(
                            painter = painterResource(id = R.drawable.back_arrow),
                            contentDescription = "Back",
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
                    .background(Color(0xFFDDE7F2)) // Light blue background
                    .padding(padding)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    // Card wrapping the content
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f) // Take available space
                            .padding(8.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(containerColor = Color(0xFF87aacb)) // Light blue card color
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp),
                            verticalArrangement = Arrangement.Top, // Align elements to the top
                            horizontalAlignment = Alignment.Start
                        ) {
                            // Large letter "D" and word "Duck" at the top
                            Row(
                                horizontalArrangement = Arrangement.Start,
                                verticalAlignment = Alignment.CenterVertically, // Ensure vertical alignment is set
                            ) {
                                Text(
                                    text = "Q",
                                    fontSize = 120.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                )

                                Spacer(modifier = Modifier.width(16.dp))

                                Text(
                                    text = "Queen",
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Black,
                                    modifier = Modifier.align(Alignment.Bottom)
                                        .padding(bottom = 28.dp)
                                )
                            }

                            // Image of an airplane
                            Image(
                                painter = painterResource(id = R.drawable.queen), // Replace with your image
                                contentDescription = "Aeroplane Image",
                                modifier = Modifier
                                    .size(200.dp)
                                    .align(Alignment.CenterHorizontally) // Center the image
                            )
                            Spacer(modifier = Modifier.height(32.dp))
                            // Mute icon and replay button
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 16.dp),
                                horizontalArrangement = Arrangement.Start,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                IconButton(
                                    onClick = {
                                        // Toggle mute state
                                        isMuted = !isMuted
                                        mediaPlayer?.setVolume(if (isMuted) 0f else 1f, if (isMuted) 0f else 1f)
                                    }
                                ) {
                                    Icon(
                                        painter = painterResource(id = if (isMuted) R.drawable.mute_icon else R.drawable.un_mute_icon), // Toggle icon based on mute state
                                        contentDescription = if (isMuted) "Unmute" else "Mute",
                                        tint = Color.White, // Make the icon visible with Gray color
                                        modifier = Modifier.size(42.dp)
                                    )
                                }

                                Spacer(modifier = Modifier.weight(1f))

                                Button(
                                    onClick = {
                                        // Release previous MediaPlayer if it exists
                                        mediaPlayer?.release()
                                        mediaPlayer = MediaPlayer.create(context, R.raw.q_queen) // Replace with your audio file
                                        mediaPlayer?.setVolume(if (isMuted) 0f else 1f, if (isMuted) 0f else 1f) // Apply current mute state to volume
                                        mediaPlayer?.start()
                                    },
                                    modifier = Modifier
                                        .padding(end = 48.dp)
                                        .height(42.dp),
                                    colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                                ) {
                                    Text(
                                        text = "Play",
                                        color = Color(0xFF1A61A5),
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 16.sp)
                                }
                            }
                            Spacer(modifier = Modifier.height(16.dp))
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    // Next button outside the card
                    Button(
                        onClick = { navController.navigate("r_screen") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                            .height(56.dp),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A61A5))
                    ) {
                        Text(text = "Next", color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                        )
                    }
                }
            }
        }
    )
}