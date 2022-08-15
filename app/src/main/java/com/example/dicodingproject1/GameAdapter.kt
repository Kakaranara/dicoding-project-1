package com.example.dicodingproject1

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GameAdapter(private val data : ArrayList<Game>) : RecyclerView.Adapter<GameAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName :TextView = itemView.findViewById(R.id.rvName)
        var image : ImageView = itemView.findViewById(R.id.recvImage)
        var tvGenre : TextView = itemView.findViewById(R.id.rvGenre)
        var buttonDetail : Button = itemView.findViewById(R.id.btnDetail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recv_layout, parent, false);

        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val game = data[position]
        val image = data[position]

        holder.tvName.text = game.nama
        holder.image.setImageResource(game.photo)
        holder.tvGenre.text = game.genre
        holder.buttonDetail.setOnClickListener{
            val intent = Intent(holder.itemView.context, GameDetailActivity::class.java)
            intent.putExtra(GameDetailActivity.PASS_VALUE, game)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}