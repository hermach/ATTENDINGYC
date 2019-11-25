package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class classeDAO {
	//ajoute d une classe
	 
public static void ajouteClasse(classe cl) {
	 //connect to DB 
    Connection con = dbClass.connect();
    try {
		String query = "INSERT INTO classes (nom,pseudo,generation_id) values (?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, cl.getNom());
		ps.setString(2, cl.getPseudo());
		ps.setInt(3, cl.getGeneration().getId());
		ps.executeUpdate();
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		if(con!=null) {
			dbClass.disconnect();
		}
	 }
   }
	//selection d une classe par id 
public classe selectionClasseId(int id) {
    Connection con = dbClass.connect();
	promoClasse genre;
	classe cl = null;
	try {
		String query = "SELECT * FROM classes  WHERE id=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			int id_cl = rs.getInt("id");
			String nom = rs.getString("nom");
			String pseudo= rs.getString("pseudo");
			int generation_id = rs.getInt("generation_id");
			
			promoDAO ge = new promoDAO();
			genre = ge.getYear(generation_id);
			
			cl = new classe(id_cl, nom, pseudo, genre);
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		if(con!=null) {
			dbClass.disconnect();
		}
	}
	return cl;
  }
  //selection tous les classes
public ArrayList<classe>  selectionGeneratio() {
    Connection con = dbClass.connect();
	ArrayList<classe> tbl = new ArrayList<classe>();
	promoClasse genre;
	classe cla = null;
	try {
		String query = "SELECT * FROM classes";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			int id_cl = rs.getInt("id");
			String nom = rs.getString("nom");
			String pseudo= rs.getString("pseudo");
			int generation_id = rs.getInt("generation_id");
			
			promoDAO ge = new promoDAO();
			genre = ge.getYear(generation_id);
			
			cla = new classe(id_cl, nom, pseudo, genre);
			
			tbl.add(cla);
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	return tbl;
  }
    //modifier une classe
public void  modifierClasse(classe cl) {
    Connection con = dbClass.connect();
	try {
		String query = "UPDATE classes SET nom=?,pseudo=?,generation_id=? WHERE id=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, cl.getNom());
		ps.setString(2, cl.getPseudo());
		ps.setInt(3, cl.getGeneration().getId());
		ps.executeUpdate();
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		if(con!=null) {
			dbClass.disconnect();
		}
	 }
  }
   //suprimer classe
public void suprimmerClasse(int id) {
    Connection con = dbClass.connect();
	try {
		String query = "DELETE FROM classes WHERE id=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.executeUpdate();
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally {
		if(con!=null) {
			dbClass.disconnect();
		}
	 }
  }
}