package codingtonportal.model.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import codingtonportal.model.domain.Visitor;
import codingtonportal.model.interfaces.dao.IVisitor;
import codingtonportal.utils.DatabaseProperty;
import codingtonportal.utils.FERSDataConnection;



public class VisitorDAO implements IVisitor {

	public void insertvisitor(Visitor visitor) throws IOException, ClassNotFoundException   {  
	
			 FERSDataConnection conex= new FERSDataConnection(); 
			 DatabaseProperty conexion= new DatabaseProperty();
			 try {    
			//PreparedStatemnt for dynamic data	 
			PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("insertVisitor"));
			
			statementSQL.setInt(1, visitor.getIdUser());
			statementSQL.setString(2, visitor.getFirstName());
			statementSQL.setString(3, visitor.getLastName());
			statementSQL.setString(4, visitor.getDni());
			statementSQL.setString(5, visitor.getEmail());
			statementSQL.setString(6, visitor.getPhoneNumber());
			statementSQL.setString(7, visitor.getAddress());
			statementSQL.setString(8, visitor.getUserName());
			statementSQL.setString(9, visitor.getPassword());
			statementSQL.setBoolean(10, visitor.isAdmin());
	
			statementSQL.executeQuery();
			statementSQL.close();
			conex.close();		     
		
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 //JOptionPane.showMessageDialog(null, "No se Registro la persona");   
			 }  
		 } 
	

	public void loginvisitor(String Username, String Password) throws ClassNotFoundException, IOException {
		
		FERSDataConnection conex= new FERSDataConnection(); 
		DatabaseProperty conexion= new DatabaseProperty();
		try {    
		//PreparedStatemnt for dynamic data	 
		PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("loginVisitor"));
		
		
		statementSQL.setString(1, Username);
		statementSQL.setString(2, Password);
		

		statementSQL.executeQuery();
		statementSQL.close();
		conex.close();		     

		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
		}  	
	}


	public void deletevisitor(Visitor visitor) throws IOException, ClassNotFoundException {
	
		
		FERSDataConnection conex= new FERSDataConnection(); 
		DatabaseProperty conexion= new DatabaseProperty();
		try {    
		//PreparedStatemnt for dynamic data	 
		PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("deleteVisitor"));
		
		statementSQL.setInt(1, visitor.getIdUser());
		
		statementSQL.executeQuery();
		statementSQL.close();
		conex.close();		     
	  
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			
			 }  	
	}



	public void updateinformation(Visitor visitor) throws ClassNotFoundException, IOException {
	
		 FERSDataConnection conex= new FERSDataConnection(); 
		 DatabaseProperty conexion= new DatabaseProperty();
		 try {    
		//PreparedStatemnt for dynamic data	 
		PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("updateVisitor"));
	
		statementSQL.setString(1, visitor.getFirstName());
		statementSQL.setString(2, visitor.getLastName());
		statementSQL.setString(3, visitor.getDni());
		statementSQL.setString(4, visitor.getEmail());
		statementSQL.setString(5, visitor.getPhoneNumber());
		statementSQL.setString(6, visitor.getAddress());
		statementSQL.setString(7, visitor.getPassword());
		//Where
		statementSQL.setInt(8, visitor.getIdUser());
		
		statementSQL.executeQuery();
		statementSQL.close();
		conex.close();		     
		
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			
			 }  		
	}



	public void updatepassword(Visitor visitor) throws IOException, ClassNotFoundException {
		
		 FERSDataConnection conex= new FERSDataConnection(); 
		 DatabaseProperty conexion= new DatabaseProperty();
		 try {    
		//PreparedStatemnt for dynamic data	 
		PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("updatepassword"));
	
		
		statementSQL.setString(1, visitor.getPassword());
		//Where
		statementSQL.setInt(2, visitor.getIdUser());
		
		statementSQL.executeQuery();
		statementSQL.close();
		conex.close();		     
	
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			
			 }  	
		
		
	}



	public void registerevent(int IdUser, int IdEvent) throws ClassNotFoundException, IOException {
		
		 FERSDataConnection conex= new FERSDataConnection(); 
		 DatabaseProperty conexion= new DatabaseProperty();
		 try {    
		//PreparedStatemnt for dynamic data	 
		PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("registerevent"));
	
		
		statementSQL.setInt(1, IdUser);
		statementSQL.setInt(2, IdEvent);
		
		statementSQL.executeQuery();
		statementSQL.close();
		conex.close();		     
		
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  	  
	 } 
	}



	public void unregisterevent(int IdUser, int IdEvent) throws IOException, ClassNotFoundException {
		
		 FERSDataConnection conex= new FERSDataConnection(); 
		 DatabaseProperty conexion= new DatabaseProperty();
		 try {    
		//PreparedStatemnt for dynamic data	 
		PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("unregisterevent"));
	
		
		statementSQL.setInt(1, IdUser);
		statementSQL.setInt(2, IdEvent);
		
		statementSQL.executeQuery();
		statementSQL.close();
		conex.close();		     
		
		 
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 
	  }  	
	}

	
	public void searchevent(String Search) throws IOException, ClassNotFoundException {
		
		
		FERSDataConnection conex= new FERSDataConnection(); 
		 DatabaseProperty conexion= new DatabaseProperty();
		 try {    
		//PreparedStatemnt for dynamic data	 
		PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("searchevent"));
	
		statementSQL.setString(1, Search);
		
		statementSQL.executeQuery();
		statementSQL.close();
		conex.close();		     

		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			  
			 }  	
	}


	public void viewevent() throws ClassNotFoundException, IOException {
		
		FERSDataConnection conex= new FERSDataConnection(); 
		 DatabaseProperty conexion= new DatabaseProperty();
		 try {    
		//PreparedStatemnt for dynamic data	 
		PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("viewevent"));
	
		statementSQL.executeQuery();
		statementSQL.close();
		conex.close();		     
		
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 
			 } 	
	}
}
