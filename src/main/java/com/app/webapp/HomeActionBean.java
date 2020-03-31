package com.app.webapp;

import javax.faces.application.FacesMessage;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.navigate.Navigate;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "home")
@ELBeanName(value = "home")
@Join(path = "/home", to = "/home.jsf")
public class HomeActionBean
{

    private String hello = "Hello";

    public String getHello()
    {
        return hello;
    }

    public void setHello(String hello)
    {
        this.hello = hello;
    }
    
    public Navigate save()
    {
        this.hello = "world";
        return Navigate.to("/home");
    }

}