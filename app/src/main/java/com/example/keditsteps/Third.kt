package com.example.keditsteps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class Third : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        showText()
    }

    companion object {
        const val TEXT_FROM_FIRST_ACTIVITY = "text_first_activity"
        const val TEXT_SECOND_VIEW = "text_second"
    }

    private fun showText()
    {
        val intentr = intent.getStringExtra(TEXT_FROM_FIRST_ACTIVITY)
        val newTex = intent.getStringExtra(TEXT_SECOND_VIEW)
        textFromThirdActivity.text = getString(R.string.textFirstAct, intentr)
        textView3.text = getString(R.string.anotherTexFromFirstScreen, newTex)
    }
}
