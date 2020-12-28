package org.moja.spring.core.client;

import org.moja.spring.core.pojo.Message;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanFactoryExample {

    public static void main(String[] args){

        Resource resource = new ClassPathResource("Beans.xml");
        BeanFactory factory = new XmlBeanFactory(resource);

        Object messageObject = factory.getBean("message");
        if(messageObject != null){
            Message message = (Message) messageObject;
            System.out.println(message.getId() + message.getMessage());
        }
    }
}
