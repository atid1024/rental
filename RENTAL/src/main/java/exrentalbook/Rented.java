package exrentalbook;

public class Rented extends AbstractEvent {

    private Long id;

    public Rented(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
