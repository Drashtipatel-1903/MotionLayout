package com.example.motionlayoutdemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayoutdemo2.databinding.ActivityMainBinding
import com.example.motionlayoutdemo2.databinding.ActivityRecyclerviewWithMotionLayoutBinding

class RecyclerviewWithMotionLayout : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerviewWithMotionLayoutBinding
    private var list = ArrayList<modal>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this , R.layout.activity_recyclerview_with_motion_layout)

        binding.rvMain.layoutManager = LinearLayoutManager(this , RecyclerView.VERTICAL , false)
        list.addAll(foodDummyData)
        val adapter : MyAdapter = MyAdapter(list)
        binding.rvMain.adapter = adapter

    }
}