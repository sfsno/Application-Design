package com.example.projet1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hautGauche = findViewById<View>(R.id.hautgauche)
        val appleWatch = findViewById<View>(R.id.applewatch)
        val hautDroit = findViewById<View>(R.id.hautdroit)
        val basGauche = findViewById<View>(R.id.basgauche)
        val basDroit = findViewById<View>(R.id.basdroit)
        val galaxywatch = findViewById<View>(R.id.galaxywatch)
        val garminfenix = findViewById<View>(R.id.garminfenix)
        val amazfit = findViewById<View>(R.id.amazfit)

        hautGauche.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        appleWatch.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        hautDroit.setOnClickListener {
            // Redirigez vers l'activité MainActivity2
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        galaxywatch.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        // Ajoutez un gestionnaire de clic à basGauche
        basGauche.setOnClickListener {
            // Redirigez vers l'activité MainActivity2
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        garminfenix.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        // Ajoutez un gestionnaire de clic à basDroit
        basDroit.setOnClickListener {
            // Redirigez vers l'activité MainActivity2
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }

        amazfit.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
    }
}


