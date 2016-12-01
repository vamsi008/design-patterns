package com.singleton;

import com.singleton.model.EarlyInitializedDBConnection;
import com.singleton.model.LazyInitializedDBConnection;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		/// The instance of a class can be obtained by
		String connectionDetails = EarlyInitializedDBConnection.Instance.getConnecitonDetails();
		String lazyConnectionInitialization = LazyInitializedDBConnection.getInstance().getConectionDetails();
		ClassLoader classLoader = App.class.getClassLoader();
	}
}
