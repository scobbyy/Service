package com.example.service

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button facebook jika diklik akan manampilkan halaman facebook.com

        btn_facebook.setOnClickListener({
            val i = Intent (Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/ahmadabdhilah"))
            startActivity(i)
        })

        //button facebook jika diklik akan manampilkan halaman instagram

        btn_instagram.setOnClickListener({
            val i = Intent (Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com/ahmadabd__"))
            startActivity(i)
        })

        //Mendeklarasikan Variabel MediaPlayer memanggil data mp3
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.lockedaway)

        //button yang berfungsi untuk memutar mp3
        btn_play.setOnClickListener{
            MediaPlayer?.start()
        }

        //button yang berfungsi untuk pause mp3
        btn_pause.setOnClickListener{
            MediaPlayer?.pause()

        } //button yang berfungsi untuk stop mp3
        btn_stop.setOnClickListener{
            MediaPlayer?.stop()
        }
    }
}
