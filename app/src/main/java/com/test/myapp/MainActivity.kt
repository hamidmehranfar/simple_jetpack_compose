package com.test.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lightspark.composeqr.QrCodeView
import com.test.myapp.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    Column (
        modifier = Modifier.padding(
            horizontal = 24.dp
        ),
        horizontalAlignment = Alignment.CenterHorizontally) 
    {
        Spacer(modifier = Modifier.height(64.dp))
        Column (
            modifier= Modifier
                .padding(horizontal = 16.dp)
                .clip(
                    RoundedCornerShape(corner = CornerSize(15.dp))
                )
                .background(color = MaterialTheme.colorScheme.onPrimaryContainer)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Spacer(modifier = Modifier.height(32.dp))
            Image(
                painter = painterResource(id = R.drawable.my_picture),
                contentDescription = "my icon",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape),
                alignment = Alignment.Center
            )
            Spacer(modifier = Modifier.height(48.dp))
            Text(
                text = "4003613058",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            Spacer(modifier = Modifier.height(48.dp))
            QrCodeView(
                data = "https://t.me/Hamid_Mhf",
                modifier = Modifier.size(250.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.icons_telegram),
                    contentDescription = "telegram icon",
                    modifier= Modifier.size(64.dp),
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.Center
                )
            }
            Spacer(modifier = Modifier.height(80.dp))
        }
        Spacer(modifier = Modifier.height(64.dp))
    }
}