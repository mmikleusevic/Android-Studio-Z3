package com.example.marin.zadatak4;
public class BMI {
    private double height;
    private double weight;
    private double bmi;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public BMI(double heighta, double weighta){
        height=heighta;
        weight=weighta;
        bmi=weight/(height*height);
    }
}

