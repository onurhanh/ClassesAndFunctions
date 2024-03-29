package com.onurhanhacimustafaoglu.classesandfunctions

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var myTextView : TextView
    lateinit var myButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView = findViewById(R.id.textView)
        myButton = findViewById(R.id.button)



        /*
        myButton.setOnClickListener{
            myTextView.text = "button clicked 2"
        }
        */


        // 1) code block, resuable 2) input 3) output - return

        // println("hello kotlin")
        test()
        val sumResult = mySum(10, 15)
        val result = myMultiply(10, 20)

        println(sumResult)
        println(result)


        //Class

        val homer = Simpson()
        homer.name = "Homer Simpson"
        homer.age = 50
        homer.job = "Nuclear"
        println(homer.name)

    }


    fun test(){
       // println("test function")
    }

    fun mySum(a:Int, b:Int){

    }

    fun myMultiply(x: Int, y: Int) : Int {
      //  println(x*y)
       val result = x * y
        myTextView.text = "Result: ${result}"
        return result

    }

    fun buttonClicked(view : View){
        myTextView.text = "Button Clicked"
    }


    }
