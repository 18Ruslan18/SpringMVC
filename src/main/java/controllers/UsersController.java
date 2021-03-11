package controllers;

import dao.UsersDao;
import models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import java.util.List;

public class UsersController implements Controller {

    @Autowired
    private UsersDao usersDao;


    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        if (httpServletRequest.getMethod().equals("GET")) {
            List<User> users = usersDao.findAll();
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("users");
            modelAndView.addObject("usersFromServer", users);
            return modelAndView;
        }

        return null;
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}