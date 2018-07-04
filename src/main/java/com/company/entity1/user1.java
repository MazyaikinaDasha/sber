package com.company.entity1;
import java.util.Optional;
public class user1 {
    user[] response;

    public user1(user[]  response){
        this.response = response;
    }

    public user [] getResponse() {
        return response;
    }

    public void setResponse(user[] response) {
        this.response = response;
    }
}
