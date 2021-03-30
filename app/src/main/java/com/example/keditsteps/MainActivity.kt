package com.example.keditsteps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView2)

    }

    fun toastMe(view: View)
    {
        val a = view
        val myToast = Toast.makeText(this, "touched Me", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun count(view: View) {
        val count = textView.text.toString()
        var countParse: Int = Integer.parseInt(count)
        countParse++
        textView.text = countParse.toString()
    }


    fun randomIt(view: View)
    {
        val randomIntent = Intent(this, SecondActivity::class.java)
        val startVal = textView.text.toString()
        val toIntVal = Integer.parseInt(startVal)

        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, toIntVal)

        startActivity(randomIntent)
    }

}
