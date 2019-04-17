package haagahelia.fi.LaCollectionneuse.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import haagahelia.fi.LaCollectionneuse.domain.Man;
import haagahelia.fi.LaCollectionneuse.domain.ManRepository;
//Controller eli pyyntöjä käsittelevä tiedosto
@Controller
public class ManController {
	//Autowired kutsuu ManControllerin alussa tietyn olion
	@Autowired
	private ManRepository repository;
	//RequestMapping eli kontrollerilta pyydetään tiettyyn sivuarvoon sisältöä joka käsitellään
	@RequestMapping(value="/men")
	//Model-luokka mallintaa dataa esim. listasta/repositoriosta
	public String manList(Model model) {
		model.addAttribute("men", repository.findAll());
		return "men";
	}
	
	@RequestMapping(value="/add")
	public String addMan(Model model) {
		model.addAttribute("man", new Man());
		return "addman";
	}
	//RequestMethod.POST on käytännössä HTML-lomakkeiden POST-metodia vastaava, ts. dataa syötetään jonnekin
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String save(Man man) {
		//Repositorioon tallentaminen
		repository.save(man);
		return "redirect:men";
	}
	
	//GETillä sama perusajatus kuin POSTissa
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteMan(@PathVariable("id") Long mies_id, Model model) {
    	//poistaminen onnistuu helposti CRUDRepositoryn lähtökohtaisilla työkaluilla
		repository.deleteById(mies_id);
        return "redirect:../men";
    }     
}
