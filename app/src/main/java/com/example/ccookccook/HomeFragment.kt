package com.example.ccookccook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    //lateinit var recipeAdapter : RecipeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_recipe.layoutManager = GridLayoutManager(this.context, 2)
        rv_recipe.addItemDecoration(RecipeItemDecoration(14))
        var recipeAdapter = RecipeAdapter(view.context)
        recipeAdapter.datas = RecipeDummy().recipeList() as MutableList<RecipeData>
        recipeAdapter.notifyDataSetChanged()
        rv_recipe.adapter = recipeAdapter
    }

}
