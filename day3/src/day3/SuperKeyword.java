package com.capg;


class Animal
{  
    void eat()
    {
        System.out.println("eating...");
    }  
}  
class Dog extends Animal
{  
    void eat()
    {
        System.out.println("eating bread...");
    }  
    void bark()
    {
        System.out.println("barking...");
    }  
    void work()
    {  
    super.eat();  //Used to call eat() from base/parent class
    bark();  
    }  
}  
public class SuperKeyword
{  
    public static void main(String aa[])
    {  
    Dog d = new Dog();  
    d.work();  
    }
} 
