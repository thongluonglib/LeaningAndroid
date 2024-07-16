package com.example.recycleviewlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ds = mutableListOf<OutData>()
        ds.add(OutData(R.drawable.pick, "Pick", "Phim Việt Nam"));
        ds.add(OutData(R.drawable.pick2, "Pick 2", "Phim Việt Nam"));
        ds.add(OutData(R.drawable.pick2, "Tiger", "Phim Amazone"));
        ds.add(OutData(R.drawable.tree, "Tree", "Phim Tree"));
        ds.add(OutData(R.drawable.pick, "Pick", "Phim Việt Nam"));
        ds.add(OutData(R.drawable.pick2, "Pick 2", "Phim Việt Nam"));
        ds.add(OutData(R.drawable.pick2, "Tiger", "Phim Amazone"));
        ds.add(OutData(R.drawable.tree, "Tree", "Phim Tree"));
        val adapter = RvAdapter(ds);
        rvFilmList.adapter = adapter
        rvFilmList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}