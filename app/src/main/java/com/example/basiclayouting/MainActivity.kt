package com.example.basiclayouting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }

    private val flButtonLeft: FrameLayout by lazy {
        // mencari component dengan id fl_button_left
        findViewById(R.id.fl_button_left)
    }

    //  bisa pake ini juga, please find out how
    //  private lateinit var flButtonRight: FrameLayout

    private val flButtonRight: FrameLayout by lazy {
        findViewById(R.id.fl_button_right)
}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_constraint)
        flButtonLeft.setOnClickListener {
            // listen ketika button left ditekan
            Log.d(TAG, "onCreate: Button Left Clicked")
            Toast.makeText(this, "Button Left Clicked", Toast.LENGTH_SHORT).show()
        }
        flButtonRight.setOnClickListener {
            // listen ketika button right ditekan
            Log.d(TAG, "onCreate: Button Right Clicked")
            Toast.makeText(this, "Button Right Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}