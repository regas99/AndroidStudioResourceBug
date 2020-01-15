package com.example.idtest

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val listener = View.OnClickListener {
        val count = (it.getTag(R.id.TAG) as Int) + 1
        textview.text = count.toString()
        it.setTag(R.id.TAG, count)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.apply {
            setOnClickListener(listener)
            setTag(R.id.TAG, 0)
        }
    }


}
