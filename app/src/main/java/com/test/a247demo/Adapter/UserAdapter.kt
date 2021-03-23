package com.test.a247demo.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.test.a247demo.Model.Result
import com.test.a247demo.R
import kotlinx.android.synthetic.main.item_movie.view.*


class UserAdapter(val users: List<Result>) : RecyclerView.Adapter<UserViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        return holder.bind(users[position])
    }
}

class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

//    private val title:TextView = itemView.findViewById(R.id.name)
//    private val overview:TextView = itemView.findViewById(R.id.email)
//    private val rating:TextView = itemView.gender

    fun bind(user: Result) {
        itemView.name.text = "Title: " + user.name
        itemView.email.text = "Email: " + user.email
        itemView.gender.text = "Rating : " + user.gender
    }

}
