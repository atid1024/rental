package exrentalbook;

public class Paid extends AbstractEvent {

    private Long id;

    public Paid(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
