package com.nexgen.curiouscorner.ui.screens

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import android.content.Intent
import android.content.res.Configuration
import android.media.MediaPlayer
import android.os.Build
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
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
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.navigation.NavController
import com.nexgen.curiouscorner.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AlphabetScreenResponsive(navController: NavController) {
    val context = LocalContext.current
    val configuration = LocalConfiguration.current
    val isLandscape = configuration.orientation == Configuration.ORIENTATION_LANDSCAPE

    // Remember the MediaPlayer instance
    var mediaPlayer by remember { mutableStateOf<MediaPlayer?>(null) }
    var isMuted by remember { mutableStateOf(false) }

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
                        text = "Alphabet B",
                        color = Color.White,
                        style = MaterialTheme.typography.titleLarge
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            painter = painterResource(id = R.drawable.back_arrow), // Replace with your drawable
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
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFE5E5E5)) // Background color
                .padding(padding)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                if (isLandscape) {
                    // Layout for landscape mode wrapped in a Card
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF88B6F1)
                        ),
                        elevation = CardDefaults.cardElevation(4.dp)
                    ) {
                        Column {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(16.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                // Left arrow button
                                IconButton(onClick = { navController.navigate("a_screen") }) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.back_arr), // Replace with your drawable
                                        contentDescription = "Back",
                                        tint = Color(0xFFEC407A),
                                        modifier = Modifier.size(40.dp)
                                            .padding(top = 32.dp)
                                    )
                                }

                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Row(
                                        horizontalArrangement = Arrangement.Start,
                                        verticalAlignment = Alignment.CenterVertically,
                                    ) {
                                        Text(
                                            text = "B",
                                            fontSize = 100.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White
                                        )
                                        Spacer(modifier = Modifier.width(16.dp))
                                        // Word "Ball"
                                        Text(
                                            text = "Ball",
                                            fontSize = 24.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.Black
                                        )
                                    }
                                }

                                // Image of a ball
                                Image(
                                    painter = painterResource(id = R.drawable.ball_img), // Replace with your image
                                    contentDescription = "Ball Image",
                                    modifier = Modifier.size(100.dp)
                                )

                                // Right arrow button
                                IconButton(onClick = { navController.navigate("c_screen") }) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.front_arr), // Replace with your drawable
                                        contentDescription = "Next",
                                        tint = Color(0xFFEC407A),
                                        modifier = Modifier.size(40.dp)
                                            .padding(top = 32.dp)
                                    )
                                }
                            }

                            // Mute icon and replay button positioned at the bottom
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 16.dp),
                                horizontalArrangement = Arrangement.SpaceEvenly
                            ) {
                                IconButton(
                                    onClick = {
                                        isMuted = !isMuted
                                        mediaPlayer?.setVolume(
                                            if (isMuted) 0f else 1f,
                                            if (isMuted) 0f else 1f
                                        )
                                    }
                                ) {
                                    Icon(
                                        painter = painterResource(id = if (isMuted) R.drawable.mute_icon else R.drawable.un_mute_icon),
                                        contentDescription = if (isMuted) "Unmute" else "Mute",
                                        tint = Color.White,
                                        modifier = Modifier.size(42.dp)
                                    )
                                }

                                Button(
                                    onClick = {
                                        mediaPlayer?.release()
                                        mediaPlayer = MediaPlayer.create(
                                            context,
                                            R.raw.b_ball
                                        ) // Replace with your audio file
                                        mediaPlayer?.setVolume(
                                            if (isMuted) 0f else 1f,
                                            if (isMuted) 0f else 1f
                                        )
                                        mediaPlayer?.start()
                                    },
                                    modifier = Modifier.height(42.dp),
                                    colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                                ) {
                                    Text(
                                        text = "Replay",
                                        color = Color(0xFF1A61A5),
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 16.sp
                                    )
                                }
                            }
                        }
                    }
                } else {
                    // Layout for portrait mode
                    Card(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF88B6F1)
                        ),
                        elevation = CardDefaults.cardElevation(4.dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.Start
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.Center,
                                modifier = Modifier.padding(start = 32.dp),
                                verticalAlignment = Alignment.CenterVertically, // Ensure vertical alignment is set
                            ) {
                                Text(
                                    text = "B",
                                    fontSize = 120.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                )

                                Spacer(modifier = Modifier.width(16.dp))

                                Text(
                                    text = "Ball",
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Black,
                                    modifier = Modifier.align(Alignment.Bottom)
                                        .padding(bottom = 28.dp)
                                )
                            }

                            Spacer(modifier = Modifier.height(16.dp))

                            // Image of a ball
                            Image(
                                painter = painterResource(id = R.drawable.ball_img),
                                contentDescription = "Ball Image",
                                modifier = Modifier.size(250.dp)
                                    .align(Alignment.CenterHorizontally)
                            )

                            Spacer(modifier = Modifier.height(32.dp))

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
                                        mediaPlayer = MediaPlayer.create(context, R.raw.b_ball) // Replace with your audio file
                                        mediaPlayer?.setVolume(if (isMuted) 0f else 1f, if (isMuted) 0f else 1f) // Apply current mute state to volume
                                        mediaPlayer?.start()
                                    },
                                    modifier = Modifier
                                        .padding(end = 48.dp)
                                        .height(42.dp),
                                    colors = ButtonDefaults.buttonColors(containerColor = Color.White)
                                ) {
                                    Text(
                                        text = "Re-play",
                                        color = Color(0xFF1A61A5),
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 16.sp)
                                }
                            }
                            Spacer(modifier = Modifier.weight(1f))
                            // Navigation buttons (back and next)
                            Row(
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.Bottom,
                                modifier = Modifier.fillMaxWidth()
                                    .padding(16.dp)
                            ) {
                                IconButton(onClick = { navController.navigate("a_screen") }) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.back_arr),
                                        contentDescription = "Back",
                                        tint = Color(0xFFEC407A),
                                        modifier = Modifier.size(40.dp)
                                    )
                                }

                                IconButton(onClick = { navController.navigate("c_screen") }) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.front_arr),
                                        contentDescription = "Next",
                                        tint = Color(0xFFEC407A),
                                        modifier = Modifier.size(40.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}



