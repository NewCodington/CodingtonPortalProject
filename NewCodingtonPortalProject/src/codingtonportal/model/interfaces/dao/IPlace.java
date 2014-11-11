package codingtonportal.model.interfaces.dao;

import codingtonportal.model.domain.Place;

public interface IPlace {
	public void insertplace(Place place);
	public void deleteplace(Place place);
	public void updateplace(Place place);
}
