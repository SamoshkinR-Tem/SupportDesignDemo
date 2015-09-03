package com.example.d_rom.supportdesigndemo.samoshkin;

/**
 * Created by R-Tem on 03.09.2015.
 */
public class Lecture {

    private String mTitle;
    private String mLecturer;

    public Lecture(String _Title, String _Lecturer) {
        this.mTitle = _Title;
        this.mLecturer = _Lecturer;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getLecturer() {
        return mLecturer;
    }

    public void setLecturer(String mLecturer) {
        this.mLecturer = mLecturer;
    }
}
