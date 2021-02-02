package enrollment;
import java.sql.*;
import java.util.*;

public class enroll {

    students                        Student         = new students();
    public ArrayList<enrollment>    EnrollmentList  = new ArrayList<> ();
    public ArrayList<coursedegree>  CourseList      = new ArrayList<> ();
 
    public enroll() {};                                 // perform all the necessary data loading from DB
    
    // clears enrollment data of the student 
    public int clearEnrollment (int studentId)   {   
        
        try {
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/enrolldb?useTimezone=true&serverTimezone=UTC&user=root&password=12345678");
            System.out.println("Connection Successful.");
            
            PreparedStatement pstmt = conn.prepareStatement("DELETE FROM enrollment WHERE studentid=?");  
            pstmt.setInt(1, studentId);
            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
            return 1; // Return 1 if successful
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }       
        
    }
    // load valid courses into the course list
    public int loadCourses () {
        
        try {
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/enrolldb?useTimezone=true&serverTimezone=UTC&user=root&password=12345678");
            System.out.println("Connection Successful.");
            
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM courses");  
            ResultSet rs = pstmt.executeQuery();
            CourseList.clear();
            while(rs.next()) {
                coursedegree cd = new coursedegree ();
                cd.courseid = rs.getString("courseid"); 
                cd.degree = rs.getString("degree");
                CourseList.add(cd);
            }
            
            pstmt.close();
            conn.close();
            return 1; // Return 1 if successful
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    
    }
    public int confirmEnrollment()  {   
        
        try {
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/enrolldb?useTimezone=true&serverTimezone=UTC&user=root&password=12345678");
            System.out.println("Connection Successful.");
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO enrollment VALUES(?,?,?,?)");
            
			for (int i = 0; i < EnrollmentList.size(); i++) {
				pstmt.setInt(1, EnrollmentList.get(i).studentId);
				pstmt.setString(2, EnrollmentList.get(i).courseId);
				pstmt.setInt(3, EnrollmentList.get(i).term);
				pstmt.setInt(4, EnrollmentList.get(i).schoolyear);
				pstmt.executeUpdate();
			} 
			
            pstmt.close();
            conn.close();
            return 1;
        
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }
         
    }   // saves enrollment data into the Database
    
}
