package com.example.keditsteps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_state.*

class StateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_state)
        button.setOnClickListener{
            textView.text = editText.text
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.run {
            putString("KEY", textView.text.toString())
        }
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        textView.text = savedInstanceState.getString("KEY")
        super.onRestoreInstanceState(savedInstanceState)
    }


}

data class User (
    var name: String = "",
    var description: String = ""
)

