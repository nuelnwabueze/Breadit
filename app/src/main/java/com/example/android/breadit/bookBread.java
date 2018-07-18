package com.example.android.breadit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class bookBread extends AppCompatActivity {
    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_bread);

        productList = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler);
         recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList.add(
                new Product(
                        "High Taste Bread",
                        "Rumuodara, Port Harcourt",
                        R.drawable.bread, R.drawable.ic_place_black_24dp
                )
        );

        productList.add(
                new Product(
                        "high Taste Bread",
                        "Rumuodara, Port Harcourt",
                        R.drawable.bread, R.drawable.ic_place_black_24dp
                )
        );

        productList.add(
                new Product(
                        "high Taste Bread",
                        "Rumuodara, Port Harcourt",
                        R.drawable.bread, R.drawable.ic_place_black_24dp
                )
        );

        productList.add(
                new Product(
                        "high Taste Bread",
                        "Rumuodara, Port Harcourt",
                        R.drawable.bread, R.drawable.ic_place_black_24dp
                )
        );

        productList.add(
                new Product(
                        "high Taste Bread",
                        "Rumuodara, Port Harcourt",
                        R.drawable.bread, R.drawable.ic_place_black_24dp
                )
        );
        adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);


    }
}
