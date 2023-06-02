package ke.co.mspace.ClientManager.controllers;

import jakarta.servlet.http.HttpServletRequest;
import ke.co.mspace.ClientManager.exceptions.UserNotLoggedInException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
@Slf4j
public class Controller {
    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("page","blank");

        return "src/newlayout";
    }
    @GetMapping("/home/{pathVariable}")
    public String home(Model model, @PathVariable String pathVariable){
        model.addAttribute("page",pathVariable);
        return "src/newlayout";
    }
    @GetMapping("/add_user")
    public String addUser(Model model){
        return "src/manage_user_details/add_user";
    }

    @GetMapping("/test")
    public String test(){
        return "/fragments/content";
    }




}
