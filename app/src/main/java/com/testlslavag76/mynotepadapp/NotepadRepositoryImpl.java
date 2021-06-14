package com.testlslavag76.mynotepadapp;

import java.util.ArrayList;
import java.util.List;

public class NotepadRepositoryImpl implements NotepadRepository {

    @Override
    public List<NotepadStructure> getNotepads() {
        ArrayList<NotepadStructure> result = new ArrayList<>();

        NotepadStructure note1 = new NotepadStructure(R.string.note_1, R.string.description_1, R.string.date_1);
        NotepadStructure note2 = new NotepadStructure(R.string.note_2, R.string.description_2, R.string.date_2);
        NotepadStructure note3 = new NotepadStructure(R.string.note_3, R.string.description_3, R.string.date_3);
        NotepadStructure note4 = new NotepadStructure(R.string.note_4, R.string.description_4, R.string.date_4);
        NotepadStructure note5 = new NotepadStructure(R.string.note_5, R.string.description_5, R.string.date_5);
        NotepadStructure note6 = new NotepadStructure(R.string.note_6, R.string.description_6, R.string.date_6);


        result.add(note1);
        result.add(note2);
        result.add(note3);
        result.add(note4);
        result.add(note5);
        result.add(note6);

        return result;

    }
}
