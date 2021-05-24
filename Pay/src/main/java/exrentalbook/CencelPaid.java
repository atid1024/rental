package exrentalbook;

public class CencelPaid extends AbstractEvent {

    private Long id;

    public CencelPaid(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
