package com.sergio994350.qrcodescannercmp

import android.graphics.ImageFormat
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageProxy
import java.nio.ByteBuffer

class QrCodeAnalyzer(
    private val onQrCodeScanned: (String) -> Unit
): ImageAnalysis.Analyzer {

    private val supportedImageFormats = listOf(
        ImageFormat.YUV_420_888,
        ImageFormat.YUV_422_888,
        ImageFormat.YUV_444_888,
    )

    override fun analyze(image: ImageProxy) {
        if(image.format in supportedImageFormats) {
            val bytes = image.planes.first().buffer
        }
    }

    private fun ByteBuffer.toByteArray(): ByteArray {
        rewind()
    }
}