package com.tsubulko.task_6;

/*
6.	Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому моменту
 */

public class Moment {
    private int startSeconds;
    private int seconds;
    private int minutes;
    private int hours;

    public int getStartSeconds() {
        return startSeconds;
    }

    public void setStartSeconds(int startSeconds) {
        this.startSeconds = startSeconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Moment(int startSeconds) {
        if (startSeconds > 86400) startSeconds = 86400;
        this.startSeconds = startSeconds;
        this.hours = startSeconds / (60*60);
        startSeconds = startSeconds % (60*60);
        this.minutes = startSeconds / 60;
        this.seconds = startSeconds % 60;
    }

    @Override
    public String toString() {
        return "Moment{" +
                "startSeconds=" + startSeconds +
                ", seconds=" + seconds +
                ", minutes=" + minutes +
                ", hours=" + hours +
                '}';
    }
}
