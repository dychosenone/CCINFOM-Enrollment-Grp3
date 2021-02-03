/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrollment;
import java.sql.*;
import java.util.*;

/**
 *
 * @author ccslearner
*/
public class report {
    
    public  ArrayList<courses> CourseList  =  new ArrayList<>();
    public  ArrayList<report> ReportCountList  =  new ArrayList<>();
    public  int term; 
    public  int schoolyear; 
 
    public report() {};                                 // perform all the necessary data loading from DB
    
    public int resetReport() { 
        ReportCountList.clear();
		return 1;
	}
	
    public int generateReport()
    {
      try {
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/enrolldb?useTimezone=true&serverTimezone=UTC&user=root&password=12345678");
            System.out.println("Connection Successful.");
            
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM enrollment");  
            ResultSet rs = pstmt.executeQuery();
            CourseList.clear();

             for (int i = 0; i < ReportCountList.size(); i++)  {
                report re = new  report ();
                re.CourseList.get(i).coursename = rs.getString("coursename"); 
                re.term = rs.getInt("term"); 
                re.schoolyear = rs.getInt("schoolyear"); 
               
            }
            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
            return 1; // Return 1 if successful
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }      
    }
}
