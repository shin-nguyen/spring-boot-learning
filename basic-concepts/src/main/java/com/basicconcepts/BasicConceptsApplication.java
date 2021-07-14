package com.basicconcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BasicConceptsApplication {

    public static void main(String[] args) {
        System.out.println("Before the IoC Container is initialized!");

        ApplicationContext context = SpringApplication.run(BasicConceptsApplication.class, args);

        System.out.println("After the IoC Container is initialized!");

        Notification notification = context.getBean(Notification.class);
        System.out.println(notification);

        Client client = context.getBean(Client.class);
        System.out.println(client.notification);
        client.change();
//		client.setNotification(new NotifyByPhone());
//		client.change();


        Client client1 = context.getBean(Client.class);
        System.out.println(client1.notification);

        ((ConfigurableApplicationContext) context).getBeanFactory().destroyBean(context.getBean(Notification.class));
    }

}
