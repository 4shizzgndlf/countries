package dk.ek.countries.controllers;

import dk.ek.countries.services.WelcomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WelcomeController {
    private WelcomeService service = new WelcomeService();

    @GetMapping("/")
    public ModelAndView welcome() {
        ModelAndView mav = new ModelAndView("index");
        String message = service.getWelcome();
        mav.addObject("welcome", message);
        return mav;
    }
}