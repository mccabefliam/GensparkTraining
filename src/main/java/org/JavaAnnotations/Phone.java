package org.JavaAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Phone {

    @Autowired
    public String mob;
    public Phone(String mob){
        this.mob = mob;
    }

    public String getPhone() {
        return mob;
    }
    public void setPhone(String mob) {
        this.mob = mob;
    }

    public void init(){
        System.out.println("I am in the Init Method");
    }
    public void destroy(){
        System.out.println("I am in the Destroy Method");
    }
}
