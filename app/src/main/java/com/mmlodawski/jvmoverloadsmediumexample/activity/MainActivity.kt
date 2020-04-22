package com.mmlodawski.jvmoverloadsmediumexample.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mmlodawski.jvmoverloadsmediumexample.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpListeners()
    }

    private fun setUpListeners() {
        buttons.setOnClickListener { startActivity(Intent(this@MainActivity, ButtonsActivity::class.java)) }
        textInputEditTexts.setOnClickListener { startActivity(Intent(this@MainActivity, ButtonsActivity::class.java)) }
        checkBoxes.setOnClickListener { startActivity(Intent(this@MainActivity, ButtonsActivity::class.java)) }
    }
}
