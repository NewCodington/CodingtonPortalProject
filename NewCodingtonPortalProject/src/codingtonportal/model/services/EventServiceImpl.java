

package codingtonportal.model.services;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import codingtonportal.model.dao.EventDAO;
import codingtonportal.model.domain.Event;
import codingtonportal.utils.DatabaseProperty;
import codingtonportal.utils.FERSDataConnection;

public class EventServiceImpl {
	
	 public boolean insertEvent(EventDAO event) throws IOException, ClassNotFoundException   {  
		 FERSDataConnection conex= new FERSDataConnection(); 
		 DatabaseProperty conexion= new DatabaseProperty();
		 try {    
			PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("insertEvent"));
			statementSQL.setInt(1, event.getEventId());
			statementSQL.setString(2, event.getName());
			statementSQL.setString(3, event.getDescription());
			statementSQL.setInt(4, event.getPlace());
			statementSQL.setString(5, event.getDuration());
			statementSQL.setString(6, event.getStartTime());
			statementSQL.setString(7, event.getEventType());
			statementSQL.setInt(8, event.getSeatsAvailable());
			
			statementSQL.executeUpdate();
			statementSQL.close();
			conex.close();		     
		 } catch (SQLException e) {         
			 return false;
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }
		return true;  
		 } 
	
	
	 public boolean deleteEvent(int eventId) throws IOException, ClassNotFoundException   {  
		 FERSDataConnection conex= new FERSDataConnection(); 
		 DatabaseProperty conexion= new DatabaseProperty(); 
		 try {    
			PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("deleteEvent"));
			statementSQL.setInt(1, eventId);
			statementSQL.executeUpdate();
		
			statementSQL.close();  
			conex.close();    
		 } catch (SQLException e) {         
			 return false; 
		 }
		return true;  
	 }


	 
	
}
