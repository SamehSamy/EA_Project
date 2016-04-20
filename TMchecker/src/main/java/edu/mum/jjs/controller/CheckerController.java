package edu.mum.jjs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mum.jjs.domain.Appointment;
import edu.mum.jjs.domain.Checker;
import edu.mum.jjs.domain.TimeSlot;
//github.com/SamehSamy/EA_Project.git
import edu.mum.jjs.service.AppointmentService;
import edu.mum.jjs.service.CheckerService;

@Controller
@RequestMapping("/checker")
public class CheckerController {
  @Autowired
  CheckerService checkerService;
  @Autowired
  AppointmentService appointmentService;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String home(Model model) {
    return "/checker/checkerHome";
  }
  
  @RequestMapping(value = "/addChecker", method = RequestMethod.GET)
  public String checkRegister(Model model) {
    model.addAttribute("Checker", new Checker());
    return "/checker/register";
  }

  @RequestMapping(value = "/listAll", method = RequestMethod.GET)
  public String getAllappointments(Model model) {
    List<Appointment> appointments = appointmentService.getAll();
    model.addAttribute("appointment", appointments);
    return "Listappointment";
  }

 
  @RequestMapping(value = "/approve", method = RequestMethod.GET)
  @ResponseBody
  public void approveAppointment(Appointment appointment,Model model) {
    checkerService.approveAppointment(appointment);
    
  }

  @RequestMapping(value = "/reject", method = RequestMethod.GET)
  public void rejectAppointment(Appointment appointment,Model model) {
    checkerService.rejectAppointment(appointment);
    
  }
	@RequestMapping(value = "/update/{appointId}", method = RequestMethod.POST)
	public String modifyAppointment(@PathVariable Integer appointId, Appointment appointment, TimeSlot slot) {
		checkerService.modifyAppointment(appointment, appointId, slot);
		return "scheduale";
	}



}
