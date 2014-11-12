package codingtonportal.model.dao.interfaces;

import java.io.IOException;

import codingtonportal.model.domain.Visitor;

public interface VisitorDAO {
	public Integer insertVisitor(Visitor visitor) throws IOException, ClassNotFoundException;
	public Integer loginVisitor(String Username, String Password) throws ClassNotFoundException, IOException;
	public Integer deleteVisitor(Visitor visitor) throws IOException, ClassNotFoundException;
	public Integer updateInformation(Visitor visitor) throws ClassNotFoundException, IOException;
	public Integer updatePassword(Visitor visitor) throws IOException, ClassNotFoundException;
	public Integer registerForNewEvent(int IdUser, int IdEvent) throws ClassNotFoundException, IOException;
	public Integer unregisterForEvent(int IdUser, int IdEvent) throws IOException, ClassNotFoundException;
	public Integer searchEvent(String Search) throws IOException, ClassNotFoundException;
	public Integer viewEvent() throws ClassNotFoundException, IOException;
	
	
	}
