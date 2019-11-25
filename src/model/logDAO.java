package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class logDAO {
	public loginPage chekin(loginPage chek) {
    	

	    //connect to db
        Connection con = dbClass.connect();
        try{
            String query = "SELECT login FROM users where login =? and pass=?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1,chek.getUserName());
            preparedStatement.setString(2,chek.getPassword());
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next())
		{
  		           //to get name of user 
            	  String loging = rs.getString("login");
    		
    	
    			  
    			  chek.setValid(true);
    			  chek.setUserName(loging);
    	 //closing
  	         rs.close();
  	         preparedStatement.close();
  	
		}  
            else
            {
            	 chek.setValid(false);
            }
        
	}catch (Exception e){
        e.printStackTrace();
    }	
       return chek;
	}
	
}
