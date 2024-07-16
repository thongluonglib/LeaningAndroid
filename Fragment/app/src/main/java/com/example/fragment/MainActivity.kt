package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var sub1 = Fragment1();
        var sub2 = Fragment2();
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl1, sub1)
            commit()
        }
        btnf1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl1, sub1)
                commit()
            }
        }
        btnf2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fl1, sub2)
                commit()
            }
        }
    }

}