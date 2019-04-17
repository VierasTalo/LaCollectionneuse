package haagahelia.fi.LaCollectionneuse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import haagahelia.fi.LaCollectionneuse.domain.Man;
import haagahelia.fi.LaCollectionneuse.domain.ManRepository;

@SpringBootApplication
public class LaCollectionneuseApplication {
	//Konsoliloggaus koko sovelluksen toiminnalle
	private static final Logger log = LoggerFactory.getLogger(LaCollectionneuseApplication.class);
	//Javalle perinteinen main
	public static void main(String[] args) {
		SpringApplication.run(LaCollectionneuseApplication.class, args);
	}
	//Bean eli käytännössä Spring-olio
	@Bean
	public CommandLineRunner laCollectionneuseDemo(ManRepository repository) {
		return (args) -> {
			//Konsoliloggausta
			log.info("Save men from themselves");
			//Tallentaa repositorioon lähtötiedot
			repository.save(new Man("Daniel", "ruskeat", "porvari", "idiootti"));
			repository.save(new Man("Adrien", "siniset", "lusmu", "hylätty"));	
	
			log.info("fetch all men");
			//Etsii jokaisen miesinstassin repositoriosta ja palauttaa toStringin konsoliin
			for (Man man : repository.findAll()) {
				log.info(man.toString());
			}

		};
	}

	}

