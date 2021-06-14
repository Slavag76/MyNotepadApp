package com.testlslavag76.mynotepadapp.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.testlslavag76.mynotepadapp.NotepadRepository;
import com.testlslavag76.mynotepadapp.NotepadRepositoryImpl;
import com.testlslavag76.mynotepadapp.NotepadStructure;
import com.testlslavag76.mynotepadapp.R;

import java.util.List;

public class NotepadListFragment extends Fragment {


    public interface OnNoteClicked {
        void onNoteClicked(NotepadStructure note);
    }


    private NotepadRepository notepadRepository;

    private OnNoteClicked onNoteClicked;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        if (context instanceof OnNoteClicked) {
            onNoteClicked = (OnNoteClicked) context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();

        onNoteClicked = null;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        notepadRepository = new NotepadRepositoryImpl();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_notepad_list, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayout notspdsList = view.findViewById(R.id.notepad_list_container);
        List<NotepadStructure> notepads = notepadRepository.getNotepads();

        for (NotepadStructure note : notepads) {
            View itemView = LayoutInflater.from(requireContext()).inflate(R.layout.item_notepad, notspdsList, false);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onNoteClicked != null) {
                        onNoteClicked.onNoteClicked(note);
                    }
                }
            });

            TextView notepadName = itemView.findViewById(R.id.notepad_text_name);
            notepadName.setText(note.getName_field());

            notspdsList.addView(itemView);

        }

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
