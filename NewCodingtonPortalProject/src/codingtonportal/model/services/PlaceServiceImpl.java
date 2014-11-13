package codingtonportal.model.services;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import codingtonportal.model.dao.interfaces.PlaceDAO;
import codingtonportal.model.domain.Place;
import codingtonportal.utils.DatabaseProperty;
import codingtonportal.utils.FERSDataConnection;

public class PlaceServiceImpl implements PlaceDAO {
	
	public boolean insertPlace(Place place) throws IOException, ClassNotFoundException   {  
		 FERSDataConnection conex= new FERSDataConnection(); 
		 DatabaseProperty conexion= new DatabaseProperty();
		 
		 try {    
		PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("insertplace"));
		
		statementSQL.setInt(1, place.getIdPlace());
		statementSQL.setString(2, place.getName());
		statementSQL.setString(3, place.getRegion());
		statementSQL.setInt(4, place.getTypePlace());
		statementSQL.setBlob(5, place.getImage());
		statementSQL.setString(6, place.getAddress());
		statementSQL.setString(7, place.getDescription());	
		
		statementSQL.executeUpdate();
		statementSQL.close();
		conex.close();		     
		JOptionPane.showMessageDialog(null, "Lugar insertado"); 
		 } catch (SQLException e) {         
			 JOptionPane.showMessageDialog(null, "Lugar no insertado");   
			 return false;
			 }
		return true;  
		 } 
	
	
	 public boolean deletePlace(Place place)   throws IOException, ClassNotFoundException   {  
		 FERSDataConnection conex= new FERSDataConnection(); 
		 DatabaseProperty conexion= new DatabaseProperty();
		 
		 try {    
		PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("deleteplace"));
		statementSQL.setInt(1, place.getIdPlace());

		statementSQL.executeUpdate();
		 statementSQL.close();  
		 conex.close();
		 JOptionPane.showMessageDialog(null, "Lugar eliminado");		 
		 
	 } catch (SQLException e) {       

		 JOptionPane.showMessageDialog(null, "Lugar no eliminado");
		 return false;
	 }
		return true;  
 } 

		 
	 
	 public boolean updatePlace(Place place) throws IOException, ClassNotFoundException   {  
		 FERSDataConnection conex= new FERSDataConnection(); 
		 DatabaseProperty conexion= new DatabaseProperty();
		 
		 try {    
				PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("updateplace"));
				statementSQL.setString(1, place.getName());
				statementSQL.setString(2, place.getRegion());
				statementSQL.setInt(3,place.getTypePlace());
				statementSQL.setBlob(4, place.getImage());
				statementSQL.setString(5, place.getAddress());
				statementSQL.setString(6, place.getDescription());		
				statementSQL.setInt(7, place.getIdPlace());
			
				statementSQL.executeUpdate();
				statementSQL.close();
				conex.close();		     
				JOptionPane.showMessageDialog(null, "Lugar actualizado"); 
		} catch (SQLException e) {         
			JOptionPane.showMessageDialog(null,e);
					 return false;
		}
		return true;  
		
	} 
}