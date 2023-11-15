package com.example.tojifushiguroexhibit

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tojifushiguroexhibit.databinding.ActivityInsideExhibitBinding

class insideExhibit : AppCompatActivity() {
    private lateinit var binding: ActivityInsideExhibitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_inside_exhibit)

        setupVideoView()
        setupRecyclerView()
    }

    private fun setupVideoView() {
        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.toji_fushiguro2)
        binding.videoView.apply {
            setVideoURI(videoUri)
            start()

            val mediaController = MediaController(this@insideExhibit)
            setMediaController(mediaController)
            mediaController.setAnchorView(this)

            setOnCompletionListener {
                visibility = VideoView.GONE

                runOnUiThread {
                    binding.textView5?.let {
                        typeWriterEffect(it, "I hope you enjoy the edit you just saw\n now here is the summary exhibit of\n how Toji Fushiguro Dominate the Jujutsu world\n Toji Fushiguro in \"Jujutsu Kaisen\" is a formidable non-sorcerer known as the 'Sorcerer Killer.' Despite lacking cursed energy, his exceptional physical strength, agility, and mastery of cursed tools make him a deadly opponent, capable of defeating even the strongest sorcerers and cursed spirits. His unique ability to remain undetectable to those relying on sensing cursed energy further enhances his reputation as one of the most feared characters in the series.\n", 30)
                    }
                }
            }

            requestFocus()
        }
    }

    private fun setupRecyclerView() {
        val courseItems = listOf(
            CourseItem(R.drawable.toji_prepare, "Toji plan to take down gojo (The six eyes and infinity successor)"),
            CourseItem(R.drawable.toji_defeat_gojo, "Toji defeat the six eyes and infinity user"),
            CourseItem(R.drawable.toji_death, "Toji and Gojo final battle"),
            CourseItem(R.drawable.toji_comaback, "The revival of a man unchained from the Zenin curse")
            // Add more items as needed
        )

        val adapter = CourseAdapter(courseItems) { courseItem ->
            onCourseItemClick(courseItem)
        }
        binding.recyclerView2.adapter = adapter
        binding.recyclerView2.layoutManager = LinearLayoutManager(this)
    }

    private fun typeWriterEffect(textView: TextView, text: String, delay: Long) {
        var charIndex = 0
        val handler = Handler(Looper.getMainLooper())
        val runnable = object : Runnable {
            override fun run() {
                if (charIndex <= text.length) {
                    textView.text = text.substring(0, charIndex++)
                    handler.postDelayed(this, delay)
                }
            }
        }
        handler.postDelayed(runnable, delay)
    }




    private fun onCourseItemClick(courseItem: CourseItem) {
        when (courseItem.title) {
            "Toji plan to take down gojo (The six eyes and infinity successor)" -> startActivity(
                Intent(this, Toji_plan::class.java)
            )

            "Toji defeat the six eyes and infinity user" -> startActivity(
                Intent(
                    this, Toji_defeat::class.java
                )
            )
            // Add more cases for other titles and corresponding activities
        }

    }
}
