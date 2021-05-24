package exrentalbook;

public class InfoRegistered extends AbstractEvent {

    private Long id;

    public InfoRegistered(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
