package guru.testing.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Person extends BaseEntity{
    String firstName;
    String lastName;

    public Person(long id, String first, String last){
        super(id);
        this.firstName = first;
        this.lastName = last;
    }
}
