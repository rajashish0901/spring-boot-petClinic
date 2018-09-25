package petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import petclinic.services.OwnerService;

@Controller
public class OwnerController {

    OwnerService m_ownerService;

    public OwnerController(OwnerService ownerService) {
        System.out.println(" @@ listOwners(Model model) @@ ");
        this.m_ownerService = ownerService;
    }

    @RequestMapping({"owners","owners/index","owners/index.html"})
    public String listOwners(Model model){
        System.out.println(" @@ listOwners(Model model) @@ ");
        model.addAttribute("owners", m_ownerService.findAll());
        return "owners/index";
    }
    @RequestMapping("owners/find")
    public String findOwners(){
        return "notimplemented";
    }
}
