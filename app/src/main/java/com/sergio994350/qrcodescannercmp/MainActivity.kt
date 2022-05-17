package com.sergio994350.qrcodescannercmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.sergio994350.qrcodescannercmp.ui.theme.QrCodeScannerComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            QrCodeScannerComposeTheme {

            }
        }
    }
}