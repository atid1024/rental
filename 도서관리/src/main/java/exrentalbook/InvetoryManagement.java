package exrentalbook;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

@Entity
@Table(name="InvetoryManagement_table")
public class InvetoryManagement {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long bookId;
    private String bookName;
    private String rentalStatus;

    @PrePersist
    public void onPrePersist(){
        InventoryIncrease inventoryIncrease = new InventoryIncrease();
        BeanUtils.copyProperties(this, inventoryIncrease);
        inventoryIncrease.publishAfterCommit();


        InvetoryDecrease invetoryDecrease = new InvetoryDecrease();
        BeanUtils.copyProperties(this, invetoryDecrease);
        invetoryDecrease.publishAfterCommit();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getRentalStatus() {
        return rentalStatus;
    }

    public void setRentalStatus(String rentalStatus) {
        this.rentalStatus = rentalStatus;
    }




}
