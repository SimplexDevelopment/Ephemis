package io.github.simplexdevelopment.util;

public class Timer {
    private long lastMS = 0L;

    public boolean hasTimeElapsed(long time, boolean reset) {
        if (System.currentTimeMillis() - this.lastMS >= time) {
            if (reset) {
                this.reset();
            }
            return true;
        }
        return false;
    }

    public void reset() {
        this.lastMS = System.currentTimeMillis();
    }

    public long getLastMS() {
        return this.lastMS;
    }

    public void setLastMS(long lastMS) {
        this.lastMS = lastMS;
    }

    public boolean hasTimeElapsed(long time) {
        return this.hasTimeElapsed(time, true);
    }

    public long getDifference() {
        return System.currentTimeMillis() - this.lastMS;
    }

    public long getDifference(long time) {
        return time - this.lastMS;
    }

    public boolean hasReached(long time) {
        return System.currentTimeMillis() >= this.lastMS + time;
    }

    public String getElapsedTimeString(long time) {
        long timeLeft = time - this.getDifference();
        long days = timeLeft / 86400000L;
        long hours = timeLeft / 3600000L % 24L;
        long minutes = timeLeft / 60000L % 60L;
        long seconds = timeLeft / 1000L % 60L;
        long milliseconds = timeLeft % 1000L;
        return String.valueOf(days) + " Days, " + hours + " Hours, " + minutes + " Minutes, " + seconds + " Seconds, " + milliseconds + " Milliseconds";
    }

    public String getRemainingTimeString(long time) {
        long timeLeft = time - this.getDifference();
        long days = timeLeft / 86400000L;
        long hours = timeLeft / 3600000L % 24L;
        long minutes = timeLeft / 60000L % 60L;
        long seconds = timeLeft / 1000L % 60L;
        long milliseconds = timeLeft % 1000L;
        return days + " Days, " + hours + " Hours, " + minutes + " Minutes, " + seconds + " Seconds, " + milliseconds + " Milliseconds";
    }

    public boolean hasTimeReached(long time) {
        return System.currentTimeMillis() - this.lastMS >= time;
    }

    public long getElapsedTime() {
        return System.currentTimeMillis() - this.lastMS;
    }

    public long getElapsedTime(long time) {
        return time - this.lastMS;
    }

    public long getRemainingTime() {
        return this.lastMS - System.currentTimeMillis();
    }

    public long getRemainingTime(long time) {
        return time - System.currentTimeMillis();
    }

    public boolean delay(float milliSec) {
        return this.hasTimeElapsed((long)milliSec);
    }

    public boolean delay(float milliSec, boolean reset) {
        return this.hasTimeElapsed((long)milliSec, reset);
    }

    public boolean delay(double milliSec) {
        return this.hasTimeElapsed((long)milliSec);
    }

    public boolean delay(double milliSec, boolean reset) {
        return this.hasTimeElapsed((long)milliSec, reset);
    }

    public boolean delay(long milliSec) {
        return this.hasTimeElapsed(milliSec);
    }

    public boolean delay(long milliSec, boolean reset) {
        return this.hasTimeElapsed(milliSec, reset);
    }

    public boolean delay(int milliSec) {
        return this.hasTimeElapsed(milliSec);
    }

    public boolean delay(int milliSec, boolean reset) {
        return this.hasTimeElapsed(milliSec, reset);
    }
}
