package org.i3xx.docs.basic.impl;

import org.i3xx.docs.basic.core.DocId;

public class DocIdImpl implements DocId {
	
	/** The uuid of the document */
	private String uuid;
	
	/** The mimetype of the document */
	private String mimetype;
	
	/** The length of the document */
	private long length;
	
	/** The hash of the document */
	private String hashCode;
	
	/**
	 * 
	 */
	public DocIdImpl() {
		this.uuid = null;
		this.mimetype = null;
		this.length = 0;
		this.hashCode = null;
	}
	
	/**
	 * @param uuid
	 * @param mimetype
	 * @param length
	 * @param hashCode
	 */
	public DocIdImpl(String uuid, String mimetype, long length, String hashCode) {
		this.uuid = uuid;
		this.mimetype = mimetype;
		this.length = length;
		this.hashCode = hashCode;
	}
	
	@Override
	public String getUuid() {
		return uuid;
	}

	@Override
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public String getMimetype() {
		return mimetype;
	}

	@Override
	public void setMimetype(String mimetype) {
		this.mimetype = mimetype;
	}

	@Override
	public long getLength() {
		return length;
	}

	@Override
	public void setLength(long length) {
		this.length = length;
	}

	@Override
	public String getHashCode() {
		return hashCode;
	}

	@Override
	public void setHashCode(String hashCode) {
		this.hashCode = hashCode;
	}

}
