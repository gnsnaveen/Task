package in.nareshit.raghu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import in.nareshit.raghu.entity.User;
import in.nareshit.raghu.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService service;
	
	@GetMapping("/register")
	public String showRegister() {
		return "UserRegister"; 
		
	}
	@PostMapping("/save")
	public String save_User(@ModelAttribute User user,Model model,RedirectAttributes attributes)
	{
		System.out.println(user);
		Long id=service.saveUser(user);
		String message="hi user"+id+" got saved";
		model.addAttribute("message", message);
		return "UserRegister";
		
	}
	
	@GetMapping("/delete")
	public String delete_User(@RequestParam(required = false) long Id,RedirectAttributes attributes) {
		
		service.deleteUser(Id);
		String message="hi user got deleted";
		attributes.addAttribute("message", message);
		return "redirect:all";
	}
	
}
