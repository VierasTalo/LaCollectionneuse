package haagahelia.fi.LaCollectionneuse.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ManRepository extends CrudRepository <Man, Long> {
	List<Man> findByetunimi(String etunimi);
}
