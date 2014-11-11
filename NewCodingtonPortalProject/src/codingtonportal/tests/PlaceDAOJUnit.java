package codingtonportal.tests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.Blob;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import codingtonportal.model.dao.EventDAO;
import codingtonportal.model.dao.PlaceDAO;
import codingtonportal.model.domain.Event;
import codingtonportal.model.domain.Place;

public class PlaceDAOJUnit extends TestCase {
	
	PlaceDAO place;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		place = new PlaceDAO();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testinsertplace() {
		Place places= new Place (001,"Museum", "Science museum", "North", "hoaljfaofj", "c/Alcala,18 ");
		fail("Not yet implemented");
		 
	}

}


