package com.test.a247demo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.test.a247demo.Adapter.UserAdapter
import com.test.a247demo.Model.Result
import com.test.a247demo.ViewM0del.HomeViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        viewModel.getUser()?.observe(this, Observer {
            setUpList(it)
        })
    }


    fun setUpList(users: List<Result>) {
        progress_bar.visibility = View.GONE
        list.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = UserAdapter(users)
        }
    }
}