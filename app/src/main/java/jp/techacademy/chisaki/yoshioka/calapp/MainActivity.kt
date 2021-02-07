package jp.techacademy.chisaki.yoshioka.calapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import kotlinx.android.synthetic.main.activity_second_cal.*
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener { view ->

            val num1_s = editText1.text.toString()
            val num2_s = editText2.text.toString()

            if (num1_s.isEmpty()) {
                Snackbar.make(view , "一つ目が空欄です.数値を入力してください", Snackbar.LENGTH_LONG).show()
            } else if (num2_s.isEmpty()) {
                Snackbar.make(view , "二つ目が空欄です.数値を入力してください", Snackbar.LENGTH_LONG).show()
            } else {
                val num1 = num1_s.toDouble()
                val num2 = num2_s.toDouble()
                val ans = num1 + num2
                val intent = Intent(this, SecondCal::class.java)
                intent.putExtra("VALUE", ans)
                startActivity(intent)
            }
        }
        button2.setOnClickListener { view ->
            val num1_s = editText1.text.toString()
            val num2_s = editText2.text.toString()

            if (num1_s.isEmpty()) {
                Snackbar.make(view , "一つ目が空欄です.数値を入力してください", Snackbar.LENGTH_LONG).show()
            } else if (num2_s.isEmpty()) {
                Snackbar.make(view , "二つ目が空欄です.数値を入力してください", Snackbar.LENGTH_LONG).show()
            } else {
                val num1 = num1_s.toDouble()
                val num2 = num2_s.toDouble()
                val ans = num1 - num2
                val intent = Intent(this, SecondCal::class.java)
                intent.putExtra("VALUE", ans)
                startActivity(intent)
            }
        }
        button3.setOnClickListener { view ->
            val num1_s = editText1.text.toString()
            val num2_s = editText2.text.toString()

            if (num1_s.isEmpty()) {
                Snackbar.make(view , "一つ目が空欄です.数値を入力してください", Snackbar.LENGTH_LONG).show()
            } else if (num2_s.isEmpty()) {
                Snackbar.make(view , "二つ目が空欄です.数値を入力してください", Snackbar.LENGTH_LONG).show()
            } else {
                val num1 = num1_s.toDouble()
                val num2 = num2_s.toDouble()
                val ans = num1 * num2
                val intent = Intent(this, SecondCal::class.java)
                intent.putExtra("VALUE", ans)
                startActivity(intent)
            }
        }
        button4.setOnClickListener { view ->
            val num1_s = editText1.text.toString()
            val num2_s = editText2.text.toString()

            if (num1_s.isEmpty()) {
                Snackbar.make(view , "一つ目が空欄です.数値を入力してください", Snackbar.LENGTH_LONG).show()
            } else if (num2_s.isEmpty()) {
                Snackbar.make(view , "二つ目が空欄です.数値を入力してください", Snackbar.LENGTH_LONG).show()
            }else{

                val num1 = num1_s.toDouble()
                val num2 = num2_s.toDouble()
                if(num2==0.0){
                    Snackbar.make(view , "0で割れません．", Snackbar.LENGTH_LONG).show()
                }else {
                    val ans = num1 / num2
                    val intent = Intent(this, SecondCal::class.java)
                    intent.putExtra("VALUE", ans)
                    startActivity(intent)
                }
            }
        }

    }
}