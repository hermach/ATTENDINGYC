package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbClass {
    private static String db_name="application";
    private static String url = "jdbc:mysql://localhost/"+db_name+"?useSSL=false" ;
    private static String user = "root";
    private static String pass = "";
    private static Connection con;

    public static Connection connect(){
        if(con!=null){
            return con;
        }
        else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, pass);
                return con;
            }catch (Exception e){
                e.printStackTrace();
                return null;
            }
        }
    }
    public static void disconnect(){
        if(con==null){
            return;
        }
        else {
            try{
                con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
