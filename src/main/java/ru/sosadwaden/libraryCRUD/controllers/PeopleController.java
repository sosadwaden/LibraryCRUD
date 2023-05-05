package ru.sosadwaden.libraryCRUD.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.sosadwaden.libraryCRUD.dao.PersonDAO;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/people")
public class PeopleController {

    private final PersonDAO personDAO;

    @Autowired
    public PeopleController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping()
    public String index(Model model, HttpServletResponse response) {
        model.addAttribute("people", personDAO.index());

        return "people/index";
    }

    @GetMapping("/new")
    public String newPerson() {
        return "people/new";
    }

}
