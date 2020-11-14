package id.kotlin.tugasminggu02

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_your_age.*

class YourAge : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_age)

        buttonCalculateUmur.setOnClickListener {
            Toast.makeText(
                this,
                "Your age is ${
                    inputAgeAtDate.text.toString().toInt() - inputBirthdate.text.toString().toInt()
                } years old",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
