package com.rohit.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }

    private fun setListener() {
        val clickableViews: List<View> = listOf(box1_text, box2_text, box3_text, box4_text, box5_text,
                                                    red_button, orange_button, blue_button, constraint_layout)

        for (item in clickableViews)
        {
            item.setOnClickListener {
                makeColered(it)
            }
        }
    }

    private fun makeColered(view: View) {
        when(view.id)
        {
            // setting color use Color class
            R.id.box1_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box2_text -> view.setBackgroundColor(Color.GRAY)

            // Setting color using Android Color Resources
            R.id.box3_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box4_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box5_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.red_button -> box3_text.setBackgroundResource(android.R.color.holo_red_light)
            R.id.blue_button -> box4_text.setBackgroundResource(android.R.color.holo_blue_light)
            R.id.orange_button -> box5_text.setBackgroundResource(android.R.color.holo_orange_light)


            else -> view.setBackgroundResource(android.R.color.darker_gray)  // for constraint layout
        }

    }
}
