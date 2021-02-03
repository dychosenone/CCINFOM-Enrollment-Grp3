package enrollment;
import java.sql.*;
import java.util.*;

public class enroll {
    public students                 Student         = new students();
    public ArrayList<enrollment>    EnrollmentList  = new ArrayList<> ();
    public ArrayList<coursedegree>  CourseList      = new ArrayList<> ();
 
    // perform all the necessary data loading from DB
    public enroll() {
        Student = null;
        EnrollmentList.clear();
        CourseList.clear();        
    }; 
    
    // clears enrollment data of the student 
    public int clearEnrollment () {   
	EnrollmentList.clear();
	return 1;
    };
	
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
            	cd.courseid     = rs.getString("courseid");
		cd.degree       = rs.getString("degree");
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
     
            enrollment temp_e = new enrollment();
            temp_e.studentid = Student.studentid;
            temp_e.courseid = courseid;
            temp_e.term = term;
            temp_e.schoolyear = schoolYear;
            EnrollmentList.add(temp_e);
            return 1;
            
	} catch (Exception e) {
            System.out.println(e);
            return 0;
	}
    }
    
    public int delEnrollment(String courseid, int term, int schoolYear) {
        try {
            for (int i = 0; i < EnrollmentList.size(); i++){
                enrollment temp_d = EnrollmentList.get(i);
                if (temp_d.courseid.equals(courseid) && temp_d.term == term && temp_d.schoolyear == schoolYear)
                    EnrollmentList.remove(temp_d);
            }
            return 1;
            
	} catch (Exception e) {
            System.out.println(e);
            return 0;
	}
    };
    
    
    public int confirmEnrollment()  {   
        try {
            Connection conn;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/enrolldb?useTimezone=true&serverTimezone=UTC&user=root&password=12345678");
            System.out.println("Connection Successful.");
            
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO enrollment VALUES(?,?,?,?)");
            
            for (int i = 0; i < EnrollmentList.size(); i++) {
                
                enrollment a = EnrollmentList.get(i);
                
                pstmt.setLong(1, a.studentid);
		pstmt.setString(2, a.courseid);
		pstmt.setInt(3, a.term);
		pstmt.setInt(4, a.schoolyear);
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
    
    public static void main (String args[]){
        
        enroll en = new enroll();
        
        students s = new students();
        s.studentid = 10100001;
        s.viewRecord();
        
        en.Student = s;
        
        en.loadCourses();
        
        /*
        for (int i = 0; i < en.CourseList.size(); i++){
            coursedegree a = en.CourseList.get(i);
            
            System.out.println("courseid:   " + a.courseid);
            System.out.println("degree:     " + a.degree);
            System.out.println ("-----"); 
        }
        */
        
        en.addEnrollment("CCINFOM", 1, 20192020);
        en.addEnrollment("CCINFOM", 2, 20192020);
        
        /*
        for (int i = 0; i < en.EnrollmentList.size(); i++){
            enrollment a = en.EnrollmentList.get(i);
            
            System.out.println("studentid:    " + a.studentid);
            System.out.println("courseid:     " + a.courseid);
            System.out.println("term:         " + a.term);
            System.out.println("school year:  " + a.schoolyear);
            System.out.println ("-----"); 
        }
        */
        
        en.delEnrollment("CCINFOM", 1, 20192020);
        
        
        for (int i = 0; i < en.EnrollmentList.size(); i++){
            enrollment a = en.EnrollmentList.get(i);
            
            System.out.println("studentid:    " + a.studentid);
            System.out.println("courseid:     " + a.courseid);
            System.out.println("term:         " + a.term);
            System.out.println("school year:  " + a.schoolyear);
            System.out.println ("-----"); 
        }       
        
        en.confirmEnrollment();
        
    }
    
}