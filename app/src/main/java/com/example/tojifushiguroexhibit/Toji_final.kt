package com.example.tojifushiguroexhibit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.text.HtmlCompat

class Toji_final : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toji_final)

        // HTML formatted text
        val textHtml = """
            <p><b>Toji Fushiguro's death</b> in "Jujutsu Kaisen" occurs during the events of the Shibuya Incident arc, marking a pivotal moment in the story. After his resurrection and subsequent involvement in the Shibuya Incident, Toji faces off against multiple characters, including his son, Megumi Fushiguro.</p>

<p>His death is ultimately brought about by his own son, <i>Megumi</i>. During their encounter, Megumi is forced to fight Toji, who has been manipulated into attacking him. Despite the emotional turmoil, Megumi realizes the necessity of stopping his father to prevent further destruction and casualties. In a decisive moment, Megumi uses his Ten Shadows Technique to summon a Divine Dog, which attacks Toji.</p>

<p>Recognizing Megumi's strength and the potential of his cursed technique, Toji feels a sense of pride and fulfillment as a father, seeing his son's growth as a sorcerer. In his final moments, Toji experiences a sense of peace and willingly accepts his fate, allowing himself to be defeated by Megumi. This act not only stops Toji's rampage but also serves as a crucial developmental moment for Megumi, impacting his character growth and understanding of his own abilities and responsibilities as a jujutsu sorcerer.</p>

        """.trimIndent()

        // Set HTML formatted text to TextView
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = HtmlCompat.fromHtml(textHtml, HtmlCompat.FROM_HTML_MODE_LEGACY)
    }
}
