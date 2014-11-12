package codingtonportal.model.dao;

import codingtonportal.model.domain.Visitor;

public class VisitorDAO extends Visitor {

	VisitorDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	VisitorDAO(int visitorId, String userName, String password) {
		super(visitorId, userName, password);
	}
	VisitorDAO(int IdUser, String firstName, String lastName, String dni, String email,
			String phoneNumber, String address, String username, String password, boolean admin){
		
	}
	
}
