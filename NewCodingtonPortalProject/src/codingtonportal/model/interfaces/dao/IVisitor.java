package codingtonportal.model.interfaces.dao;

import java.io.IOException;

import codingtonportal.model.domain.Visitor;

public interface IVisitor {
	public void insertvisitor(Visitor visitor) throws IOException, ClassNotFoundException;
	public void loginvisitor(String Username, String Password) throws ClassNotFoundException, IOException;
	public void deletevisitor(Visitor visitor) throws IOException, ClassNotFoundException;
	public void updateinformation(Visitor visitor) throws ClassNotFoundException, IOException;
	public void updatepassword(Visitor visitor) throws IOException, ClassNotFoundException;
	public void registerevent(int IdUser, int IdEvent) throws ClassNotFoundException, IOException;
	public void unregisterevent(int IdUser, int IdEvent) throws IOException, ClassNotFoundException;
	public void searchevent(String Search) throws IOException, ClassNotFoundException;
	public void viewevent() throws ClassNotFoundException, IOException;
	
	
	}
