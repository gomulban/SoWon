package com.example.sowon;

public class Will {
    private String text;
    private String start;
    private String due;
    private int rate;
    private String alarm;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDue() {
        return text;
    }

    public void setDue(String due) {
        this.due = due;
    }

    public int getRate() {
        return rate;
    }

    public void setText(int rate) {
        this.rate = rate;
    }

    public String getAlarm() {
        return alarm;
    }

    public void setAlarm(String alarm) {
        this.alarm = alarm;
    }

    @Override
    public String toString() {
        return "Will{" +
                "text=" + text +
                ", start=" + start +
                ", due=" + due +
                ", rate=" + rate +
                ", alarm=" + alarm + "}";
    }
}
