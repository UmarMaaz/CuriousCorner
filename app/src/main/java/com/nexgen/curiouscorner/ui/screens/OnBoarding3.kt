package com.nexgen.curiouscorner.ui.screens

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.nexgen.curiouscorner.R

@Composable
fun OnboardingScreen3(navController: NavController) {
    // Sample image resource
    val context = LocalContext.current
    val imageResource =
        painterResource(id = R.drawable.onboard_img3) // Replace with your image resource ID

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF0F0F0)) // Set the background color
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top // Position items towards the top
        ) {
            // Image
            Image(
                painter = imageResource,
                contentDescription = null,
                modifier = Modifier
                    .size(300.dp)
                    .padding(top = 48.dp)
                    .clip(RoundedCornerShape(16.dp))
            )

            // Dots Indicator (directly under the image)
            Row(
                modifier = Modifier, // No padding here
                horizontalArrangement = Arrangement.Center
            ) {

                // Second dot (circle)
                Box(
                    modifier = Modifier
                        .size(6.dp) // Circular size
                        .clip(CircleShape) // Circle shape
                        .background(Color(0xFFD4D3D3))
                )

                Spacer(modifier = Modifier.width(4.dp)) // Space between dots

                // Second dot (circle)
                Box(
                    modifier = Modifier
                        .size(6.dp) // Circular size
                        .clip(CircleShape) // Circle shape
                        .background(Color(0xFFD4D3D3))
                )

                Spacer(modifier = Modifier.width(4.dp)) // Space between dots

                Box(
                    modifier = Modifier
                        .width(20.dp) // Wider width for the first dot (rectangle shape)
                        .height(6.dp) // Keep the height smaller
                        .clip(RoundedCornerShape(50)) // Rectangle with rounded edges
                        .background(Color(0xFF1A61A5)) // Highlighted color for the first dot
                )
            }

            Spacer(modifier = Modifier.padding(16.dp))

            // Text
            Text(
                text = "Learning is the greatest force you can harness to make a difference in the world.",
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily(Font(R.font.inter_variable)),
                color = Color.Black,
                fontSize = 22.sp,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(200.dp))

            // Button
            Button(
                onClick = {
                    navController.navigate("home")
                },
                shape = RoundedCornerShape(16.dp), // Rounded corners for the button
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(horizontal = 16.dp)
                    .clip(RoundedCornerShape(16.dp)), // Rounded corners for the button
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1A61A5)) // Set button background color
            ) {
                Text(
                    text = "Continue",
                    color = Color.White, // Button text color
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily(Font(R.font.interbold)),
                    fontSize = 24.sp
                )
            }
        }
    }
}
