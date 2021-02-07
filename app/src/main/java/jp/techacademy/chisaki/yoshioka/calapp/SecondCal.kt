package jp.techacademy.chisaki.yoshioka.calapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second_cal.*

class SecondCal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_cal)

        val value1 = intent.getDoubleExtra("VALUE",0.0)

        val answer = "answer : " + value1.toString()

        textViewS.text=answer

    }
}