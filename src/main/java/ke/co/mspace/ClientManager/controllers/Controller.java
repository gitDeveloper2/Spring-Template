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
//        log.info("Controller::home called");

        return "src/newlayout";
    }
    @GetMapping("/home/{pathVariable}")
    public String home(Model model, @PathVariable String pathVariable){
        model.addAttribute("page",pathVariable);
        log.info("Controller::home called with pathVariable set to '{}'",pathVariable);
//        throw new UserNotLoggedInException("++++++++");
        return "src/newlayout";
    }
    @GetMapping("/add_user")
    public String addUser(Model model){

        log.info("Controller::add_user called");
//       throw new UserNotLoggedInException("++++++++");
        return "src/manage_user_details/add_user";
    }
//    @ExceptionHandler(UserNotLoggedInException.class)
//    public ModelAndView handleError(HttpServletRequest req, Exception ex) {
//        ModelAndView mav=new ModelAndView();
//        mav.addObject("error","mu error");
//        mav.setViewName("src/errors");
//        return mav;
//    }

    @GetMapping("/test")
    public String test(){
        return "/fragments/content";
    }




}
