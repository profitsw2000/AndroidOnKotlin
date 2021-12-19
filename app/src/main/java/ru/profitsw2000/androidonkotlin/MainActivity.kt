package ru.profitsw2000.androidonkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.profitsw2000.androidonkotlin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}