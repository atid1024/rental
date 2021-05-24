package exrentalbook;

public class InventoryIncrease extends AbstractEvent {

    private Long id;

    public InventoryIncrease(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
