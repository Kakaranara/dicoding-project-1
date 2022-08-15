package com.example.dicodingproject1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class GameDetailActivity : AppCompatActivity() {
    companion object{
        val PASS_VALUE = "value";
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_detail)

        val tvName : TextView = findViewById(R.id.tvDetailName)
        val tvGenre : TextView = findViewById(R.id.tvDetailGenre)
        val tvDeskripsi : TextView = findViewById(R.id.tvDetailDeskripsi)
        val imageView : ImageView = findViewById(R.id.tvDetailPhoto)

        val data : Game = intent.getParcelableExtra<Game>(PASS_VALUE) as Game

        Log.w("TYPE", "data.photo:  ${data.photo::class.simpleName} ", )

        tvName.text = data.nama
        tvGenre.text = data.genre
        tvDeskripsi.text = data.deskripsi
        imageView.setImageResource(data.photo)
    }
}