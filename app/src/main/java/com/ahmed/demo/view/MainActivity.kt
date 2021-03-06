package com.ahmed.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ahmed.demo.view.ProductListFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.frag_container, ProductListFragment()).commit()
    }
}
