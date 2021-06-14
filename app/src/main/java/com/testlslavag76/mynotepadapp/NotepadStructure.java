package com.testlslavag76.mynotepadapp;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.StringRes;

public class NotepadStructure implements Parcelable {

    @StringRes
    private final int name_field;
    @StringRes
    private final int description_field;
    @StringRes
    private final int data_value;

    public NotepadStructure(int name_field, int description_field, int data_value) {
        this.name_field = name_field;
        this.description_field = description_field;
        this.data_value = data_value;
    }

    protected NotepadStructure(Parcel in) {
        name_field = in.readInt();
        description_field = in.readInt();
        data_value = in.readInt();
    }

    public static final Creator<NotepadStructure> CREATOR = new Creator<NotepadStructure>() {
        @Override
        public NotepadStructure createFromParcel(Parcel in) {
            return new NotepadStructure(in);
        }

        @Override
        public NotepadStructure[] newArray(int size) {
            return new NotepadStructure[size];
        }
    };

    public int getName_field() {
        return name_field;
    }

    public int getDescription_field() {
        return description_field;
    }

    public int getData_value() {
        return data_value;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(name_field);
        dest.writeInt(description_field);
        dest.writeInt(data_value);
    }
}
