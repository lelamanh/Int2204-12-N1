package com.company;

public class Dog {
    double weight;
    int age;
    boolean sex;

    public Dog(double weight, int age, boolean sex) {
        this.weight = weight;
        this.age = age;
        this.sex = sex;
    }

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

    public void bark()
    {
        return;
    }
}
