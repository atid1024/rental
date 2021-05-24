package exrentalbook.external;

public class Pay {

    private Long id;
    private Long rentId;
    private Integer rate;
    private Date regDate;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getRentId() {
        return rentId;
    }
    public void setRentId(Long rentId) {
        this.rentId = rentId;
    }
    public Integer getRate() {
        return rate;
    }
    public void setRate(Integer rate) {
        this.rate = rate;
    }
    public Date getRegDate() {
        return regDate;
    }
    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

}
