package com.example.d_rom.supportdesigndemo.samoshkin;

import java.util.ArrayList;

/**
 * Created by R-Tem on 03.09.2015.
 */
public class University {

    private String mTitle;
    private ArrayList<Faculty> mFaculties;

    public University(String _Title, ArrayList<Faculty> _Faculties) {
        this.mTitle = _Title;
        this.mFaculties = _Faculties;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public ArrayList<Faculty> getFaculties() {
        return mFaculties;
    }

    public void setFaculties(ArrayList<Faculty> mFaculties) {
        this.mFaculties = mFaculties;
    }

    private Faculty getFaculty(){
        Faculty faculty = new Faculty();
        return faculty;
    }
}