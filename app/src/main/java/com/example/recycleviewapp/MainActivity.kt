package com.example.recycleviewapp

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.recycleviewapp.adapter.ItemAdapter
import com.example.recycleviewapp.data.Datasource
import com.example.recycleviewapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = Datasource().loadAffirmations()

        val recycleView = binding.recyclerView
        recycleView.adapter = ItemAdapter(this, myDataset)

        // recycleView.setHasFixedSize(true)

    }
}
