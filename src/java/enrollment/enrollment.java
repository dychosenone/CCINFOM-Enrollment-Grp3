/*
 * Author: Vincent Alner Bacayan     S11
 *         CCINFOM
 */

package enrollment;
import java.sql.*;

public class enrollment {
    
	public long studentid;
	public String courseid;
	public int term;
	public int schoolyear;
	
	public long modstudentid;
	public String modcourseid;
	public int modterm;
	public int modschoolyear;
	
    public enrollment () {
	studentid = 0;
	courseid = "";
	term = 0;
	schoolyear = 0;
	
	};
	
    public int modRecord()  { 
		try { 
            Connection conn;     
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/enrolldb?useTimezone=true&serverTimezone=UTC&user=root&password=12345678");
            
            System.out.println("Connection Successful");
            
            PreparedStatement pstmt = conn.prepareStatement("UPDATE enrollment SET studentid=? AND courseid=? AND term=? AND schoolyear=? WHERE studentid=? AND courseid=? AND term=? AND schoolyear=?");
            
            pstmt.setLong (1, modstudentid);
			pstmt.setString (2, modcourseid);
			pstmt.setInt (3, modterm);
			pstmt.setInt (4, modschoolyear);
			pstmt.setLong (5, studentid);
			pstmt.setString (6, courseid);
			pstmt.setInt (7, term);
			pstmt.setInt (8, schoolyear);
			
            
            pstmt.executeUpdate();   
            pstmt.close();
            conn.close();
			
			return 1;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());  
            return 0;
        }
	};
	
    public int delRecord()  { try { 
            Connection conn;     
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/enrolldb?useTimezone=true&serverTimezone=UTC&user=root&password=12345678");
            
            System.out.println("Connection Successful");
            
            PreparedStatement pstmt = conn.prepareStatement("DELETE FROM enrollment WHERE studentid=? AND courseid=? AND term=? AND schoolyear=?");
            
            pstmt.setLong (1, studentid);
			pstmt.setString (2, courseid);
			pstmt.setInt (3, term);
			pstmt.setInt (4, schoolyear);
			
            
            pstmt.executeUpdate();   
            pstmt.close();
            conn.close();
			
			return 1;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());  
            return 0;
        }
	};
	
    public int addRecord()  { 
		
		try {
			
			Connection conn;     
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/enrolldb?useTimezone=true&serverTimezone=UTC&user=root&password=12345678");
            
            System.out.println("Connection Successful");
            
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO enrollment (studentid, courseid, term, schoolyear) VALUES (?,?,?,?)");
            
            pstmt.setLong (1,studentid);
            pstmt.setString (2, courseid);
			pstmt.setInt (3, term);
			pstmt.setInt (4, schoolyear);
          
            
            pstmt.executeUpdate();   
            pstmt.close();
            conn.close();
			
			return 1;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());  
            return 0;
        }         
	};

    public int viewRecord() { try {
            
            Connection conn;     
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/enrolldb?useTimezone=true&serverTimezone=UTC&user=root&password=12345678");
            
            System.out.println("Connection Successful");
            
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM enroll WHERE courseid=? AND degree=?");
            
            pstmt.setString (1, courseid );
            pstmt.setString (2, degree);
          
            
            pstmt.executeUpdate();   
            pstmt.close();
            conn.close();
			
			return 1;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());  
            return 0;
        } };
    
	public int viewallRecords() { try {
            
            Connection conn;     
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/enrolldb?useTimezone=true&serverTimezone=UTC&user=root&password=12345678");
            
            System.out.println("Connection Successful");
            
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM enroll WHERE courseid=? AND degree=?");
            
            pstmt.setString (1, courseid );
            pstmt.setString (2, degree);
          
            
            pstmt.executeUpdate();   
            pstmt.close();
            conn.close();
			
			return 1;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());  
            return 0;
        } };
    
    public static void main(String args[]) {
       
		enrollment  nroll = new enrollment();
		/*		
		nroll.studentid = 10100001;
		nroll.courseid = "CCICOMP";
		nroll.term = 2;
		nroll.schoolyear=20192020;
		nroll.addRecord(); */
		
		/*
		nroll.studentid = 10100001;
		nroll.courseid = "CCICOMP";
		nroll.term = 2;
		nroll.schoolyear=20192020;
		nroll.delRecord();
		*/
		
		
		nroll.modstudentid = 10100011;
		nroll.modcourseid = "CCPROG3";
		nroll.modterm = 2;
		nroll.modschoolyear=20192020;
		nroll.studentid = 10100011;
		nroll.courseid = "CCPROG1";
		nroll.term = 2;
		nroll.schoolyear=20192020;
		nroll.modRecord();
		
		
    }
}
									