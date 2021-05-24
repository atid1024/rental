package exrentalbook;

public class Canceled extends AbstractEvent {

    private Long id;

    public Canceled(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
