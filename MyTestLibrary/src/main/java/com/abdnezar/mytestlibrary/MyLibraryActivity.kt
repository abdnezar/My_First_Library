package com.abdnezar.mytestlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MyLibraryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_library)
        Toast.makeText(this, "hello first library", Toast.LENGTH_SHORT).show()
    }
}