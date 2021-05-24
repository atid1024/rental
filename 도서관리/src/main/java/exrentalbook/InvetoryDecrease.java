package exrentalbook;

public class InvetoryDecrease extends AbstractEvent {

    private Long id;

    public InvetoryDecrease(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
