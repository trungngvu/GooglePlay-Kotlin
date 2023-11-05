package com.example.googleplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = ArrayList<Category>();
        val apps1 = ArrayList<App>();
        val app11 = App( "image", "NeuroNation - Brain Training", "4.9");
        val app12 = App( "image", "Learn R programming", "5.0");
        val app13 = App("image", "Wikipedia", "4.6");
        val app14 = App("image", "Ielts", "4.6");
        apps1.add(app11);
        apps1.add(app12);
        apps1.add(app13);
        apps1.add(app14);
        val category1 = Category("Educational", apps1);

        val apps2 = ArrayList<App>();
        val app21 = App( "image", "Home Workout- No Equipment", "4.9");
        val app22 = App( "image", "Calm -Sleep, meditate, Relax", "5.0");
        val app23 = App("image", "Medsacpe", "4.6");
        val app24 = App("image", "Snapseed", "4.6");

        apps2.add(app21);
        apps2.add(app22);
        apps2.add(app23);
        apps2.add(app24)
        val category2 = Category("Game", apps2);

        val apps3 = ArrayList<App>();
        val app31 = App( "image", "Home Workout- No Equipment", "4.9");
        val app32 = App( "image", "Calm -Sleep, meditate, Relax", "5.0");
        val app33 = App("image", "Medsacpe", "4.6");
        val app34 = App("image", "Medsacpe", "4.6");
        apps3.add(app31);
        apps3.add(app32);
        apps3.add(app33);
        apps3.add(app34);
        val category3 = Category("Health & fitness", apps3);

        data.add(category1);
        data.add(category2);
        data.add(category3);


        val categoryAdapter  = CategoryAdapter( data, this);
        val rvApp = findViewById<RecyclerView>(R.id.categories)
        val layoutManager = LinearLayoutManager( this, LinearLayoutManager.VERTICAL, false)
        rvApp.layoutManager = layoutManager
        rvApp.adapter = categoryAdapter


    }



}