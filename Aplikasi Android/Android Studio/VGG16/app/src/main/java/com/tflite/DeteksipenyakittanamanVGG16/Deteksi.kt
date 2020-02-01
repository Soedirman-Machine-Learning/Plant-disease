package com.tflite.DeteksipenyakittanamanVGG16

data class Deteksi(
    val name: String,
    val probability: Float
) {
    override fun toString() =
        "$name : ${probability*100}%"
}
