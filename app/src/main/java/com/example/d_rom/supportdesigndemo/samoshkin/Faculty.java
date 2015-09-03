package com.example.d_rom.supportdesigndemo.samoshkin;

import java.util.ArrayList;

/**
 * Created by R-Tem on 03.09.2015.
 */
public class Faculty {

    private String mFacTitle;
    private ArrayList<Student> mStudents;

    public Faculty(String _FacTitle, ArrayList<Student> _Students) {
        this.mFacTitle = _FacTitle;
        this.mStudents = _Students;
    }

    public String getFacTitle() {
        return mFacTitle;
    }

    public void setFacTitle(String mFacTitle) {
        this.mFacTitle = mFacTitle;
    }

    public ArrayList<Student> getStudents() {
        return mStudents;
    }

    public void setStudents(ArrayList<Student> mStudents) {
        this.mStudents = mStudents;
    }
}
