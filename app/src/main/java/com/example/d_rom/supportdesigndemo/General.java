package com.example.d_rom.supportdesigndemo;

/**
 * Created by R-Tem on 02.09.2015.
 */
public class General {

    private String mLawTitle;
    private String mLawAuthor;

    public General(String _LawTitle, String _LawAuthor) {
        this.mLawTitle = _LawTitle;
        this.mLawAuthor = _LawAuthor;
    }

    public String getLawTitle() {
        return mLawTitle;
    }

    public void setLawTitle(String mLawTitle) {
        this.mLawTitle = mLawTitle;
    }

    public String getLawAuthor() {
        return mLawAuthor;
    }

    public void setLawAuthor(String mLawAuthor) {
        this.mLawAuthor = mLawAuthor;
    }

    public void doSomeThing (){

    }
}
