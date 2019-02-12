package haagahelia.fi.LaCollectionneuse.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import haagahelia.fi.LaCollectionneuse.domain.Man;
import haagahelia.fi.LaCollectionneuse.domain.ManRepository;

@Controller
public class ManController {
	@Autowired
	private ManRepository repository;
	
	@RequestMapping(value="/men")
	public String manList(Model model) {
		model.addAttribute("men", repository.findAll());
		return "manList";
	}
	
	@RequestMapping(value="/add")
	public String addMan(Model model) {
		model.addAttribute("man", new Man());
		return "addman";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String save(Man man) {
		repository.save(man);
		return "redirect:manList";
	}
}
