package com.codeknight.birthdayscavengerhunt

import android.content.Intent
import android.graphics.Point
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class QuestionActivity : AppCompatActivity() {
    var Instance = GameInstance()
    var Pointer = 0
    var HintsUsed = 0

    var prompt: TextView? = null
    var field: EditText? = null
    var submit: Button? = null
    var hint1: TextView? = null
    var hint2: TextView? = null
    var hintButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        prompt = findViewById<TextView>(R.id.tvprompt)
        field = findViewById<EditText>(R.id.fieldCode)
        submit = findViewById<AppCompatButton>(R.id.btnSubmit)
        hint1 = findViewById<TextView>(R.id.tvHint1)
        hint2 = findViewById<TextView>(R.id.tvHint2)
        hintButton = findViewById<Button>(R.id.btnHint)

        loadNext()

    }

    fun loadNext() {
        var current = Instance.list[Pointer]
        var currentHints = 0

        prompt?.text = current.Question

        hintButton?.setOnClickListener{
            if (currentHints == 0) {
                hint1?.text = current.Hint1
                currentHints += 1
            } else if (currentHints == 1) {
                hint2?.text = current.Hint2
                currentHints += 1
            } else {
                Toast.makeText(this, "You're out of hints, dingus!", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        submit?.setOnClickListener {
            if (field?.text.toString() == current.Code) {
                HintsUsed += currentHints

                if (Pointer < (Instance.list.size - 1)) {
                    Pointer ++
                    field?.text?.clear()
                    hint1?.text = ""
                    hint2?.text = ""
                    loadNext()
                } else {
                    loadResults()
                }
            }
            else {
                Toast.makeText(this, "Try again, bucko", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    fun loadResults() {

    }
}