package com.example.ccookccook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main_viewpager.adapter= MainPageAdapter(supportFragmentManager)
        main_viewpager.offscreenPageLimit = 2
        main_viewpager.setSwipePagingEnabled(false)
        main_viewpager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                bt_navigation.menu.getItem(position).isChecked = true
            }

        })

        bt_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_home -> main_viewpager.currentItem = 0
                R.id.menu_history ->main_viewpager.currentItem = 2
            }
            true
        }
/*
        fab.setOnClickListener(View.OnClickListener() {
            o
        })
*/

    }
}
