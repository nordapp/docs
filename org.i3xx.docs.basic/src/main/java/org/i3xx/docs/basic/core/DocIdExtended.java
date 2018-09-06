package org.i3xx.docs.basic.core;

import java.util.Map;

public interface DocIdExtended extends DocId {
	
	/**
	 * Gets a parameter
	 * 
	 * @param key The key (name) of the parameter
	 * @return
	 */
	String getParam(String key);
	
	/**
	 * Sets a parameter
	 * 
	 * @param key The key (name) of the parameter
	 * @param value The value of the parameter
	 */
	void setParam(String key, String value);
	
	/**
	 * Gets access to the intern parameter map.
	 * 
	 * @return
	 */
	Map<String, String> intern();
}
