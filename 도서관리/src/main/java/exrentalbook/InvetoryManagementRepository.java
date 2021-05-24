package exrentalbook;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="invetoryManagements", path="invetoryManagements")
public interface InvetoryManagementRepository extends PagingAndSortingRepository<InvetoryManagement, Long>{


}
