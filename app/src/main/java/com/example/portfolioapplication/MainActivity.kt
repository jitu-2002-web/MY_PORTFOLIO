package com.example.portfolioapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // val or var use like java int
       val buttonSkills=findViewById<Button>(R.id.profile)
        buttonSkills.setOnClickListener {

            intent = Intent(this, ProfileActivity :: class.java)
            startActivity(intent)

        }
        val buttonSkills2=findViewById<Button>(R.id.education)
        buttonSkills2.setOnClickListener {
            intent = Intent(this, EducationActivity :: class.java)
            startActivity(intent)
        }
        val buttonSkills3 = findViewById<Button>(R.id.skills)
        buttonSkills3.setOnClickListener {
            intent = Intent(this,SkillsActivity :: class.java)
            startActivity(intent)
        }
       val buttonSkills4 = findViewById<Button>(R.id.Contacts)
        buttonSkills4.setOnClickListener {
            intent = Intent(this,ContactActivity :: class.java)
            startActivity(intent)
        }
    }
}