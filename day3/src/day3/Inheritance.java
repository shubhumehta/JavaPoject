//Example of multiplevel and single inheritance
package day3;
class Animal
{
    public void show()
    {
        System.out.println("ANimal");
    }
}
class dog extends Animal
{
    public void show1()
    {
        System.out.println("dog");
    }
}
class bark extends dog{
    public void show2()
    {
        System.out.println("bark");
    }
}

public class inheritance
{
public static void main(String[] args) {
 
//Single inheritance
dog d = new dog();
d.show1();   
d.show();

 
//Multilevel inhertiance 
 bark d1 = new bark();
 d1.show1();   
 d1.show();    
 d1.show2();
    }
}