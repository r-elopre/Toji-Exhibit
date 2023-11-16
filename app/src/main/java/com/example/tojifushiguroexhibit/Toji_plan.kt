package com.example.tojifushiguroexhibit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.text.HtmlCompat

class Toji_plan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toji_plan)

        // HTML formatted text
        val textHtml = """
            <p><b>Toji Fushiguro's plan</b> to take down <i>Satoru Gojo</i> in "Jujutsu Kaisen" was a calculated and daring strategy, leveraging his unique abilities and resources. Recognizing Gojo's immense power and his ability to sense cursed energy, <b>Toji</b>, who possesses no cursed energy himself, used this to his advantage to remain undetectable. He employed a surprise attack, exploiting the brief window when Gojo was vulnerable.</p>

<p>Toji's choice of weapons was also crucial: he used a special grade cursed tool, the <i>Inverted Spear of Heaven</i>, which could negate cursed techniques, and a cursed tool, the <i>Playful Cloud</i>, known for its immense destructive power. This arsenal, combined with Toji's exceptional combat skills and strategic acumen, allowed him to momentarily overpower Gojo, a feat considered nearly impossible given Gojo's status as one of the strongest characters in the series.</p>

<p>This plan highlighted Toji's deep understanding of jujutsu sorcery and his ability to turn his lack of cursed energy into a significant tactical advantage.</p>

        """.trimIndent()

        // Set HTML formatted text to TextView
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = HtmlCompat.fromHtml(textHtml, HtmlCompat.FROM_HTML_MODE_LEGACY)
    }
}
