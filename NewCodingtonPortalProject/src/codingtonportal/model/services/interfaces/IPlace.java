package codingtonportal.model.services.interfaces;


import java.io.IOException;

import codingtonportal.model.domain.Place;

public interface IPlace {
	public void insertPlace(Place place) throws IOException, ClassNotFoundException;
	public void deletePlace(Place place) throws IOException, ClassNotFoundException;
	public void updatePlace(Place place) throws IOException, ClassNotFoundException;
}
