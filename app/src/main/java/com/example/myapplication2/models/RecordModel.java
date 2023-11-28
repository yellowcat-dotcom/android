package com.example.myapplication2.models;
import java.util.Date;

public class RecordModel {
    private int caloriesBurned;
    private double distance;
    private Date timestamp;
    public RecordModel(int caloriesBurned, double distance) {
        this.caloriesBurned = caloriesBurned;
        this.distance = distance;
        this.timestamp = new Date(); // Автоматически устанавливаем текущую дату и время при создании записи
    }

    // Геттеры и сеттеры

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

}
