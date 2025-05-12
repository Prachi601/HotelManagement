package main;

import java.io.Serializable;
import java.util.ArrayList;

	public class SingleRoom implements Serializable {
	    String name;
	    String contact;
	    String gender;   
	    ArrayList<Food> food = new ArrayList<>();

	    public SingleRoom() {
	        this.name = "";
	    }

	    public SingleRoom(String name, String contact, String gender) {
	        this.name = name;
	        this.contact = contact;
	        this.gender = gender;
	    }
	}



