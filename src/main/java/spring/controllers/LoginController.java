package spring.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import spring.daos.UserDao;
import spring.models.User;
import spring.validate.PasswordValidator;

@Controller
public class LoginController {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private PasswordValidator passwordValidator;

	private static final String ERR_LOGIN = "Invalid username or password!";
	private static final String ERR_ACTIVE = "Account has been locked!";

	@GetMapping("login")
	public String login() {
		return "views/login";
	}

	@PostMapping("login")
	public String handleLogin(@Valid @ModelAttribute("error") User user, BindingResult rs, RedirectAttributes re, HttpSession session) {
		
		passwordValidator.validate(user.getPassword(), rs);
		
		if(rs.hasErrors()) {
			return "views/login";
		}

		for (User us : userDao.getUsers()) {
			if (us.getUsername().equals(user.getUsername()) && us.getPassword().equals(user.getPassword())) {
				if ("de-active".equals(us.getActive())) {
					re.addFlashAttribute("msg", ERR_ACTIVE);
					return "redirect:/login";
				}
				session.setAttribute("userLogin", user);
				return "redirect:/blogs/index";
			}
		}

		re.addFlashAttribute("msg", ERR_LOGIN);
		return "redirect:/login";
	}

}
