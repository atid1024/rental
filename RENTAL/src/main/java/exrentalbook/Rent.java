package exrentalbook;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="Rent_table")
public class Rent {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Date rentDtm;
    private String rentSts;
    private String rentBookNm;
    private String rentBookId;
    private String rentCustName;
    private Date rentStartDtm;
    private Date rentEndDtm;

    @PrePersist
    public void onPrePersist(){
        Returned returned = new Returned();
        BeanUtils.copyProperties(this, returned);
        returned.publishAfterCommit();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Date getRentDtm() {
        return rentDtm;
    }

    public void setRentDtm(Date rentDtm) {
        this.rentDtm = rentDtm;
    }
    public String getRentSts() {
        return rentSts;
    }

    public void setRentSts(String rentSts) {
        this.rentSts = rentSts;
    }
    public String getRentBookNm() {
        return rentBookNm;
    }

    public void setRentBookNm(String rentBookNm) {
        this.rentBookNm = rentBookNm;
    }
    public String getRentBookId() {
        return rentBookId;
    }

    public void setRentBookId(String rentBookId) {
        this.rentBookId = rentBookId;
    }
    public String getRentCustName() {
        return rentCustName;
    }

    public void setRentCustName(String rentCustName) {
        this.rentCustName = rentCustName;
    }
    public Date getRentStartDtm() {
        return rentStartDtm;
    }

    public void setRentStartDtm(Date rentStartDtm) {
        this.rentStartDtm = rentStartDtm;
    }
    public Date getRentEndDtm() {
        return rentEndDtm;
    }

    public void setRentEndDtm(Date rentEndDtm) {
        this.rentEndDtm = rentEndDtm;
    }




}
