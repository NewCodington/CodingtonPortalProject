

package codingtonportal.model.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

import codingtonportal.model.domain.Event;
import codingtonportal.utils.FERSDataConnection;

public class EventDAO {
	
	 public void insertevent(Event event) throws IOException, ClassNotFoundException   {  
		 FERSDataConnection conex= new FERSDataConnection(); 
		 try {    
		Statement statementSQL = conex.getConnection().createStatement();
		statementSQL.executeUpdate("INSERT INTO event VALUES (" +
		 		+event.getEventId()+"," +
		 		"'"+event.getName()+"'," +
		 		"'"+event.getDescription()+"'," +
		 		"'"+event.getPlace()+"'," +
		 		"'"+event.getDuration()+"',"+
		 		"'"+event.getStarttime()+"',"+
		 		"'"+event.getEventType()+"',"+
		 		event.getSeatsAvailable()+")"); 
		//JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
		statementSQL.close();
		 conex.close();		     
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  
		 } 
	
	
	 public void deleteevent(Event event) throws IOException, ClassNotFoundException   {  
		 FERSDataConnection conex= new FERSDataConnection(); 
		 try {    
		Statement statementSQL = conex.getConnection().createStatement();
		statementSQL.executeUpdate("DELETE FROM event WHERE idevent="+event.getEventId()+";");		 
		
		statementSQL.close();  
		 conex.close();    
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
		 }  
	 } 
	
}
