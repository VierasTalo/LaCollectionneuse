package haagahelia.fi.LaCollectionneuse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import haagahelia.fi.LaCollectionneuse.domain.Man;
import haagahelia.fi.LaCollectionneuse.domain.ManRepository;

@SpringBootApplication
public class LaCollectionneuseApplication {

	private static final Logger log = LoggerFactory.getLogger(LaCollectionneuseApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(LaCollectionneuseApplication.class, args);
	}

	

	}

