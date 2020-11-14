package id.kotlin.tugasminggu02

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import id.kotlin.tugasminggu02.model.ModelLogin
import kotlinx.android.synthetic.main.activity_log_in.*

class LogIn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)


        buttonLogin.setOnClickListener {
            if (textUserName.text.toString().toUpperCase().equals("ASEP") && textPassword.text.toString().toInt() == 123456) {

                val intent = Intent(this, MainActivity::class.java)
                val data = ModelLogin(textUserName.text.toString().toUpperCase(), textPassword.text.toString())
                intent.putExtra("data", data)
                startActivity(intent)
                finish()
            }else{
                Toast.makeText(this, "Sorry, you entered incorrect password and username", Toast.LENGTH_LONG).show()
            }
        }

    }
}
