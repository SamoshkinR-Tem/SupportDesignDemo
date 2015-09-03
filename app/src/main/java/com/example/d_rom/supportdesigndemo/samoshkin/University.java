package com.example.d_rom.supportdesigndemo.samoshkin;

import java.util.ArrayList;

/**
 * Created by R-Tem on 03.09.2015.
 */
public class University {

    private String mTitle;
    private ArrayList<Student> mStudents;

    public University(String _Title, ArrayList<Student> _Students) {
        this.mTitle = _Title;
        this.mStudents = _Students;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public ArrayList<Student> getStudents() {
        return mStudents;
    }

    public void setStudents(ArrayList<Student> mStudents) {
        this.mStudents = mStudents;
    }
}