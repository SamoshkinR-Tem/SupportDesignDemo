package com.example.d_rom.supportdesigndemo.samoshkin;

import java.util.ArrayList;

/**
 * Created by R-Tem on 03.09.2015.
 */
public class Student {

    private String mName;
    private String mAge;
    private String mHeight;
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

    public String getHeight() {
        return mHeight;
    }

    public void setHeight(String mHeight) {
        this.mHeight = mHeight;
    }

    public ArrayList<Lecture> getLectures() {
        return mLectures;
    }

    public void setLectures(ArrayList<Lecture> mLectures) {
        this.mLectures = mLectures;
    }

    public Lecture getLecture(){
        Lecture lecture = new Lecture();
        return lecture;
    }
}