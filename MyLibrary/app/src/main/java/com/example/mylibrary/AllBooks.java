package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllBooks extends AppCompatActivity {
    private RecyclerView recView;
    private BooksRecAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);

        recView=findViewById(R.id.recView);
        adapter=new BooksRecAdapter(this);
        recView.setAdapter(adapter);
        recView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Book> books=new ArrayList<>();

        books.add(new Book(1,"1Q64","Haruki Murakami",1250,"https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1483103331l/10357575.jpg",
                "Meddning Novel","Long description"));
        adapter.setBooks(books);


    }
}