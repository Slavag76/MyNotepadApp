package com.testlslavag76.mynotepadapp.ui.details;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.testlslavag76.mynotepadapp.NotepadStructure;
import com.testlslavag76.mynotepadapp.R;

public class NoteDetailsActivity extends AppCompatActivity {

    public static final String ARG_NOTE = "ARG_NOTE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_details);


        if (savedInstanceState == null) {

            NotepadStructure note = getIntent().getParcelableExtra(ARG_NOTE);

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, NoteDetailsFragment.newInstance(note))
                    .commit();
        }


    }
}