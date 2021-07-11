package com.kashyap.circularreveallinearlayoutexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var fab: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab = findViewById(R.id.fab)

        fab.setOnClickListener {
            fab.isExpanded = !fab.isExpanded
        }
    }

    override fun onBackPressed() {
        if (fab.isExpanded) {
            fab.isExpanded = false
        } else {
            super.onBackPressed()

        }

    }
}