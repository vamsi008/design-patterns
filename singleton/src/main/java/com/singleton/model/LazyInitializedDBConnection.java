package com.singleton.model;

public class LazyInitializedDBConnection {

	private String conectionDetails;

	private static LazyInitializedDBConnection instance;

	private LazyInitializedDBConnection() {

	}

	public static LazyInitializedDBConnection getInstance() {
		if (instance == null) {
			instance = new LazyInitializedDBConnection();
		}
		return instance;
	}

	public String getConectionDetails() {
		return conectionDetails;
	}

	public void setConectionDetails(String conectionDetails) {
		this.conectionDetails = conectionDetails;
	}

}
