package com.example.soundboard_v2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import java.util.*
import android.widget.ImageButton


class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<ImageButton>(R.id.among_button)

        button.setOnClickListener {
            playRandomSound()
        }
    }

    private fun playRandomSound() {
        val soundFiles = arrayOf(R.raw.dog_in_me, R.raw.dog_in_you, R.raw.hiyo_michi, R.raw.joe_mama, R.raw.lover, R.raw.muah, R.raw.uh_brandon, R.raw.uh_michi, R.raw.wah, R.raw.woof)
        val random = Random()
        val randomSound = soundFiles[random.nextInt(soundFiles.size)]

        mediaPlayer = MediaPlayer.create(this, randomSound)
        mediaPlayer.start()
    }
}
