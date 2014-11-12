package codingtonportal.tests;


import java.io.IOException;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import codingtonportal.model.dao.EventDAO;
import codingtonportal.model.services.EventServiceImpl;

public class EventDAOJUnit extends TestCase{
	EventServiceImpl eventt;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		eventt = new EventServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testInsertevent() {
	    EventDAO events= new EventDAO(001, "Charla", "Explicacion de marmotas", 1, "2 horas", "17 horas", "divulgativo",12);
		try {
			assertTrue(eventt.insertEvent(events));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testDeleteevent() {
		try {
			assertTrue(eventt.deleteEvent(001));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
