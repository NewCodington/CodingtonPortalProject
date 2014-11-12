package codingtonportal.tests;


import java.io.IOException;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import codingtonportal.model.domain.Event;
import codingtonportal.model.services.EventServiceImpl;

public class EventDAOJUnit extends TestCase{
	EventServiceImpl event;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		event = new EventServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testInsertevent() {
	    Event events= new Event(001, "Charla", "Explicacion de marmotas", 1, "2 horas", "17 horas", "divulgativo",12);
		try {
			assertTrue(event.insertEvent(events));
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
		Event events= new Event(001, "Charla", "Explicacion de marmotas", 1, "2 horas", "17 horas", "divulgativo",12);
		try {
			assertTrue(event.deleteEvent(events));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
