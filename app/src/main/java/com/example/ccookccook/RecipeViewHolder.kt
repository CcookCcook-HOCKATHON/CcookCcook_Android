package com.example.ccookccook

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecipeViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tv_recipe = itemView.findViewById<TextView>(R.id.tv_recipe)
    val img_recipe = itemView.findViewById<ImageView>(R.id.img_recipe)
    fun bind(recipeData: RecipeData) {
        tv_recipe.text = recipeData.txt_recipe
        Glide.with(itemView).load(recipeData.img_src).into(img_recipe)
    }
}