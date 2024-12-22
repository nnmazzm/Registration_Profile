package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by their IDs
        val firstNameEditText = findViewById<EditText>(R.id.editTextFirstName)
        val lastNameEditText = findViewById<EditText>(R.id.editTextLastName)
        val ageEditText = findViewById<EditText>(R.id.editTextAge)
        val phoneEditText = findViewById<EditText>(R.id.editTextPhone)
        val emailEditText = findViewById<EditText>(R.id.editTextEmail)
        val createAccountButton = findViewById<Button>(R.id.createAccountButton)

        // Set click listener for the "Create Account" button
        createAccountButton.setOnClickListener {
            val firstName = firstNameEditText.text.toString()
            val lastName = lastNameEditText.text.toString()
            val age = ageEditText.text.toString()
            val phone = phoneEditText.text.toString()
            val email = emailEditText.text.toString()

            // Create an intent to navigate to ProfileActivity
            val intent = Intent(this, ProfileActivity::class.java).apply {
                putExtra("EXTRA_FIRST_NAME", firstName)
                putExtra("EXTRA_LAST_NAME", lastName)
                putExtra("EXTRA_AGE", age)
                putExtra("EXTRA_PHONE", phone)
                putExtra("EXTRA_EMAIL", email)
            }

            // Start ProfileActivity
            startActivity(intent)
        }
    }
}
