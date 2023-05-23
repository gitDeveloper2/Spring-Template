package ke.co.mspace.ClientManager.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class LoginController {
    @GetMapping("/login")
public String login(){
//        log.debug("LoginController::login called");
        return "src/login";
    }
}
