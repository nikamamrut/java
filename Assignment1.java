//q13
import java.sql.*;
import java.util.Scanner;

//import javafx.scene.effect.ColorInput;

public class Assignment1 {
    public static void main(String[] args) {
        // create a connection to the MySQL database
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "root";
            String password = "";

        try {
            // Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
        
            Scanner scanner = new Scanner(System.in);
            
            int choice;
            do{
                // display menu and get user input
            System.out.println("Blood Donor Application");
            System.out.println("1. Insert blood donor details into database");
            System.out.println("2. Display blood group-wise details of donors");
            System.out.println("3. Update the address of a specific donor");
            System.out.println("4. Delete the record of donors whose age is below 18");
            System.out.println("5. Exit");
            choice = scanner.nextInt();

            if(choice<1 || choice>5){
                System.out.println("Invalid choice");
            }

           

            if(choice==1){
                System.out.println("Inserting blood donor details into database...");
                        
                        // get user input for blood donor details
                        System.out.print("Enter donor Id: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter donor name: ");
                        String name = scanner.next();
                        System.out.print("Enter donor blood group: ");
                        String bloodGroup = scanner.next();
                        System.out.print("Enter donor address: ");
                        String address = scanner.next();
                        
                        PreparedStatement ps = con.prepareStatement("insert into bloodDonor values(?, ?, ?, ?)");

                        ps.setInt(1, id);
                        ps.setString(2, name);
                        ps.setString(3, bloodGroup);
                        ps.setString(4, address);

                        ps.executeUpdate();
                        System.out.println("Donor details have been inserted successfully");
            }
           
            if(choice==2){
                 System.out.println("Displaying blood group-wise details of donors...");
                        PreparedStatement ps = con.prepareStatement("SELECT * FROM bloodDonor ORDER BY bloodgroup");

                        ResultSet rs = ps.executeQuery();
                        
                        // display donor details
                        String prevBloodGroup = "";

                        while (rs.next()) {
                            int id = rs.getInt(1);
                            String name = rs.getString(2);
                            String bloodGroup = rs.getString(3);
                            String address = rs.getString(4);
                            
                            System.out.print(" id : " + id);
                            System.out.print(" name: " + name);
                            System.out.println(" blood group "+ bloodGroup);
                            System.out.print(" address: " + address);
                            System.out.println();
                            
                        }
            }
           
            if(choice==3){
                System.out.println("Updating the address of a specific donor...");
                        
                        // get user input for donor name and new address
                        System.out.print("Enter donor id ");
                        int id = scanner.nextInt();
                        System.out.print("Enter new address: ");
                        String address = scanner.next();
                        
                        PreparedStatement ps = con.prepareStatement("update bloodDonor set address=? where id=?");

                        ps.setString(1, address);
                        ps.setInt(2, id);
                        int rowsUpdated = ps.executeUpdate();

                        if (rowsUpdated > 0) {
                            System.out.println("Address of donor has been updated successfully ");
                        } else {
                            System.out.println("No such donor found in the database");
                        }
            }
           
            if(choice==4){
                        System.out.println("Deleting the record of donors whose age is below 18...");
                        
                         PreparedStatement ps = con.prepareStatement("DELETE FROM bloodDonor WHERE age < 18");

                        int rowsDeleted = ps.executeUpdate();

                        System.out.println(rowsDeleted + " donor records have been deleted successfully");
            }
             if(choice==5){
                System.out.println("Exiting the Blood Donor Application...");
                return;
            }

        }while(choice!=5);
           
           
           
            
            // close the connection
            con.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
