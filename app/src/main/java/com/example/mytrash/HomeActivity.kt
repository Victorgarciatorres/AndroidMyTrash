package com.example.mytrash

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_product.*

class HomeActivity : Fragment(), OnFragmentActionsListener {
    override fun OnClickFragmentButton() {
       Log.d("asd","Boton pulsado")
    }
    private lateinit var linearLayoutManager: LinearLayoutManager
    private var items: MutableList<Product> = mutableListOf()
    private var listener: ProductFragment.OnFragmentInteractionListener? = null
    private lateinit var adapter: ProductAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
        inflater.inflate(R.layout.activity_home, container, false)!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        linearLayoutManager = LinearLayoutManager(context)
        recycler.layoutManager = linearLayoutManager

//        getProducts()

        adapter = ProductAdapter(items, listener = object: ProductAdapter.ProductAdapterDelegate {
            override fun onClickProduct(product: Product) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                Log.d("asd", "Click en la celda")
            }

        })
    }

    private fun getProducts() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }


}
