package enrollment;
import java.sql.*;
import java.util.*;

public class enroll {
	// made students public (pls check @isabel)
    public students                        Student         = new students();
    public ArrayList<enrollment>    EnrollmentList  = new ArrayList<> ();
    public ArrayList<coursedegree>  CourseList      = new ArrayList<> ();
 
    public enroll() {
	};                                 // perform all the necessary data loading from DB
    
    // clears enrollment data of the student 
    public int clearEnrollment () {   
		EnrollmentList.clear();
		return 1;
    }
	
    // load valid courses into the course list
    public int loadCourses () {
		try {
			Connection conn;
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/enrolldb?useTimezone=true&serverTimezone=UTC&user=root&password=12345678");
			System.out.println("Connection Successful.");

			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM coursedegree WHERE degree=?");
			pstmt.setString(1, Student.degreeid);
			ResultSet rs = pstmt.executeQuery();
			CourseList.clear();
			while (rs.next()) {
				coursedegree cd = new coursedegree();
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

	public int addEnrollment (String courseid, int term, int schoolYear) {
		
		try {
			enrollment tempEnrollment = new enrollment();
			tempEnrollment.studentid = Student.studentid;
			tempEnrollment.courseid = courseid;
			tempEnrollment.term = term;
			tempEnrollment.schoolyear = schoolYear;
			EnrollmentList.add(tempEnrollment);
			return 1;
		} catch (Exception e) {
			System.out.println(e);
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
				pstmt.setLong(1, EnrollmentList.get(i).studentid);
				pstmt.setString(2, EnrollmentList.get(i).courseid);
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