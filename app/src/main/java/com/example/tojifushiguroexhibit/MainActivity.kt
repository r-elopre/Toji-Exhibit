package com.example.tojifushiguroexhibit

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat
import com.example.tojifushiguroexhibit.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var handler: Handler
    private lateinit var runnable: Runnable
    private var index = 0
    private val delay: Long = 20 // Delay in milliseconds between characters
    private lateinit var binding: ActivityMainBinding

    // HTML formatted text
    private val textHtml = """
        Welcome to <b>Toji Exhibit</b><br>
        The best Toji Exhibit in the world!<br>
        Please <i>CLICK</i> View Exhibit to proceed.
    """.trimIndent()

    // Convert HTML to Spanned text
    private val spannedText = HtmlCompat.fromHtml(textHtml, HtmlCompat.FROM_HTML_MODE_LEGACY)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set OnClickListener on the button
        binding.button2.setOnClickListener {
            val intent = Intent(this, insideExhibit::class.java)
            startActivity(intent)
        }
    }



    override fun onResume() {
        super.onResume()
        index = 0 // Reset the index
        binding.textView4.text = "" // Clear the TextView

        // Initialize and start the typewriter effect
        handler = Handler(Looper.getMainLooper())
        runnable = object : Runnable {
            override fun run() {
                if (index < spannedText.length) {
                    binding.textView4.append(spannedText[index].toString())
                    index++
                    handler.postDelayed(this, delay)
                }
            }
        }
        handler.post(runnable)
    }

    override fun onPause() {
        handler.removeCallbacks(runnable) // Stop the typewriter effect
        super.onPause()
    }

    override fun onDestroy() {
        handler.removeCallbacks(runnable)
        super.onDestroy()
    }
}
