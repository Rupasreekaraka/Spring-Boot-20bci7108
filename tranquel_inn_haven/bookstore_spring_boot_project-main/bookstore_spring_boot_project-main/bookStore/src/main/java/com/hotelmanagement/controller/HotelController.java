package com.hotelmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.hotelmanagement.entity.Driver;
import com.hotelmanagement.entity.customer;
import com.hotelmanagement.entity.employee;
import com.hotelmanagement.entity.Admin;
import com.hotelmanagement.entity.room;
import com.hotelmanagement.repository.adminRepository;
import com.hotelmanagement.repository.employeeRepository;
import com.hotelmanagement.service.customerService;
import com.hotelmanagement.service.driverService;
import com.hotelmanagement.service.employeeService;
import com.hotelmanagement.service.roomService;

import java.util.*;

@Controller
public class HotelController {
	
	@Autowired
	private employeeService eservice;
	
	@GetMapping("/")
	public String Login() {
		return "login";
	}
	
	@GetMapping("/home")
	public String Home() {
		return "home";
	}
	
	@GetMapping("/reception")
	public String Reception() {
		return "Reception";
	}
	
	@GetMapping("/Admin_login")
	public String Adminlogin() {
		return "adminlogin";
	}
	
	@GetMapping("/Receptionsit_Login")
	public String Receptionsitlogin() {
		return "receptionistlogin";
	}
	
	@GetMapping("/Newcustomerform")
	public String newcustomerform() {
		return "newcustomerform";
	}
	@GetMapping("/Add_Employee")
	public String addemployee() {
		return "addemployee";
	}
	@GetMapping("/Add_Room")
	public String addroom() {
		return "addroom";
	}
	@GetMapping("/Add_Driver")
	public String adddrivers() {
		return "adddrivers";
	}
	
	@GetMapping("/Admin_page")
	public String Admin() {
		return "Admin";
	}
	@GetMapping("/Receptionist_home")
	public String Receptionisthome() {
		return "receptionisthome";
	}
	@GetMapping("/logout")
	public String logoutp() {
		return "login";
	}
	@GetMapping("/update_status")
	public ModelAndView updatestatus() {
		List<customer>list = cservice.getAllcustomers();
		return new ModelAndView("updatestatus","customer",list);
	}
	
	
	@Autowired
	private adminRepository aRepo;
	
	@PostMapping("/Admin_login")
	public String checkadmin(@ModelAttribute Admin a) {
		int id = a.getId();
		Admin adata = aRepo.findById(id).get();
		if(a.getPassword().equals(adata.getPassword())) 
		{
			return "redirect:/home";
		}
		else 
		{
			return "redirect:/Admin_login";
		}
	}
	
	@Autowired
	private employeeRepository eRepo;
	
	@PostMapping("/Receptionsit_Login")
	public String checkr(@ModelAttribute employee e) {
		int id = e.getId();
		employee edata = eRepo.findById(id).get();
		if(e.getName().equals(edata.getName()) && "Receptionist".equals(edata.getJob())) 
		{
			return "redirect:/Receptionist_home";
		}
		else 
		{
			return "redirect:/Receptionsit_Login";
		}
	}
	
	
	@GetMapping("/employee_list")
	public ModelAndView getAllemployees() {
		List<employee>list = eservice.getAllemployees();
//		ModelAndView m=new ModelAndView();
//		m.setViewName("bookList");
//		m.addObject("book",list);
		return new ModelAndView("employeelist","employee",list);
	}
	
	@PostMapping("/save")
	public String addemployee(@ModelAttribute employee e) {
		eservice.save(e);
		return "redirect:/employee_list";
	}
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id") int id) {
		eservice.deleteByID(id);
		return "redirect:/employee_list";
	}
	
	@RequestMapping("/editemployee/{id}")
	public String editEmployee(@PathVariable("id") int id, Model model) {
		employee em = eservice.getEmployeeById(id);
		model.addAttribute("employee",em);
		return "employeeedit";
	}
	
	@RequestMapping("/editcustomer/{id}")
	public String editcustomer(@PathVariable("id") int id, Model model) {
		customer cm = cservice.getcustomerById(id);
		model.addAttribute("customer",cm);
		return "customeredit";
	}
	
	@Autowired
	private roomService rservice; 
	
	@RequestMapping("/deleteMyrList/{id}")
	public String deleteMyrList(@PathVariable("id") int id) {
		rservice.deleteById(id);
		return "redirect:/update_roomlist";
	}
	@RequestMapping("/editroom/{id}")
	public String editroom(@PathVariable("id") int id, Model model) {
		room rm = rservice.getroomById(id);
		model.addAttribute("room",rm);
		return "roomedit";
	}
	@GetMapping("/update_roomlist")
	public ModelAndView getAllchss() {
		List<room>list = rservice.getAllrooms();
		return new ModelAndView("updateroomlist","room",list);
	}
	@PostMapping("/ersave")
	public String eraddroom(@ModelAttribute room r) {
		rservice.save(r);
		return "redirect:/update_roomlist";
	}
	
	@GetMapping("/room_list")
	public ModelAndView getAllrooms() {
		List<room>list = rservice.getAllrooms();
		return new ModelAndView("roomlist","room",list);
	}
	@GetMapping("/room_searchlist")
	public ModelAndView rs() {
		List<room>list = rservice.getAllrooms();
		return new ModelAndView("roomsearchlist","room",list);
	}
	@PostMapping("/rsave")
	public String addroom(@ModelAttribute room r) {
		rservice.save(r);
		return "redirect:/room_list";
	}
    
	
	@Autowired
	private customerService cservice;
	
	@GetMapping("/customer_list")
	public ModelAndView getAllcustomers() {
		List<customer>list = cservice.getAllcustomers();
		return new ModelAndView("customerlist","customer",list);
	}
	@PostMapping("/csave")
	public String addcustomer(@ModelAttribute customer c) {
		cservice.save(c);
		return "redirect:/customer_list";
	}
	@PostMapping("/cesave")
	public String addcustomeredit(@ModelAttribute customer c) {
		cservice.save(c);
		return "redirect:/customer_list";
	}
	@RequestMapping("/deleteMycList/{id}")
	public String deleteMycList(@PathVariable("id") int id) {
		cservice.deleteById(id);
		return "redirect:/check_Out";
	}
	
	@GetMapping("/check_Out")
	public ModelAndView getAllchs() {
		List<customer>list = cservice.getAllcustomers();
		return new ModelAndView("checkoutlist","customer",list);
	}
	
	@Autowired
	private driverService dservice;
	
	@GetMapping("/driver_list")
	public ModelAndView getAlldrivers() {
		List<Driver>list = dservice.getAlldrivers();
		return new ModelAndView("driverlist","Driver",list);
	}
	@PostMapping("/dsave")
	public String adddriver(@ModelAttribute Driver d) {
		dservice.save(d);
		return "redirect:/driver_list";
	}
	@RequestMapping("/deleteMydList/{id}")
	public String deleteMydList(@PathVariable("id") int id) {
		dservice.deleteByID(id);
		return "redirect:/driver_list";
	}
	@RequestMapping("/editdriver/{id}")
	public String editdriver(@PathVariable("id") int id, Model model) {
		Driver dm = dservice.getEmployeeById(id);
		model.addAttribute("Driver",dm);
		return "driveredit";
	}
	
}
