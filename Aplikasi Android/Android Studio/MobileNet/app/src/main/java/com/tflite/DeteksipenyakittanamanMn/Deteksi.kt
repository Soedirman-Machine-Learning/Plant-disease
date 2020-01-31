package com.tflite.DeteksipenyakittanamanMn

data class Deteksi(
    val name: String,
    val probability: Float
) {
    override fun toString() =
        "$name : ${probability*100}%"
}
