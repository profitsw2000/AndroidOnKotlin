package ru.profitsw2000.androidonkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import ru.profitsw2000.androidonkotlin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickMessage: TextView = findViewById(R.id.click_text)  ;
        val output: TextView = findViewById(R.id.objectText)    ;

        val button: Button = findViewById(R.id.button_listener) ;
        button.setOnClickListener{
            clickMessage.visibility = View.VISIBLE  ;
            val animal = Animal("Cat", "Bob", 5)
            clickMessage.text = animal.kind + ", " + animal.name + ", " + animal.age;

            //create object, copy() and display it
            val dog = object {
                val name = "Bark"
                val age = 3
                fun copy(){
                    output.text = "Dog name is $name and it is $age years old"
                }
            }   ;
            dog.copy()  ;
        }
    }
}