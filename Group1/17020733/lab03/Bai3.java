/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author CCNE
 */
/*
/*
 *Cat Object
*/
class Cat{
    private String name;//name abtribute;
    Cat(String name){
        this.name = name;//constructor name
    }
    public void Moo(){
        System.out.println("The noisy of cat is MEO");//this method is the noisy of Cat
    }
    public void eat(){
        System.out.println("Cat eat meat");//this method is what CAt eat
    }
}
/*
    Teacher Object
*/
class Teacher{
    private String name;
    private int salary;
    Teacher(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
   
    
    public void salary(){
        System.out.println("Salary is 10 milion ver month");
    }
}

class Box{
    private int weigh;
    Box(){
        weigh = 0;
    }
    public void setWeigh(int w){
        weigh = w;
    }
    public int getWeigh(){
        return weigh;
    }
}
class Laptop{
    private int cost;
    private int weigh;
    public Laptop(int cost, int weigh) {
        this.cost = cost;
        this.weigh = weigh;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }
    
}
class Car{
    private int cost;
    private String color;
    private String hang;

    public Car(int cost, String color, String hang) {
        this.cost = cost;
        this.color = color;
        this.hang = hang;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    
}
class Cake{
    private int cost;
    private String color;

    public Cake(int cost, String color) {
        this.cost = cost;
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
class Student{
    private String name;
    private String group;

    public Student(String name, String group) {
        this.name = name;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    
}
class Tree{
    private int high;
    private String type;

    public Tree(int high, String type) {
        this.high = high;
        this.type = type;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
class Dog{
    private String name;
    private String color;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void moo(){
        System.out.println("Gau Gau");
    }
}
class Game{
    public String name;
    public String type;

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void play(){
        System.out.println("Play this game");
    }
}
public class Bai3 {
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
