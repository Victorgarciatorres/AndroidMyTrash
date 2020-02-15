package com.example.mytrash

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.Log
import android.view.View
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_product.view.*

class InterventionHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
    private var view: View = v
    private var item: Product? = null

    private lateinit var listener: ProductFragment.HolderDelegate

    init {
        v.setOnClickListener(this)
    }

    override fun onClick(v: View) {

//        item?.let {
//            if (it.polls < 0) {
//                Log.d("RecyclerView", "CLICK!")
//                logDebug("clickCard ${item?.title}")
//
//                listener.onInterventionClicked(it)
//            }
//        }


    }

    fun bind(item: Product, listener: ProductFragment.HolderDelegate) {

        this.item = item
        this.listener = listener


//        view.imageProduct.setBackgroundResource(R.drawable.botella)
//        Glide.with(view).load(item.icon).into(view.imageProduct)
//        view.textProduct.text = item.name

//        val name: String = "",
//        val icon: String = "",
//        val desciption: String = "",
//        val contaminate: Int
    }
}