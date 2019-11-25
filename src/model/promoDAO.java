package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;







public class promoDAO {

//adding promotion
	public void addPromo(promoClasse promoClasse) {
    //connect to DB 
    Connection con = dbClass.connect();
    try{
    	
//        String query = "INSERT INTO promo (years) VALUE (?)";
//        PreparedStatement preparedStatement = con.prepareStatement(query);
//        preparedStatement.setString(1,promoClasse.getYear());
//        ResultSet rs = preparedStatement.executeQuery();
    	
		Statement st=con.createStatement();
	   st.executeUpdate("insert into promo ( years) values ('"+promoClasse.getYear()+"')");


	 //closing
	         st.close();
	
	 
     
    
}catch (Exception e){
    e.printStackTrace();
}		
}
//show all promotion
    public ArrayList<promoClasse> showAll(){
        //init list
        ArrayList<promoClasse> showPromo = new ArrayList<promoClasse>();

        //connect to db
        Connection con = dbClass.connect();
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM promo");

            while (rs.next()){
            	promoClasse all = new promoClasse(rs.getInt("id"),rs.getString("years"));
            	showPromo.add(all);
            }
            //closing
            stmt.close();
            rs.close();
            return showPromo;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    //show with id
    public promoClasse getYear(int id){
    	//connect to db
        Connection con = dbClass.connect();
        try{
        	Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM promo where id="+id);
            while (rs.next()){
            	promoClasse promoClasse = new promoClasse(rs.getInt("id"),rs.getString("years"));
                return promoClasse;

            }

            //closing
            stmt.close();
            rs.close();
       }catch (Exception e){
            e.printStackTrace();
        }
       
        return null;
    }
    
    //update Generation

    public void updatePromo(int idd,promoClasse year){
        Connection con = dbClass.connect();
        try{
            String query = "UPDATE `promo` SET `years` = '"+ year +"'WHERE id = "+idd;
            Statement statement = con.createStatement();
            statement.executeUpdate(query);
            
          //closing
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
 // delete a generation
    public void deleteGeneration(int id) {
        Connection con = dbClass.connect();
        try {
        	Statement statement = con.createStatement();
        	String sql = "DELETE FROM promo WHERE id="+id; 
        	statement.executeUpdate(sql);
        	//closing
            statement.close();
        	
        }catch(SQLException e) {
        	e.printStackTrace();
        }
    }
    
    
    	
  }

	
	
    
    
    
    
    
	
