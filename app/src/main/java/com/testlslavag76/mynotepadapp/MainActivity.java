package com.testlslavag76.mynotepadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.testlslavag76.mynotepadapp.ui.NotepadListFragment;
import com.testlslavag76.mynotepadapp.ui.details.NoteDetailsActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NotepadListFragment.OnNoteClicked {

// Сделаны пункты ДЗ кроме переворота в landscape

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onNoteClicked(NotepadStructure note) {

        Intent intent = new Intent(this, NoteDetailsActivity.class);
        intent.putExtra(NoteDetailsActivity.ARG_NOTE, note);
        startActivity(intent);

    }
}