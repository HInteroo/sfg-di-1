package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component //by default -> it's a Singleton bean.
public class SingletonBean {
    public SingletonBean(){
        System.out.println("Creating a Singleton bean!!!");
    }

    public String getMyScope(){
        return "I'm a Singleton";
    }
}
