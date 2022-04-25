package web.security.spring_security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.security.spring_security.model.User;
import web.security.spring_security.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String show(@AuthenticationPrincipal User user, Model model){
        model.addAttribute("role", user.getRoles());
        model.addAttribute("user", user);
        return "users/admin";
    }
}
