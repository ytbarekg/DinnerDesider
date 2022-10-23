package edu.miu.mdp.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var list = ArrayList<String>(Arrays.asList("Hamburger", "Pizza",
            "Mexican", "American", "Chinese"));
        decide.setOnClickListener{
            var selected = list.get(Random().nextInt(list.size))
            chosenFood.text = selected
        }

        addFood.setOnClickListener{
            list.add(newFoodName.text.toString());
            println(newFoodName.text.toString())
        }

    }
}