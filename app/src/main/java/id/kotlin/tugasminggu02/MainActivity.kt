package id.kotlin.tugasminggu02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.kotlin.tugasminggu02.model.ModelLogin
import id.kotlin.tugasminggu02.model.ModelYourAge
import kotlinx.android.synthetic.main.activity_log_in.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getData = intent.getParcelableExtra<ModelLogin>("data")
        textusermain.text = getData?.user

        buttonAge.setOnClickListener{
            val intent = Intent(this@MainActivity, YourAge::class.java)
            startActivity(intent)
        }

        buttonBMI.setOnClickListener{
            val intent = Intent(this@MainActivity, BmiCalculator::class.java)
            startActivity(intent)
        }

        buttonListview.setOnClickListener{
            val intent = Intent(this@MainActivity, ListView::class.java)
            startActivity(intent)
        }

        buttonRecyclerview.setOnClickListener{
            val intent = Intent(this@MainActivity, RecylerView::class.java)
            startActivity(intent)
        }
    }
}
