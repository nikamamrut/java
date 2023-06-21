public class Customer
{
    String cust_nm;
    int age;
    long contact_num;
    boolean membership;
    int reward_points;

    // Default constructor
    Customer()
    {
        this.cust_nm = "";
        this.age = 0;
        this.contact_num = 0;
        this.membership = false;
        this.reward_points = 0;
    }

    // Constructor with all attributes
    Customer(String cust_nm, int age , long contact_num , boolean membership, int reward_points)
    {
        this.cust_nm = cust_nm;
        this.age = age;
        this.contact_num = contact_num;
        this.membership = membership;
        this.reward_points = reward_points;
    }

    // Constructor with only name and contact number
    Customer(String cust_nm, long contact_num)
    {
        this.cust_nm = cust_nm;
        this.contact_num = contact_num;
        this.age = 0;
        this.membership = false;
        this.reward_points = 0;
    }

    // Constructor with only name and membership status
    Customer(String cust_nm, boolean membership)
    {
        this.cust_nm = cust_nm;
        this.membership = membership;
        this.age = 0;
        this.contact_num = 0;
        this.reward_points = 0;
    }

    public void display()
    {
        System.out.println("Name: " + cust_nm);
        System.out.println("Memebership: " + membership);
        System.out.println("Contact: " + contact_num);
        System.out.println("Age: " + age);
        System.out.println("Rewards: " + reward_points);
    }

    public static void main(String[] args)
    {
        // Create a customer using the default constructor
        Customer c1 = new Customer();
        // Create a customer using the constructor with all attributes
        Customer c2 = new Customer("Amrut", 23, 741074411, true, 100);
        c2.display();

    }
}