package haagahelia.fi.LaCollectionneuse.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
//CrudRepository on ns. pohjatiedosto jossa on valmiina lukemattomia mahdollisuuksia tietokantojen etsimiseen, mutta sitä jatkamalla voidaan luoda sovelluskohtaisia lisäfunktiota kuten esim. tämä etunimilistaus.
public interface ManRepository extends CrudRepository <Man, Long> {
	
	List<Man> findByetunimi(String etunimi);
}
