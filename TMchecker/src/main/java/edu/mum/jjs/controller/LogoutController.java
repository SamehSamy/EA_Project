package edu.mum.jjs.controller;

import java.util.Set;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class LogoutController {
  @RequestMapping(value = "/success/dispatch", method = RequestMethod.GET)
  public String dispatch(Model model   ) {
//session must be created here
	  
	  
	  
    Set<String> roles = AuthorityUtils.authorityListToSet(
        SecurityContextHolder.getContext().getAuthentication().getAuthorities());
    if (roles.contains("ROLE_ADMIN")) {
      return "/checker/checkerHome";
    }
    return "/student/studentHome";
  }


}
