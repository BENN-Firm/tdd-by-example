package guru.testing.model;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Owner extends Person{

    private String address;
    private String city;
    private String tel;
    private Set<Pet> pets = new HashSet<>();



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }



    public Owner(long id, String first, String last) {
        super(id, first, last);
    }

    public Pet getPet(String name){
        return getPet(name, false);
    }

    public Pet getPet(String name, boolean ignoreNew){
        name = name.toLowerCase();
        for (Pet pet : pets){
            if (!ignoreNew || !pet.isNew()){
                String petName = pet.getName().toLowerCase();
                if (petName.equals(name)){
                    return pet;
                }
            }
        }
        return null;
    }

}
