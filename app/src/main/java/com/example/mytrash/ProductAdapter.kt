package com.example.mytrash

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView



class ProductAdapter(
    private val items: MutableList<Product>,
    listener: ProductAdapterDelegate
): RecyclerView.Adapter<ProductHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val inflatedView = parent.inflate(R.layout.cell_product,false)
        return ProductHolder(inflatedView)
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return items.size
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val item = items[position]
        holder.bind(item, object : ProductHolder.HolderDelegate {
            override fun onProductClicked(itme: Product) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })
    }

    interface ProductAdapterDelegate{
        fun onClickProduct(product: Product)
    }
}