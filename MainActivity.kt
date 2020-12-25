package com.example.kotlin1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView=findViewById(R.id.recycle) as RecyclerView
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        val users=ArrayList<user>()

        users.add(user("Irfan","Solapur")
        )

        users.add(user("Imran","pune"))

        users.add(user("yugandhar","hydrabad"))
        users.add(user("sultan","Gharkul"))
        users.add(user("naaz","Gharkul"))

        users.add(user("Sharad","mumbai"))




        val adapters=customadapter(users)
        recyclerView.adapter=adapters

    }
}
