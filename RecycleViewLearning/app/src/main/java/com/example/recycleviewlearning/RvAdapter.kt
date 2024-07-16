package com.example.recycleviewlearning

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_item.view.*

class RvAdapter (var ds: List<OutData>): RecyclerView.Adapter<RvAdapter.FilmViewHolder>() {
    inner class  FilmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent, false)
        return FilmViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        holder.itemView.apply {
            txtFilmTitle.text = ds[position].filmTile
            txtFilmSubTitle.text = ds[position].filmSubTitle
            imageFilm.setImageResource(ds[position].filmImage)
        }
    }

    override fun getItemCount(): Int {
       return ds.size
    }

}