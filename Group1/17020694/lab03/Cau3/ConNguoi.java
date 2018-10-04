package com.company;

public class ConNguoi {
    int age;
    int height;
    String name;
    boolean sex;

    public ConNguoi(int age, int height, String name, boolean sex, String job) {
        this.age = age;
        this.height = height;
        this.name = name;
        this.sex = sex;
        this.job = job;
    }

    String job;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void goToWork()
    {
        return;
    }
    public void goToBed()
    {
        return;
    }
    public void eat()
    {
        return;
    }
    public void think()
    {
        return;
    }
    public void sing(){
        return;
    }

}
