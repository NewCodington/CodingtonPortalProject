package codingtonportal.model.dao;

import codingtonportal.model.domain.Visitor;

public class VisitorDAO extends Visitor {

	VisitorDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	VisitorDAO(int visitorId, String userName, String password, String confirmPassword) {
		super(visitorId, userName, password, confirmPassword);
	}

}
