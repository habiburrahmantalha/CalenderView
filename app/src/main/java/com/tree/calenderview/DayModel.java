package com.tree.calenderview;

/**
 * Created by Talha on 4/5/2017.
 */

class DayModel {

    int day;
    int number;

    public DayModel() {
    }

    public DayModel(int day, int number) {
        this.day = day;
        this.number = number;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
