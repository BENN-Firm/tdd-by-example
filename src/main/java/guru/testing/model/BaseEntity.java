package guru.testing.model;

public class BaseEntity {

    long id;
    public BaseEntity(long id){
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
