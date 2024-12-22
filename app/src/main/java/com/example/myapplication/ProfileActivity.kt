package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Find views by their IDs
        val firstNameTextView = findViewById<TextView>(R.id.textViewFirstName)
        val lastNameTextView = findViewById<TextView>(R.id.textViewLastName)
        val ageTextView = findViewById<TextView>(R.id.textViewAge)
        val phoneTextView = findViewById<TextView>(R.id.textViewPhone)
        val emailTextView = findViewById<TextView>(R.id.textViewEmail)
        val backButton = findViewById<Button>(R.id.backButton)

        // Retrieve data passed from MainActivity
        val firstName = intent.getStringExtra("EXTRA_FIRST_NAME")
        val lastName = intent.getStringExtra("EXTRA_LAST_NAME")
        val age = intent.getStringExtra("EXTRA_AGE")
        val phone = intent.getStringExtra("EXTRA_PHONE")
        val email = intent.getStringExtra("EXTRA_EMAIL")

        // Set the retrieved data to the TextViews
        firstNameTextView.text = "Firstname: $firstName"
        lastNameTextView.text = "Lastname: $lastName"
        ageTextView.text = "Age: $age"
        phoneTextView.text = "Phone: $phone"
        emailTextView.text = "Email: $email"

        // Set click listener for the "Back" button
        backButton.setOnClickListener {
            // Navigate back to MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Finish the current activity
        }
    }
}
