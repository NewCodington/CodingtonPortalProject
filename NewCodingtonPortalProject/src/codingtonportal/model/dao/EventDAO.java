package codingtonportal.model.dao;

import codingtonportal.model.domain.Event;

public class EventDAO extends Event {
	
	EventDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EventDAO(int idEvent, String name, String description, int place,
			String duration, String startTime, String eventTipe, int seatsAvailable) {
		super(idEvent, name, description, place, duration, startTime, eventTipe, seatsAvailable);
	}
}
