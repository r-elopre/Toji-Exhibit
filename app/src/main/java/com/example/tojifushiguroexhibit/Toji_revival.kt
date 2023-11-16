package com.example.tojifushiguroexhibit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import com.example.tojifushiguroexhibit.databinding.ActivityTojiRevivalBinding

class Toji_revival : AppCompatActivity() {
    private lateinit var binding: ActivityTojiRevivalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTojiRevivalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val videoPath = "android.resource://" + packageName + "/" + R.raw.toji_revival_vid
        binding.videoView.setVideoURI(Uri.parse(videoPath))
        binding.videoView.start()

        // Loop video
        binding.videoView.setOnCompletionListener { binding.videoView.start() }
    }
}
