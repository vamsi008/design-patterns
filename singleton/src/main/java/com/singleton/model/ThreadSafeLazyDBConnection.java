package com.singleton.model;

public class ThreadSafeLazyDBConnection {

	private String conectionDetails;

	private static ThreadSafeLazyDBConnection instance;

	private ThreadSafeLazyDBConnection() {

	}

	public static ThreadSafeLazyDBConnection getInstance() {
		
		//Lock on the single instance.
		if (instance == null) {
			synchronized (ThreadSafeLazyDBConnection.class) {
				if (instance == null) {
					instance = new ThreadSafeLazyDBConnection();
				}
			}
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
