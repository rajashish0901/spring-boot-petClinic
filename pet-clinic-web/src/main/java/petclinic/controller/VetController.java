package petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import petclinic.services.VetService;

@Controller
public class VetController {
    VetService m_vetService;

    public VetController(VetService vetService) {
        System.out.println(" @@ VetController(VetService vetService) @@ ");
        this.m_vetService = vetService;
    }

    @RequestMapping({"vets","vets/index","vets/index.html,vets/"})
    public String listVets(Model model){
        System.out.println(" @@ listVets(Model model) @@ ");
        model.addAttribute("vets", m_vetService.findAll());
        return "vets/index";
    }
}
