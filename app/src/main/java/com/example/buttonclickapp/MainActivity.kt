package com.example.buttonclickapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private const val TAG = "MainActivity"
private const val TEXT_CONTENT = "TEXT CONTENTS"

class MainActivity : AppCompatActivity() {
    //    private var userInput:EditText? =null
//    private var button: Button? =null
    private var textView: TextView? = null
//    private var numTimesClicked = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate:called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput: EditText = findViewById<EditText>(R.id.editText)
        val button: Button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)
        textView?.text = ""
        userInput.setText("")
        textView?.movementMethod = ScrollingMovementMethod()

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View) {
                Log.d(TAG, "onClick: called")
//                numTimesClicked +=1
//                textView?.append(" This Button got tapped $numTimesClicked time")
//                if (numTimesClicked>1){
//                    textView?.append("s\n")
//                }else{
//                    textView?.append("\n")
//                }
                textView?.append(userInput.text)
                textView?.append("\n")
//                userInput.text.clear()
                userInput.setText("")


            }
        })
    }

    override fun onStart() {
        Log.d(TAG, "onStart : called")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG, "onRestoreInstanceState : called")
        super.onRestoreInstanceState(savedInstanceState)
        textView?.text = savedInstanceState.getString(TEXT_CONTENT, "")
    }

    override fun onResume() {
        Log.d(TAG, "onResume : called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause : called")
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG, "onSaveInstanceState : called")
        super.onSaveInstanceState(outState)
        outState.putString(TEXT_CONTENT, textView?.text.toString())
    }

    override fun onStop() {
        Log.d(TAG, "onStop : called")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(TAG, "onRestart : called")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy : called")
        super.onDestroy()
    }
}