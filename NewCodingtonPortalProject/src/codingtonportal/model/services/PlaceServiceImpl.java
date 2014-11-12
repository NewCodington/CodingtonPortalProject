package codingtonportal.model.services;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import codingtonportal.model.domain.Place;
import codingtonportal.model.services.interfaces.IPlace;
import codingtonportal.utils.DatabaseProperty;
import codingtonportal.utils.FERSDataConnection;

public class PlaceServiceImpl implements IPlace {
	
	public void insertPlace(Place place) throws IOException, ClassNotFoundException   {  
		 FERSDataConnection conex= new FERSDataConnection(); 
		 DatabaseProperty conexion= new DatabaseProperty();
		 
		 try {    
		PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("insertplace"));
		statementSQL.setInt(1, place.getIdPlace());
		statementSQL.setString(2, place.getName());
		statementSQL.setString(3, place.getRegion());
		statementSQL.setBlob(4, place.getImage());
		statementSQL.setString(5, place.getAddress());
		statementSQL.setString(6, place.getDescription());
		
		
		statementSQL.executeQuery();
		statementSQL.close();
		conex.close();		     
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 
			 }  
		 } 
	
	
	 public void deletePlace(Place place)   throws IOException, ClassNotFoundException   {  
		 FERSDataConnection conex= new FERSDataConnection(); 
		 DatabaseProperty conexion= new DatabaseProperty();
		 
		 try {    
		PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("deleteplace"));
		statementSQL.setInt(1, place.getIdPlace());
	
		 statementSQL.executeQuery();		 
			
		 statementSQL.close();  
		 conex.close();    
	 } catch (SQLException e) {         
		 System.out.println(e.getMessage());  
	 }  
 } 

		 
	 
	 public void updatePlace(Place place) throws IOException, ClassNotFoundException   {  
		 FERSDataConnection conex= new FERSDataConnection(); 
		 DatabaseProperty conexion= new DatabaseProperty();
		 
		 try {    
				PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("updateplace"));
				statementSQL.setString(1, place.getName());
				statementSQL.setString(2, place.getRegion());
				statementSQL.setBlob(3, place.getImage());
				statementSQL.setString(4, place.getAddress());
				statementSQL.setString(5, place.getDescription());
				statementSQL.setInt(6, place.getIdPlace());
				
				
				statementSQL.executeQuery();
				statementSQL.close();
				conex.close();		     
		} catch (SQLException e) {         
					 System.out.println(e.getMessage());  
		}  
	} 
}