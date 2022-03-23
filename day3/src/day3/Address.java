
//Aggregation exapmple using address.java into employee.java
package aggregation;

public class address {
    String city;
    String state;
    String country; 

    address(String city,String state,String country)
    {
        this.state = state;
        this.city = city;
        this.country = country;
    }

    //Used to convert address hashcode into value.
        @Override
        public String toString()
        {
            return "Address[city= " + city +", state= " + state +", country= " + country +"]";
        }

}
