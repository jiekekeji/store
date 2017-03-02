package com.store.webfont;

import com.store.dao.UserDao;
import com.store.model.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class WebUser {
    private static Logger logger = Logger.getLogger(WebUser.class);
    private UserDao service = new UserDao();

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    @ResponseBody
    public Object findUserById() {
        User user = service.findUserById(1);
        logger.info(user);
        return null;
    }
}
