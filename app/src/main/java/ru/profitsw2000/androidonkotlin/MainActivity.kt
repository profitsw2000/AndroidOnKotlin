package ru.profitsw2000.androidonkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import ru.profitsw2000.androidonkotlin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animalList: List<Animal> = listOf(Animal("Dog", "Caddy", 9), Animal("Croc", "Jane", 39), Animal("Lion", "Maasai", 10))
        for (animal in animalList) {
            Log.d("AnmlDbg", animal.kind + ": " + animal.name + " " + animal.age)
        }

        for (i in 1..10) {
            Log.d("Cycle", "Round " + i)    ;
        }

        val clickMessage: TextView = findViewById(R.id.click_text)  ;
        val output: TextView = findViewById(R.id.objectText)    ;

        val button: Button = findViewById(R.id.button_listener) ;
        button.setOnClickListener{
            clickMessage.visibility = View.VISIBLE  ;
            val animal = Animal("Cat", "Bob", 5)
            clickMessage.text = animal.kind + ", " + animal.name + ", " + animal.age;

            //copy object and display it
            val animalCopy = animal.copy("Cat","Garny", 6)
            output.text = "Cat name is ${animalCopy.name} and it is ${animalCopy.age} years old"
        }
    }
}