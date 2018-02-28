/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.mycompany.in28minute2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    
    //Dependency = WelcomeController depend on 
    //welcome method that depend on WelcomeService to retreive Msg
    //once spring come in it will injected here
    //@Autowired helps to link the service / component if it is manage in spring
    @Autowired
    private WelcomeService service;
    
    @RequestMapping("/welcome")
    public String welcome(){
        return service.retrieveWelcomeMessage();
    }
}

//Spring to manage this bean and create an instance of this
@Component //@Component or @service help spring to know this bean need manage
class WelcomeService {
    public String retrieveWelcomeMessage() {
        return "Good Morning~~~!this is message";
    }
}