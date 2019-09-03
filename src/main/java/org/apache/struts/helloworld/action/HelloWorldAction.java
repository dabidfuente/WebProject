package org.apache.struts.helloworld.action;

import org.apache.struts.helloworld.model.MessageStore;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;
    private static int helloCount = 0;
    private String userName="";
    
    public String execute() throws Exception {
    	helloCount++;

        messageStore = new MessageStore() ;
        
        if (userName != null) {
            messageStore.setMessage( messageStore.getMessage() + " " + userName);
        }


        
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
    
    public int getHelloCount() {
        return helloCount;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

