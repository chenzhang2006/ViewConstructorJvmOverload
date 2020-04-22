package com.chenzhang.jvmoverloads.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.chenzhang.jvmoverloads.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpListeners()
    }

    private fun setUpListeners() {
        textInputEditTexts.setOnClickListener { startActivity(Intent(this@MainActivity, TextInputEditTextsActivity::class.java)) }
        buttons.setOnClickListener { startActivity(Intent(this@MainActivity, ButtonsActivity::class.java)) }
        checkBoxes.setOnClickListener { startActivity(Intent(this@MainActivity, CheckBoxesActivity::class.java)) }
    }
}
