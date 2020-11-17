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
            val age = inputAgeAtDate.text
            val birthDate = inputBirthdate.text
            if (!age.isNullOrEmpty() && !birthDate.isNullOrEmpty()) {
                Toast.makeText(
                    this,
                    "Your age is ${
                        age.toString().toInt() - birthDate.toString().toInt()
                    } years old",
                    Toast.LENGTH_LONG
                ).show()
            } else{
                Toast.makeText(
                    this,
                    " Please fill all the Form",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}
