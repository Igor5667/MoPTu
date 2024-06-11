package com.example.moptu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    private lateinit var toolbar: MaterialToolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.cat_page -> replaceFragment(CatFragment())
        }

        return super.onOptionsItemSelected(item)

    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()

        fragmentTransaction.replace(
            R.id.fragments_layout,
            fragment)
        fragmentTransaction.commit()
    }
}