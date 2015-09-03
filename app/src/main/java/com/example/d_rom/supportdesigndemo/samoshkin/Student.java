package com.example.d_rom.supportdesigndemo.samoshkin;

/**
 * Created by R-Tem on 03.09.2015.
 */
public class Student {

    private String mName;
    private String mAge;

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
}