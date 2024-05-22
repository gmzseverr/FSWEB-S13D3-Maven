package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String city;
    double height;
    boolean isSingle;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName= lastName;
        this.age=age;
    }
    public Person(String firstName, String lastName, int age, boolean isSingle){
        this(firstName,lastName,age);
        this.isSingle=isSingle;

    }
    public Person(String firstName, String lastName, int age, boolean isSingle, double height, String city ){
        this(firstName, lastName, age, isSingle);
        this.height=height;
        this.city=city;

    }

    public String getFirstName(){
        return firstName;
    }
    public  String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return age >= 13 && age < 19;

    }

}
