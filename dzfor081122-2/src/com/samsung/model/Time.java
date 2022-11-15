package com.samsung.model;

public class Time {
        int hour, min, sec;

        public Time(int n) {
            this.hour=n/3600;
            n=n%3600;
            this.min=n/60;
            this.sec=n%60;
            //toString();
        }

        public String toString() {
            return hour + ":" + min + ":" + sec;
        }
}
