package com.example.dicodingproject1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Game(
    val nama : String,
    val genre : String,
    val deskripsi : String,
    val photo : Int
) : Parcelable