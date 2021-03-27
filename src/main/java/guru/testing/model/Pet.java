package guru.testing.model;

public class Pet {
    private String name;
    private boolean isNew = false;

    public Pet(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public boolean isNew(){
        return isNew;
    }
}
