package Sqldemo;
import java.util.Scanner;
import java.sql.*;
public class Usingmenu {

	public static void main(String[] args) throws Exception,SQLException {
		// TODO Auto-generated method stub
		//Create a menu driven program where the options would be
		//1. Insert a new Row 
		//2. Update a Row
		//3. Delete a Row
		//4. Select the row
		//5. Exit
		Scanner sc= new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techm?autoReconnect=true&useSSL=false","root","tiger");
		 System.out.println("\nSelect an option:");
         System.out.println("1. Insert a new Row");
         System.out.println("2. Update a Row");
         System.out.println("3. Delete a Row");
         System.out.println("4. Select the Row");
         System.out.println("5. Exit");
         int choice=sc.nextInt();
         switch(choice)
         {
        	 case 1:
        		 System.out.println("Enter new id:");
                 int id = sc.nextInt();
                 System.out.println("Enter new name:");
                 String name = sc.next();
                 System.out.println("Enter new age:");
                 int age = sc.nextInt();
                 String query="INSERT INTO Employee(id,name,age) VALUES(?,?,?)";
                 PreparedStatement p=con.prepareStatement(query);
                 p.setInt(1, id);
                 p.setString(2, name);
                 p.setInt(3, age);
                 int n=p.executeUpdate();
                 if(n>0)
        			 System.out.println("row successfully inserted");
        		 else
        			 System.out.println("failed to inserted");
                 break;
        	 case 2:
        		 System.out.println("Enter id to be updated");
        		 int i=sc.nextInt();
        		 System.out.println("Enter new name");
        		 String namee=sc.next();
        		 System.out.println("Enter new age");
        		 int agee=sc.nextInt();
        		String updatequery="UPDATE Employee SET name=?,age=? WHERE id=?";
        		 PreparedStatement p1 = con.prepareStatement(updatequery);
        		 p1.setString(1, namee);
        		 p1.setInt(2, agee);
        		 p1.setInt(3,i);
        		 int updated=p1.executeUpdate();
        		 if(updated>0)
        			 System.out.println("rows are successfully updated");
        		 else
        			 System.out.println("failed to update");
        		 break;
        	 case 3:
        		 System.out.println("enter id need to be deleted");
        			int idd=sc.nextInt();
        			 String delquery = "DELETE FROM Employee WHERE id = ?";
        			 PreparedStatement p2 = con.prepareStatement(delquery);
        			 p2.setInt(1, idd);
        			 int deleted=p2.executeUpdate();
        			 if(deleted>0)
        				 System.out.println("row successfully deleted");
        			 else
        				 System.out.println("failed to deleted");
        			 break;
        	 case 4:
        		 System.out.println("Enter id to fetch data:");
                 int selId = sc.nextInt();
                 String selectQuery = "SELECT * FROM Employee WHERE id=?";
                 PreparedStatement selectStmt = con.prepareStatement(selectQuery);
                 selectStmt.setInt(1, selId);
                 ResultSet rs = selectStmt.executeQuery();
                 if (rs.next()) {
                     System.out.println("ID: " + rs.getInt("id"));
                     System.out.println("Name: " + rs.getString("name"));
                     System.out.println("Age: " + rs.getInt("age"));
                 } else {
                     System.out.println("No row found with the given id.");
                 }
                 break;
        	 case 5:
        		 System.out.println("exiting");
        		 con.close();
                 sc.close();
                 break;
             default:
            	 System.out.println("invalid choice");
         }
	}

}
