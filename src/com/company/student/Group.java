package com.company.student;

import com.company.course.Course;

public class Group {
    int count;
    private String startingDate;
    int duration;

    public Group() {}

    public Group(int count, String startingDate, int duration) {
        this.count = count;
        this.startingDate = startingDate;
        this.duration = duration;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        String info = "Count of students is " + this.count + ". Starting date is " +
                this.startingDate + ", duration is " + this.duration + " month.";
        return info;
    }
}
