package com.testlslavag76.mynotepadapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.testlslavag76.mynotepadapp.ui.NotepadListFragment;
import com.testlslavag76.mynotepadapp.ui.details.NoteDetailsActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NotepadListFragment.OnNoteClicked {

// Сделаны пункты ДЗ кроме переворота в landscape

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_appbar, menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int itemId = item.getItemId();

        if (itemId == R.id.option_one){
            Toast.makeText(this, "Option One Selected", Toast.LENGTH_LONG).show();
            return true;
        }



        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onNoteClicked(NotepadStructure note) {

        Intent intent = new Intent(this, NoteDetailsActivity.class);
        intent.putExtra(NoteDetailsActivity.ARG_NOTE, note);
        startActivity(intent);

    }
}