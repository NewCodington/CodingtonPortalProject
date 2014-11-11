package codingtonportal.tests;


import java.sql.SQLException;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import codingtonportal.model.utils.FERSDataConnection;



public class ConnectionDatabase extends TestCase {

	FERSDataConnection connection;
	@Before
	public void setUp() throws Exception {
		super.setUp();
		connection = new FERSDataConnection();
		
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGetConnection() {
		try {
			assertNotNull(connection.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
