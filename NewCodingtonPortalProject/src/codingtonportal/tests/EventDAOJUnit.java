package codingtonportal.tests;

import java.awt.Event;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import codingtonportal.model.dao.EventDAO;

public class EventDAOJUnit extends TestCase{
	EventDAO event;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		event = new EventDAO();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testInsertevent() {
	    Event events= new Event(001, "Charla", "Explicacion de marmotas", 1, "2 horas", "17 horas", "divulgativo",12);
		AssertTrue(event.insertevent(events));
	}

	@Test
	public void testDeleteevent() {
		fail("Not yet implemented");
	}

}
