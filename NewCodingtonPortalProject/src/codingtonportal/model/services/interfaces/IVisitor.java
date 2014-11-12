package codingtonportal.model.services.interfaces;

import java.io.IOException;

import codingtonportal.model.domain.Visitor;

public interface IVisitor {
	public void insertVisitor(Visitor visitor) throws IOException, ClassNotFoundException;
	public void loginVisitor(String Username, String Password) throws ClassNotFoundException, IOException;
	public void deleteVisitor(Visitor visitor) throws IOException, ClassNotFoundException;
	public void updateInformation(Visitor visitor) throws ClassNotFoundException, IOException;
	public void updatePassword(Visitor visitor) throws IOException, ClassNotFoundException;
	public void registerForNewEvent(int IdUser, int IdEvent) throws ClassNotFoundException, IOException;
	public void unregisterForEvent(int IdUser, int IdEvent) throws IOException, ClassNotFoundException;
	public void searchEvent(String Search) throws IOException, ClassNotFoundException;
	public void viewEvent() throws ClassNotFoundException, IOException;
	
	
	}
