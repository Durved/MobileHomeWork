package com.example.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        RegistrationButton.setOnClickListener {

            if (EmailTextView.text.isBlank() ||
                    NameTextView.text.isBlank() ||
                    PasswordTextView.text.isBlank() ||
                    ConfirmTextView.text.isBlank()) {

                Toast.makeText(this@LogInActivity, "Заполните все поля", Toast.LENGTH_SHORT)

                return@setOnClickListener
            }

            if (!EmailTextView.text.contains("@"))
            {
                EmailTextView.setError("Некорректный E-mail")

                return@setOnClickListener
            }

            if (PasswordTextView.text != ConfirmTextView)
            {
                Toast.makeText(this@LogInActivity, "Пароли не совпадают", Toast.LENGTH_SHORT)

                return@setOnClickListener
            }

            Toast.makeText(this@LogInActivity, "Всё корректно", Toast.LENGTH_SHORT)
        }
    }
}