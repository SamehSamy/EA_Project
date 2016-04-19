package edu.mum.jjs.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.mum.jjs.domain.Appointment;
import edu.mum.jjs.domain.Checker;
import edu.mum.jjs.domain.Student;
import edu.mum.jjs.domain.TimeSlot;
import edu.mum.jjs.service.StudentService;
import edu.mum.jjs.serviceimpl.StudentServiceImpl;

@Controller
@RequestMapping("/student")
public class StudentController {
  StudentService studentServ = new StudentServiceImpl();

  @RequestMapping(value = "/rest/checker", method = RequestMethod.GET)
  public @ResponseBody List<Checker> retrieveSlots() {
    List<Checker> list = new ArrayList<>();
    Checker c = new Checker();
    c.setFirstName("Amine");
    c.setLastName("Kimo");
    list.add(c);
    return list;
  }

  @RequestMapping(value = "/createAppointment", method = RequestMethod.POST)
  public String add(Appointment appointment, BindingResult result) {
    String view = "redirect:.";
    if (!result.hasErrors()) {
      // studentServ.schedualAppointment(student, timeSlot);
    } else {
      view = "addCar";
    }
    return view;
  }

  @RequestMapping("/scheduale")
  public String scheduale() {
    return "scheduale";
  }
}
