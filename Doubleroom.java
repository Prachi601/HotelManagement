package main;

import java.io.Serializable;

public class Doubleroom extends SingleRoom implements Serializable {
	    String name2;
	    String contact2;
	    String gender2;  

	    public Doubleroom() {
	        this.name = "";
	        this.name2 = "";
	    }

	    public Doubleroom(String name, String contact, String gender,
	                      String name2, String contact2, String gender2) {
	        super(name, contact, gender);
	        this.name2 = name2;
	        this.contact2 = contact2;
	        this.gender2 = gender2;
	    }
	}



