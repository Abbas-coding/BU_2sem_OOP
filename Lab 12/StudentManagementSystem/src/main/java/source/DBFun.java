package source;

import java.sql.*;

public class DBFun {

    public Statement connect() throws ClassNotFoundException, SQLException {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        String url = "jdbc:ucanaccess://E:\\Abbas\\Uni\\sem2\\OOP_LAB\\BU_2sem_OOP\\Lab 12\\StudentManagementSystem\\StuDatabase.accdb";
        Connection conn = DriverManager.getConnection(url);
        Statement st = conn.createStatement();
        return st;
    }

    public void displayAll() throws ClassNotFoundException, SQLException {
        Statement st = connect();
        ResultSet rs = st.executeQuery("SELECT * FROM Student");
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
    }

    public void add (int id, String name, String dept) throws ClassNotFoundException, SQLException {
        Statement st = connect();
        st.executeUpdate("INSERT INTO Student(Reg,StuName,Department) VALUES ('"+id+ "','"+name+"', '" +dept + "')");
    }


    public void  delete(int id) throws SQLException, ClassNotFoundException{
        Statement st = connect();
        st.executeUpdate("DELETE FROM Student WHERE Reg = "+ id);
        System.out.println("Record Deleted");
    }

    public void update(int id, String name, String dept) throws SQLException, ClassNotFoundException {
        Statement st = connect();
        st.executeUpdate("UPDATE Student SET StuName = '"+name+"', Department = '"+dept+"' WHERE Reg = "+id);
        System.out.println("Record Updated");
    }
}
