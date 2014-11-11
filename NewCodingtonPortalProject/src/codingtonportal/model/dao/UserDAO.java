package codingtonportal.model.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import codingtonportal.model.domain.User;
import codingtonportal.utils.FERSDataConnection;



public class UserDAO {

	public void insertevent(User user) throws ClassNotFoundException, IOException   {  
		FERSDataConnection conex= new FERSDataConnection();  
		 try {    
		Statement estatuto = conex.getConnection().createStatement();
		 estatuto.executeUpdate("INSERT INTO users VALUES (" +
		 		+user.getIdUser()+"," +
		 		"'"+user.getFirstName()+"'," +
		 		"'"+user.getLastName()+"'," +
		 		"'"+user.getDni()+"'," +
		 		"'"+user.getEmail()+"',"+
		 		"'"+user.getPhoneNumber()+"',"+
		 		"'"+user.getAddress()+"',"+
		 		"'"+user.getUsername()+
		 		"'"+user.getPassword()+
		 		"'"+user.isAdmin()+"')"); 
		//JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
		 estatuto.close();  
		 conex.close();    
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  
		 } 
	
	
	 public void deleteplace(User user) throws IOException, ClassNotFoundException   {  
		 FERSDataConnection conex= new FERSDataConnection();  
		 try {    
		Statement estatuto = conex.getConnection().createStatement();
		 estatuto.executeUpdate("DELETE FROM users WHERE idplace="+user.getIdUser()+";");		 
		 //JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE); 
		 estatuto.close();  
		 conex.close();    
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  
		 } 
	
}
