
// Example of Aggregation using Address.java in employee.java
package aggregation;

public class employee {
    int id;
    String name;
    address address;

    employee(int id , String name , address address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: "+ name);
        System.out.println(address.city+" "+address.state+" "+address.country);
        System.out.println(address);  //Gives hashcode of address and toSting() can be used by overriding to get exact values.
        //System.out.println(address.toString());  //Converts hashcode into actual values (line 20 & 21 are exact same) , toSting() is called by default.
    }

    public static void main(String[] args) {
        address a = new address("pune","maharashtra","india");
        address a1 = new address("banglore","karnataka","india");

        employee e = new employee(3,"rohit",a);
        employee e1 = new employee(4,"mohit",a1);

        e1.display();
        e.display();
    }
}
