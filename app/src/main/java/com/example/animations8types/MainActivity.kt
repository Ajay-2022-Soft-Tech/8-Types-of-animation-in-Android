package com.example.animations8types

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animText = findViewById<TextView>(R.id.textView)
        val fadeIn = findViewById<Button>(R.id.fadeIn)
        val fadeOut = findViewById<Button>(R.id.fadeOut)
        val slideDown = findViewById<Button>(R.id.slideDown)
        val slideUp = findViewById<Button>(R.id.slideUp)
        val zoomIn = findViewById<Button>(R.id.zoomIn)
        val zoomOut = findViewById<Button>(R.id.zoomOut)
        val bounce = findViewById<Button>(R.id.bounce)
        val rotate = findViewById<Button>(R.id.rotate)


        fadeIn.setOnClickListener {
            val animationFadeIn = AnimationUtils.loadAnimation(this,R.anim.fade_in)
            animText.startAnimation(animationFadeIn)
        }

        fadeOut.setOnClickListener {
            val animationFadeIn = AnimationUtils.loadAnimation(this,R.anim.fade_out)
            animText.startAnimation(animationFadeIn)
        }

        zoomIn.setOnClickListener {
            val animationFadeIn = AnimationUtils.loadAnimation(this,R.anim.zoom_in)
            animText.startAnimation(animationFadeIn)
        }

        zoomOut.setOnClickListener {
            val animationFadeIn = AnimationUtils.loadAnimation(this,R.anim.zoom_out)
            animText.startAnimation(animationFadeIn)
        }

        slideUp.setOnClickListener {
            val animationFadeIn = AnimationUtils.loadAnimation(this,R.anim.slide_up)
            animText.startAnimation(animationFadeIn)
        }

        slideDown.setOnClickListener {
            val animationFadeIn = AnimationUtils.loadAnimation(this,R.anim.slide_down)
            animText.startAnimation(animationFadeIn)
        }

        bounce.setOnClickListener {
            val animationFadeIn = AnimationUtils.loadAnimation(this,R.anim.bounce)
            animText.startAnimation(animationFadeIn)
        }

        rotate.setOnClickListener {
            val animationFadeIn = AnimationUtils.loadAnimation(this,R.anim.rotate)
            animText.startAnimation(animationFadeIn)
        }



    }
}