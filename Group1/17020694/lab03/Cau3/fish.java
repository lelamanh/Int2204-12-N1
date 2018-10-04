package com.company;

public class fish {
    double weight;
    int age;
    boolean sex;
    double length;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public fish(double weight, int age, boolean sex, double length) {
        this.weight = weight;
        this.age = age;
        this.sex = sex;
        this.length = length;
    }

    public void swim(){
        return;
    }
}
