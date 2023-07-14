package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.security.cert.Certificate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSkills= findViewById<Button>(R.id.btnSkills)
        buttonSkills.setOnClickListener {
            intent= Intent(this,SkillsActivity ::class.java)
            startActivity(intent)
        }
        val buttonEducation=findViewById<Button>(R.id.btnEd)
        buttonEducation.setOnClickListener {
            intent=Intent(this,EducationActivity::class.java)
            startActivity(intent)
        }
        val buttonCertificate=findViewById<Button>(R.id.btnCer)
        buttonCertificate.setOnClickListener {
            intent= Intent(this,CertificateActivity ::class.java)
            startActivity(intent)
        }
        val buttonInterest =findViewById<Button>(R.id.btnInt)
        buttonInterest.setOnClickListener {
            intent= Intent(this,InterestActivity ::class.java)
            startActivity(intent)
        }

    }
}