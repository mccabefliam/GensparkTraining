package org.XML;

import org.springframework.beans.factory.annotation.Autowired;

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
}
