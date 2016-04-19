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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mum.jjs.domain.Appointment;
import edu.mum.jjs.domain.Checker;
<<<<<<< HEAD
import edu.mum.jjs.domain.TimeSlot;
=======
import edu.mum.jjs.domain.Student;
>>>>>>> branch 'master' of https://github.com/SamehSamy/EA_Project.git
import edu.mum.jjs.service.AppointmentService;
import edu.mum.jjs.service.CheckerService;

@Controller
@RequestMapping("/checker")
public class CheckerController {
  @Autowired
  CheckerService checkerService;
  @Autowired
  AppointmentService appointmentService;

  @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
  public String studentRegister(Model model) {
    model.addAttribute("Student", new Student());
    return "/checker/register";
  }


	@RequestMapping("/addChecker")
	public String scheduale() {
		return "checkerForm";
	}



  @RequestMapping(value = "/listAll", method = RequestMethod.GET)
  public String getAllappointments(Model model) {
    List<Appointment> appointments = appointmentService.getAll();
    model.addAttribute("appointment", appointments);
    return "Listappointment";
  }


  @RequestMapping(value = "/addChecker", method = RequestMethod.GET)
  public String checkRegister(Model model) {
    model.addAttribute("Checker", new Checker());
    return "/checker/register";
  }




  @RequestMapping(value = "/addChecker", method = RequestMethod.POST)
  public String submitChecker(@ModelAttribute("checkerAdd") Model model, Checker checker,
      BindingResult bindingResult, RedirectAttributes redirectAttributes) {
    if (bindingResult.hasErrors()) {
      return "checkerForm";
    }
    // String[] suppressedFields = bindingResult.getSuppressedFields();
    // if (suppressedFields.length > 0) {
    // throw new RuntimeException("Attempt to bind fields that haven't been allowed in initBinder():
    // "
    // + StringUtils.addStringToArray(suppressedFields, ", "));
    // }
    checkerService.save(checker);
    redirectAttributes.addFlashAttribute("checkers", checker);


    return "redirect:/checkersuccess";
  }

  @RequestMapping(value = "/approve", method = RequestMethod.POST)
  public String approveAppointment(Appointment appointment) {
    checkerService.approveAppointment(appointment);
    return "commentApprove";
  }

  @RequestMapping(value = "/reject", method = RequestMethod.PUT)
  public String rejectAppointment(Appointment appointment) {
    checkerService.rejectAppointment(appointment);

    return "commentreg";
  }


	@RequestMapping(value = "/update/{appointId}", method = RequestMethod.PUT)
	public String modifyAppointment(@PathVariable String appointId, Appointment appointment, TimeSlot slot) {
		checkerService.modifyAppointment(appointment, appointId, slot);
		return "commentmodfy";
	}



}
