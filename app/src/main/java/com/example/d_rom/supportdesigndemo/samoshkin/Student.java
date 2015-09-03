package com.example.d_rom.supportdesigndemo.samoshkin;

import java.util.ArrayList;

/**
 * Created by R-Tem on 03.09.2015.
 */
public class Student {

    private String mName;
    private String mAge;
    private ArrayList<Lecture> mLectures;

    public Student(String _name, String _age) {
        this.mName = _name;
        this.mAge = _age;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getAge() {
        return mAge;
    }

    public void setAge(String mAge) {
        this.mAge = mAge;
    }

    public ArrayList<Lecture> getLectures() {
        return mLectures;
    }

    public void setLectures(ArrayList<Lecture> mLectures) {
        this.mLectures = mLectures;
    }
}