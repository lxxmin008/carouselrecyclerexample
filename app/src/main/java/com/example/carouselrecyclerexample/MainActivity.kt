package com.example.carouselrecyclerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.carouselrecyclerexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)


        val leafletList = ArrayList<LeafletModel>()
        leafletList.add(LeafletModel(R.drawable.avengers, "Avengers"))
        leafletList.add(LeafletModel(R.drawable.born, "Born Legacy"))
        leafletList.add(LeafletModel(R.drawable.drug_king, "마약왕"))
        leafletList.add(LeafletModel(R.drawable.new_world, "신세계"))
        leafletList.add(LeafletModel(R.drawable.thor_1, "Thor"))
        leafletList.add(LeafletModel(R.drawable.up, "Up"))


        val adapter = LeafletAdapter(leafletList)

        binding.apply {
            carouselRecyclerView.adapter = adapter
            carouselRecyclerView.set3DItem(true)
            carouselRecyclerView.setAlpha(true)
            carouselRecyclerView.setInfinite(true)
        }


    }
}