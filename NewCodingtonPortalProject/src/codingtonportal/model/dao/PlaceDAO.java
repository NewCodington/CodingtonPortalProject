package codingtonportal.model.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

import codingtonportal.model.domain.Place;
import codingtonportal.utils.FERSDataConnection;


public class PlaceDAO {
	
	public void insertevent(Place place) throws ClassNotFoundException, IOException   {  
		FERSDataConnection conex= new FERSDataConnection();  
		 try {    
		Statement estatuto = conex.getConnection().createStatement();
		 estatuto.executeUpdate("INSERT INTO place VALUES (" +
		 		+place.getIdPlace()+"," +
		 		"'"+place.getName()+"'," +
		 		"'"+place.getRegion()+"'," +
		 		"'"+place.getImage()+"'," +
		 		"'"+place.getAddress()+"',"+
		 		"'"+place.getDescription()+"',)"); 
		//JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
		 estatuto.close();  
		 conex.close();    
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  
		 } 
	
	
	 public void deleteplace(Place place) throws IOException, ClassNotFoundException   {  
		 FERSDataConnection conex= new FERSDataConnection();  
		 try {    
		Statement estatuto = conex.getConnection().createStatement();
		 estatuto.executeUpdate("DELETE FROM place WHERE idplace="+place.getIdPlace()+";");		 
		 //JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
		 estatuto.close();  
		 conex.close();    
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  
		 } 

}
