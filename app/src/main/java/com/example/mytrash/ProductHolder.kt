package com.example.mytrash

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cell_product.view.*

class ProductHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
    override fun onClick(p0: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private var view: View = v
    private var item: Product? = null

    fun bind(item: Product, param: HolderDelegate) {
        this.item = item
        view.textProduct.text = item.name

    }


    interface HolderDelegate {
        fun onProductClicked(itme: Product)
    }

}
