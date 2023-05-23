package ke.co.mspace.ClientManager.controllers;

import jakarta.servlet.http.HttpServletRequest;
import ke.co.mspace.ClientManager.exceptions.UserNotLoggedInException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(UserNotLoggedInException.class)
    public ModelAndView handleError(UserNotLoggedInException e) {
        ModelAndView mav=new ModelAndView();
        System.out.println("AM being called");
        mav.addObject("error","mu error"+e.getMessage());
        mav.setViewName("src/errors");
        return mav;
    }
}
