package com.codeknight.birthdayscavengerhunt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        var extra = Bundle(intent.extras)
        var hintsUsed = extra?.getInt("hintsUsed")

        var endBlurb = findViewById<TextView>(R.id.endBlurb)
        var hintsUsedText = findViewById<TextView>(R.id.hintsUsedText)

        if (hintsUsed == 0) {
            hintsUsedText.text = R.string.noHints.toString()
        } else if (hintsUsed < 4) {
            hintsUsedText.text = R.string.oneHint.toString()
        } else if (hintsUsed < 8) {
            hintsUsedText.text = R.string.fourHints.toString()
        } else {
            hintsUsedText.text = R.string.allHints.toString()
        }

    }
}