package MyStudent;
public class Query {
    static String insert = "insert into student values(?,?,?,?)";
    static String update = "update student set name=? where sid = ?";
    static String delete = "delete from student where sid = ?";
    static String select = "select * from student where sid = ?";
    static String selectAll = "select * from student";
}
