package codingtonportal.model.dao;

import java.sql.Blob;

import codingtonportal.model.domain.Place;

public class PlaceDAO extends Place {

	PlaceDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	PlaceDAO(int idPlace, String name, String description, String region, Blob image, String address){
		super(idPlace, name, description, region, image, address);
	}

}
