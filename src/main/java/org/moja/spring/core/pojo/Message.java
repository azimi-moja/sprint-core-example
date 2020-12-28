package org.moja.spring.core.pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype")
public class Message implements InitializingBean, DisposableBean {

    private int id;
    @Required
    private String message;

    public Message() {
        System.out.println("Constructor....");
    }

    public int getId() {
        System.out.println("Get ID");
        return id;
    }

    public void setId(int id) {
        System.out.println("Set ID");
        this.id = id;
    }

    public String getMessage() {
        System.out.println("Get Message");
        return message;
    }

    public void setMessage(String message) {
        System.out.println("Set Message");
        this.message = message;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Interface Init");
    }

    public void destroy() throws Exception {
        System.out.println("Interface Destroy");
    }

    public void initMessage() {
        System.out.println("xml Init");
    }

    public void destroyMessage() {
        System.out.println("xml Destroy");
    }

    // @PostConstruct
    public void initJavaMessage() {
        System.out.println("xml Init");
    }

    //@PreDestroy
    public void destroyJavaMessage() {
        System.out.println("xml Destroy");
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
