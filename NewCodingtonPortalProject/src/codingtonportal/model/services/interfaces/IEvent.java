package codingtonportal.model.services.interfaces;

import codingtonportal.model.domain.Event;

public interface IEvent {
	public void insertEvent(Event event);
	public void deleteEvent(Event event);
	public void updateEvent(Event event);
}
