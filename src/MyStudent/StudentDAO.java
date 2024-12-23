package MyStudent;

import java.sql.*;
import java.util.ArrayList;

public class StudentDAO
{
    public static void insertData(Student s) throws SQLException {
        Connection con = DB.connect();
        String query = Query.insert;
        PreparedStatement Pstmt = con.prepareStatement(query);
        Pstmt.setInt(1,s.getSid());
        Pstmt.setString(2,s.getName());
        Pstmt.setString(3,s.getEmail());
        Pstmt.setString(4,s.getPhone());
        Pstmt.executeUpdate();
        Pstmt.close();
        con.close();
    }
    public static void updateData(int sid,String name) throws SQLException {
        Connection con = DB.connect();
        String query = Query.update;
        PreparedStatement Pstmt = con.prepareStatement(query);
        Pstmt.setString(1,name);
        Pstmt.setInt(2,sid);
        Pstmt.executeUpdate();
        Pstmt.close();
        con.close();
    }
    public static void deleteData(int sid) throws SQLException {
        Connection con = DB.connect();
        String query = Query.delete;
        PreparedStatement Pstmt = con.prepareStatement(query);
        Pstmt.setInt(1,sid);
        Pstmt.executeUpdate();
        Pstmt.close();
        con.close();

    }
    public static ArrayList<Student> selectData() throws SQLException{
        Connection con = DB.connect();
        String query = Query.selectAll;
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        ArrayList<Student> list = new ArrayList<>();
        while(rs.next())
        {
            int sid = rs.getInt("sid");
            String name = rs.getString("name");
            String email = rs.getString("email");
            String phone = rs.getString("phone");
            Student s = new Student(sid,name,email,phone);
            list.add(s);
        }
        return list;
    }

    public static ArrayList<Student> selectDataUsingId(int sid3) throws SQLException{
        Connection con = DB.connect();
        String query = Query.select;
        PreparedStatement Pstmt = con.prepareStatement(query);
        Pstmt.setInt(1,sid3);
        ResultSet rs = Pstmt.executeQuery();
        ArrayList<Student> list = new ArrayList<>();
        if(rs.next())
        {
            int sid = rs.getInt("sid");
            String name = rs.getString("name");
            String email = rs.getString("email");
            String phone = rs.getString("phone");
            Student s = new Student(sid,name,email,phone);
            list.add(s);
        }
        return list;
    }
}
