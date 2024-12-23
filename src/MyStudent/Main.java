package MyStudent;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1.insert 2.update 3.delete 4.read all 5.read using id 6.cancel");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the details");
                    System.out.println("SId, Name, Email, and phone number");
                    int sid = sc.nextInt();
                    sc.nextLine();
                    String name = sc.nextLine();
                    String email = sc.next();
                    String phone = sc.next();
                    Student st = new Student(sid,name,email,phone);
                    StudentDAO.insertData(st);
                    break;

                case 2:
                    System.out.println("Enter the details");
                    System.out.println("SId, Name");
                    int sid1 = sc.nextInt();
                    sc.nextLine();
                    String name1 = sc.nextLine();
                    StudentDAO.updateData(sid1,name1);
                    break;

                case 3:
                    System.out.println("Enter the details");
                    System.out.println("SId");
                    int sid2 = sc.nextInt();
                    StudentDAO.deleteData(sid2);
                    break;

                case 4:
                    ArrayList<Student> read = StudentDAO.selectData();
                    for (Student s : read) {
                        System.out.println(s);
                    }
                    break;
                    case 5:
                        System.out.println("Enter the details to  read");
                        System.out.println("SId");
                        int sid3 = sc.nextInt();
                        ArrayList<Student> readId =  StudentDAO.selectDataUsingId(sid3);
                        System.out.println(readId);
                        break;
                case 6:
                    System.exit(0);
                    break;
                    default:
                        System.out.println("Invalid choice");
            }

        }

    }
}