package codingtonportal.model.services.interfaces;


import java.io.IOException;

import codingtonportal.model.domain.Place;

public interface IPlace {
	public boolean insertPlace(Place place) throws IOException, ClassNotFoundException;
	public boolean deletePlace(Place place) throws IOException, ClassNotFoundException;
	public boolean updatePlace(Place place) throws IOException, ClassNotFoundException;
}
