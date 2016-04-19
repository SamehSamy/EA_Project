package edu.mum.jjs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.jjs.domain.Checker;
import edu.mum.jjs.domain.Student;
import edu.mum.jjs.service.CheckerService;
import edu.mum.jjs.service.StudentService;

@Controller
@RequestMapping("/register")
public class RegisterController {
  @Autowired
  CheckerService checkerService;
  @Autowired
  StudentService studentService;
  @RequestMapping(value = "/", method = RequestMethod.POST)
  public String register(Checker checker, Student student) {
    if (checker == null && student == null)
      return "register";

    if (checker != null) {
      checkerService.save(checker);
      return "redirect:/";
    } else if (student != null) {
      studentService.save(student);
      return "redirect:/";
    } else {
      return "register";
    }
  }


}
