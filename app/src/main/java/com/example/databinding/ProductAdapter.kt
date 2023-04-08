package com.example.databinding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.databinding.databinding.ItemProductBinding

class ProductAdapter (private var listProduct : ArrayList<ListProduct>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>(){
    var onClick : ((ListProduct) -> Unit)? = null


    class ViewHolder (val binding : ItemProductBinding):RecyclerView.ViewHolder(binding.root){
        fun bindProduct(itemProduct : ListProduct){
            binding.product = itemProduct
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductAdapter.ViewHolder {
        var view = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var dataProduct = listProduct[position]
        holder.bindProduct(listProduct[position])

    }

    override fun getItemCount(): Int {
        return listProduct.size
    }

}
