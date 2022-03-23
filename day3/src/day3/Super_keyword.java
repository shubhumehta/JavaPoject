//Using Super keyword [super()]

class mysuper1
{
    String name = "rohit";

}
class mysuper extends mysuper1
{
    String name = "mohit";

    public void display()
    {
        System.out.println(name);   //It  will print mohit and not rohit.
        System.out.println(super.name);   //I will print rohit and not mohit.
    }
}

public class super_keyword {
    public static void main(String[] args) {
        mysuper m = new mysuper();
        m.display();  
        m.display();
    }
}
