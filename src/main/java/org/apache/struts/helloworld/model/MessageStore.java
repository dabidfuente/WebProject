package org.apache.struts.helloworld.model;

public class MessageStore {
    private String message;
    
    public MessageStore() {
        message = "Hello Struts User";
    }

    public String getMessage() {
        return message;
    }
    public String toString() {
        return message + " (from toString)";
    }

	public void setMessage(String string) {
		this.message = string;
		
	}	
}