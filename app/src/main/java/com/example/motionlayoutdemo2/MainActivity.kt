package com.example.motionlayoutdemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayoutdemo2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var list = ArrayList<modal>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this , R.layout.activity_main)

        binding.recyclerView.layoutManager = LinearLayoutManager(this , RecyclerView.VERTICAL , false)
        list.addAll(foodDummyData)
        val adapter : RevAdapter = RevAdapter(list)
        binding.recyclerView.adapter = adapter

        //binding.motionLayout.enableTransition()
    }
}