package id.kotlin.tugasminggu02

import android.app.Dialog
import android.os.Bundle
import android.view.Window
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bmi_calculator.*
import kotlinx.android.synthetic.main.bmi_normal.*
import kotlin.math.pow

class BmiCalculator : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)

        buttonCalculateBmi.setOnClickListener {
            val weight = this.findViewById<EditText>(R.id.inputWeightBmi).text
            val height = this.findViewById<EditText>(R.id.inputHeightBmi).text
            if (!weight.isNullOrEmpty() && !height.isNullOrEmpty()) {

//            print(textResult.text)
                Dialog(this).apply {
                    requestWindowFeature(Window.FEATURE_NO_TITLE)
                    setCancelable(true)
                    setContentView(R.layout.bmi_normal)
                    val textResult = this.findViewById<TextView>(R.id.textResultBmi)

//                val colorResult = this.findViewById(R.id.result) as LinearLayout

                    val hasil =
                        (weight).toString().toDouble() / (height.toString()
                            .toDouble() / 100)
                            .pow(2)

                    when {
                        hasil < 16.0 -> {
                            textResult.text = "BMI = ${"%.2f".format(hasil)} kg/m2   (Severe Thinnes)"
                            textResult.setBackgroundResource(R.color.severe_thinnes)
                        }
                        hasil in 17.0..16.0 -> {
                            textResult.text = "BMI = ${"%.2f".format(hasil)} kg/m2   (Moderate Thinnes)"
                            textResult.setBackgroundResource(R.color.moderate_thinnes)
                        }
                        hasil in 17.0..19.0 -> {
                            textResult.text = "BMI = ${"%.2f".format(hasil)} kg/m2   (Mild Thinnes)"
                            textResult.setBackgroundResource(R.color.mild_thinness)
                        }
                        hasil in 19.0..25.0 -> {
                            textResult.text = "BMI = ${"%.2f".format(hasil)} kg/m2   (Normal)"
                            textResult.setBackgroundResource(R.color.normal)
                        }
                        hasil in 25.0..30.0 -> {
                            textResult.text = "BMI = ${"%.2f".format(hasil)} kg/m2   (Overweight)"
                            textResult.setBackgroundResource(R.color.overweight)
                        }
                        hasil in 30.0..35.0 -> {
                            textResult.text = "BMI = ${"%.2f".format(hasil)} kg/m2   (Obesity Class 1)"
                            textResult.setBackgroundResource(R.color.obesity1)
                        }
                        hasil in 35.0..40.0 -> {
                            textResult.text = "BMI = ${"%.2f".format(hasil)} kg/m2   (Obesity Class 2)"
                            textResult.setBackgroundResource(R.color.obesity2)
                        }
                        hasil > 40.0 -> {
                            textResult.text = "BMI = ${"%.2f".format(hasil)} kg/m2   (Obesity Class 3)"
                            textResult.setBackgroundResource(R.color.obesity3)
                        }
                    }

                    closeBmi.setOnClickListener {
                        this.dismiss()
                    }
                }.show()
            } else {
                Toast.makeText(this, "Please fill all the form!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
