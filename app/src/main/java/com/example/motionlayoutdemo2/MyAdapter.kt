package com.example.motionlayoutdemo2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayoutdemo2.databinding.ItemsBinding
import com.example.motionlayoutdemo2.databinding.RevItemsBinding

class MyAdapter(private val list: ArrayList<modal>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(val binding: RevItemsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindItems(modal: modal) {
            binding.ivFood.setImageResource(modal.imgId)
            binding.tvTitle.text = modal.title
            binding.tvDescription.text = modal.description
            binding.tvRate.text = modal.rate

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = RevItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val modal = list[position]
        holder.bindItems(modal)

    }

    override fun getItemCount(): Int {
        return list.size
    }

}