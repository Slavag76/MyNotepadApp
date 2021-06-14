package com.testlslavag76.mynotepadapp.ui.details;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.testlslavag76.mynotepadapp.NotepadStructure;
import com.testlslavag76.mynotepadapp.R;


public class NoteDetailsFragment extends Fragment {

    private static final String ARG_NOTE = "ARG_NOTE";

    public static NoteDetailsFragment newInstance (NotepadStructure note){
        NoteDetailsFragment fragment = new NoteDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ARG_NOTE, note);
        fragment.setArguments(bundle);
        return fragment;

    }

    public NoteDetailsFragment() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_note_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView noteName = view.findViewById(R.id.notepad_text_name);
        TextView descriptionName = view.findViewById(R.id.notepad_text_description);
        TextView dataName = view.findViewById(R.id.notepad_text_data);

        NotepadStructure note = getArguments().getParcelable(ARG_NOTE);

        noteName.setText(note.getName_field());
        descriptionName.setText(note.getDescription_field());
        dataName.setText(note.getData_value());

    }



}