package org.i3xx.docs.basic.impl;

import java.util.HashMap;
import java.util.Map;

import org.i3xx.docs.basic.core.DocIdExtended;

public class DocIdExtendedImpl extends DocIdImpl implements DocIdExtended {
	
	private Map<String, String> params;
	
	public DocIdExtendedImpl() {
		super();
		
		params = new HashMap<String, String>();
	}
	
	public DocIdExtendedImpl(String uuid, String mimetype, long length, String hashCode) {
		super(uuid, mimetype, length, hashCode);
		
		params = new HashMap<String, String>();
	}
	
	@Override
	public String getParam(String key) {
		return params.get(key);
	}

	@Override
	public void setParam(String key, String value) {
		params.put(key, value);
	}

	@Override
	public Map<String, String> intern() {
		return params;
	}

}
