package com.singleton.model;

public class EarlyInitializedDBConnection {

	String connecitonDetails;

	public static final EarlyInitializedDBConnection Instance = new EarlyInitializedDBConnection();

	private EarlyInitializedDBConnection(){
		
		
	}

	public String getConnecitonDetails() {
		return connecitonDetails;
	}

	public void setConnecitonDetails(String connecitonDetails) {
		this.connecitonDetails = connecitonDetails;
	}

}
