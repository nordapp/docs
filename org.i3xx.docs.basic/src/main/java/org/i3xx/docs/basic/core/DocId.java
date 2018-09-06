package org.i3xx.docs.basic.core;

/**
 * The DocId represents a document. These are the rules of the document system.
 * 
 * 1. The DocId represents exactly one document.
 * 
 * 2. The DocId is public.
 * 
 * 3. The DocId is immutable and can be stored in a blockchain. Than it is official.
 *    In this case the field hashCode is required and must match the document.
 * 
 * 4. The significant field of the DocId is the UUID. Two DocIds with the same UUID
 *    are equal. If one is an official DocId then it is agreed and understood that
 *    any difference to the official DocId is temporary and for the purpose of data
 *    processing only.
 * 
 * 5. The integrity of the document can be verified by the field hashCode of the DocId.
 * 
 * 6. The DocId contains no time information and no sequential numbers to avoid
 *    needs for synchronization. Store such type of information in the properties
 *    of the DocIdExtended or in another system, like a CRM. An official DocId has
 *    a timestamp used in the blockchain.
 *    
 * 7. An official DocId cannot be deleted but can be marked as invalidated. To do this
 *    put the DocId again to the blockchain but set the field 'hashCode' to 'void'.
 * 
 * 
 * Some suggestions for a productive system.
 * 
 * 8.  There is at least one index service indexing the fields of the available DocIds.
 *     This service can be used for search and access.
 *    
 * 9.  There is at least one customer relationship management service that handles
 *     the affiliations of the document to the organizational structure the document
 *     belongs to.
 *    
 * 10. There is at least one access service that handles the access to the document.
 * 
 * 11. Instead of the official DocId a copy or an extension like DocIdExtended can be
 *     created for data processing purposes. DocIdExtended provides a map for additional
 *     information.
 *    
 * 12. Send a DocId to a document service and return the document. Customer services
 *     using a web server should use the HTTP header fields instead.
 * 
 * 
 * @author green
 *
 */
public interface DocId {

	/**
	 * Gets the uuid of the document
	 * 
	 * @return
	 */
	String getUuid();
	
	/**
	 * Sets the uuid of the document
	 * 
	 * @param uuid
	 */
	void setUuid(String uuid);
	
	/**
	 * Gets the document type (mimetype) of the document
	 * 
	 * @return
	 */
	String getMimetype();
	
	/**
	 * Sets the document type (mimetype) of the document
	 * 
	 * @param mimetype
	 */
	void setMimetype(String mimetype);
	
	/**
	 * Gets the length in bytes of the document
	 * 
	 * @return
	 */
	long getLength();
	
	/**
	 * Sets the length in bytes of the document
	 * 
	 * @param length
	 */
	void setLength(long length);
	
	/**
	 * Gets the hashcode of the document
	 * 
	 * @return
	 */
	String getHashCode();
	
	/**
	 * Sets the hashcode of the document
	 * 
	 * @param hashCode
	 */
	void setHashCode(String hashCode);
	
}
