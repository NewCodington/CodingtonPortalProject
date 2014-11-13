package codingtonportal.model.services;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import codingtonportal.model.dao.interfaces.VisitorDAO;
import codingtonportal.model.domain.Visitor;
import codingtonportal.utils.PropertyAccess;
import codingtonportal.utils.FERSDataConnection;



public class VisitorServiceImpl implements VisitorDAO {

	public Integer insertvisitor(Visitor visitor) throws IOException, ClassNotFoundException   {  
	
			 FERSDataConnection conex= new FERSDataConnection(); 
			 PropertyAccess conexion= new PropertyAccess();
			 try {    
			//PreparedStatemnt for dynamic data	 
			PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("insertVisitor"));
			
			statementSQL.setInt(1, visitor.getIdVisitor());
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
			return null;  
		 } 
	

	public Integer loginvisitor(String Username, String Password) throws ClassNotFoundException, IOException {
		
		FERSDataConnection conex= new FERSDataConnection(); 
		PropertyAccess conexion= new PropertyAccess();
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
		return null;  	
	}


	public Integer deletevisitor(Visitor visitor) throws IOException, ClassNotFoundException {
	
		
		FERSDataConnection conex= new FERSDataConnection(); 
		PropertyAccess conexion= new PropertyAccess();
		try {    
		//PreparedStatemnt for dynamic data	 
		PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("deleteVisitor"));
		
		statementSQL.setInt(1, visitor.getIdVisitor());
		
		statementSQL.executeQuery();
		statementSQL.close();
		conex.close();		     
	  
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			
			 }
		return null;  	
	}



	public Integer updateinformation(Visitor visitor) throws ClassNotFoundException, IOException {
	
		 FERSDataConnection conex= new FERSDataConnection(); 
		 PropertyAccess conexion= new PropertyAccess();
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
		statementSQL.setInt(8, visitor.getIdVisitor());
		
		statementSQL.executeQuery();
		statementSQL.close();
		conex.close();		     
		
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			
			 }
		return null;  		
	}



	public Integer updatepassword(Visitor visitor) throws IOException, ClassNotFoundException {
		
		 FERSDataConnection conex= new FERSDataConnection(); 
		 PropertyAccess conexion= new PropertyAccess();
		 try {    
		//PreparedStatemnt for dynamic data	 
		PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("updatepassword"));
	
		
		statementSQL.setString(1, visitor.getPassword());
		//Where
		statementSQL.setInt(2, visitor.getIdVisitor());
		
		statementSQL.executeQuery();
		statementSQL.close();
		conex.close();		     
	
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			
			 }
		return null;  	
		
		
	}



	public Integer registerevent(int IdUser, int IdEvent) throws ClassNotFoundException, IOException {
		
		 FERSDataConnection conex= new FERSDataConnection(); 
		 PropertyAccess conexion= new PropertyAccess();
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
		return IdEvent; 
	}



	public Integer unregisterevent(int IdUser, int IdEvent) throws IOException, ClassNotFoundException {
		
		 FERSDataConnection conex= new FERSDataConnection(); 
		 PropertyAccess conexion= new PropertyAccess();
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
		return IdEvent;  	
	}

	
	public Integer searchevent(String Search) throws IOException, ClassNotFoundException {
		
		
		FERSDataConnection conex= new FERSDataConnection(); 
		 PropertyAccess conexion= new PropertyAccess();
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
		return null;  	
	}


	public Integer viewevent() throws ClassNotFoundException, IOException {
		
		FERSDataConnection conex= new FERSDataConnection(); 
		 PropertyAccess conexion= new PropertyAccess();
		 try {    
		//PreparedStatemnt for dynamic data	 
		PreparedStatement statementSQL = conex.getConnection().prepareStatement(conexion.getProperty("viewevent"));
	
		statementSQL.executeQuery();
		statementSQL.close();
		conex.close();		     
		
		 } catch (SQLException e) {         
			 System.out.println(e.getMessage());  
			 
			 }
		return null; 	
	}


	@Override
	public Integer insertVisitor(Visitor visitor) throws IOException,
			ClassNotFoundException {
				return null;
		// TODO Auto-generated method stub
		
	}


	@Override
	public Integer loginVisitor(String Username, String Password)
			throws ClassNotFoundException, IOException {
				return null;
		// TODO Auto-generated method stub
		
	}


	@Override
	public Integer deleteVisitor(Visitor visitor) throws IOException,
			ClassNotFoundException {
				return null;
		// TODO Auto-generated method stub
		
	}


	@Override
	public Integer updateInformation(Visitor visitor)
			throws ClassNotFoundException, IOException {
				return null;
		// TODO Auto-generated method stub
		
	}


	@Override
	public Integer updatePassword(Visitor visitor) throws IOException,
			ClassNotFoundException {
				return null;
		// TODO Auto-generated method stub
		
	}


	@Override
	public Integer registerForNewEvent(int IdUser, int IdEvent)
			throws ClassNotFoundException, IOException {
				return IdEvent;
		// TODO Auto-generated method stub
		
	}


	@Override
	public Integer unregisterForEvent(int IdUser, int IdEvent) throws IOException,
			ClassNotFoundException {
				return IdEvent;
		// TODO Auto-generated method stub
		
	}


	@Override
	public Integer searchEvent(String Search) throws IOException,
			ClassNotFoundException {
				return null;
		// TODO Auto-generated method stub
		
	}


	@Override
	public Integer viewEvent() throws ClassNotFoundException, IOException {
		return null;
		// TODO Auto-generated method stub
		
	}
}
