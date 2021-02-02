/*
 * Author: Yeohan Lorenzo Nornona     S11
 *         CCINFOM
 */

package enrollment;
import java.sql.*;
import java.util.*;

public class drop {
  
    students                        Student         = new students();
    public ArrayList<enrollment>    EnrollmentList  = new ArrayList<> ();
    public ArrayList<enrollment>    DropList        = new ArrayList<> ();

    public drop() {};                                   // perform all the necessary data loading from DB
    public int clearDrop () {
        try {
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/enrolldb?useTimezone=true&serverTimezone=UTC&user=root&password=12345678");
            System.out.println("Connection Successful.");

            PreparedStatement pstmt = conn.prepareStatement("DELETE FROM enrollment WHERE Student.studentid=?");  
            pstmt.setLong(1, Student.studentid);
            
            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
            return 1; // Return 1 if successful
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }  
    
    }   // clears dropping data of the student
    
    public int loadEnrollment () {
        return 0;   
    
    }   // load enrollment data of the student 
    
    public int confirmDrop() {
        return 0;   
    
    }   // saves dropping data into the Database
    
}

