/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codingtonportal.utils;


import java.io.IOException;
import codingotonportal.model.utils.classes.DatabaseProperty;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author 
 */

public class FERSDataConnection{
     // las variables hay que cambiarlas
//    private String url= "jdbc:oracle:thin:@localhost:1521:xe";
	private String driver;
	private String url;
    private String user;
    private String pass;
    
	
    public FERSDataConnection() throws IOException{
    	DatabaseProperty conexion= new DatabaseProperty();
    	
    	this.driver=conexion.getProperty("driver");
    	this.url=conexion.getProperty("connection");
    	this.user= conexion.getProperty("username");
    	this.pass= conexion.getProperty("password");
    	
    }
    
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getUser (){
		return user;
	}
	
	public void setUser (String user){
		this.user= user;
	}
	
	public String getPass (){
		return pass;
	}
	
	public void setPass(String pass){
		this.pass=pass;
	}
    
  public Connection getConnection() throws ClassNotFoundException, SQLException{
      Connection connection = null;
      
          //Cargamos el driver que está en libraries mysql y establecemos la conexión.
    	  
          //Class.forName("oracle.jdbc.driver.OracleDriver");
    	  //Class.forName("com.mysql.jdbc.Driver");
    	  
			Class.forName(this.driver);
			connection = DriverManager.getConnection(this.url, this.user, this.pass);

          
          //if (connection != null) JOptionPane.showMessageDialog(null, "Conexion exitosa");  
          //else JOptionPane.showMessageDialog(null, "Conexion fallida\n");
          
          // JOptionPane sería cambiarlos en a interfaz.
      return connection;
  }
    
}
