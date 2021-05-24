package exrentalbook;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SearchBookRepository extends CrudRepository<SearchBook, Long> {


}