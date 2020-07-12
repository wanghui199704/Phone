package com.wang.phone.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.wang.phone.R
import kotlinx.android.synthetic.main.dialpad.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {
    internal  val TAG="MainActivity ---------"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        set_global_Listener()

    }

    fun set_global_Listener(){
        findViewById<ImageView>(R.id.dialog_enter_button).setOnClickListener{
            val intent = Intent(this@MainActivity,DialpadActivity::class.java)
            startActivity(intent)
        }

        val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.quick_dial -> {
                    Log.d(TAG,"quick_dial")
                    return@OnNavigationItemSelectedListener true
                }
                R.id.call_records -> {
                    Log.d(TAG,"call_records")
                    return@OnNavigationItemSelectedListener true
                }
                R.id.contact_book -> {
                    Log.d(TAG,"contact_book")
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }
        findViewById<BottomNavigationView>(R.id.bottom_navigation_bar).setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)


        val mOnMenuItemClickListener=Toolbar.OnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.top_bar_search -> {

                    return@OnMenuItemClickListener true
                }
                R.id.top_bar_search -> {

                    return@OnMenuItemClickListener true
                }
                R.id.top_bar_settings -> {

                    return@OnMenuItemClickListener true
                }
            }
            false
        }
        findViewById<Toolbar>(R.id.top_bar).setOnMenuItemClickListener(mOnMenuItemClickListener)
    }



}