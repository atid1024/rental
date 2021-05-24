package exrentalbook;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="SearchBook_table")
public class SearchBook {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Long bookId;
        private String bookStatus;


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
        public String getBookStatus() {
            return bookStatus;
        }

        public void setBookStatus(String bookStatus) {
            this.bookStatus = bookStatus;
        }

}
