package guru.testing.controllers;

public class IndexController {

    public String index(){
        return "index";
    }

    public String oupsHandler(){
        return "notImplemented";
    }

    public String oops(){
        throw new ValueNotFoundException();
    }
}
