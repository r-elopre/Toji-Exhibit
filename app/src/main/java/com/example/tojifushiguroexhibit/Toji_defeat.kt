package com.example.tojifushiguroexhibit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.text.HtmlCompat

class Toji_defeat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toji_defeat)

        // HTML formatted text
        val textHtml = """
            <p><b>Toji Fushiguro's defeat of Satoru Gojo</b> in "Jujutsu Kaisen" is a testament to his exceptional combat skills and strategic planning. The key to Toji's success lay in his ability to exploit Gojo's reliance on sensing cursed energy. As Toji possesses no cursed energy, he was effectively invisible to Gojo's sensory abilities, allowing him to launch a surprise attack.</p>

<p>During their encounter, Toji used the <i>Inverted Spear of Heaven</i>, a special grade cursed tool capable of negating cursed techniques. This was crucial in momentarily disabling Gojo's "Limitless" and "Six Eyes" techniques, which are central to his defense and combat capabilities. Additionally, Toji wielded the <i>Playful Cloud</i>, another powerful cursed tool, enhancing his already formidable physical prowess.</p>

<p>Toji's strategy revolved around close-quarters combat, where he could maximize the element of surprise and his physical advantages. He managed to land critical blows on Gojo, exploiting the brief moments when Gojo's abilities were negated. This encounter showcased Toji's deep understanding of jujutsu combat, his ability to adapt to his opponent's strengths, and his mastery of cursed tools, which ultimately led to the rare instance of Gojo being overpowered in battle.</p>

        """.trimIndent()

        // Set HTML formatted text to TextView
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = HtmlCompat.fromHtml(textHtml, HtmlCompat.FROM_HTML_MODE_LEGACY)
    }
}