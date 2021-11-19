package spring.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("blogs")
public class BlogsController {

	@GetMapping("index")
	public String index(HttpSession session) {
		if (session.getAttribute("userLogin") == null) {
			return "redirect:/login";
		}
		return "blogs.index";
	}

	@GetMapping("about")
	public String about(HttpSession session) {
		if (session.getAttribute("userLogin") == null) {
			return "redirect:/login";
		}
		return "blogs.about";
	}

	@GetMapping("contact")
	public String contact(HttpSession session) {
		if (session.getAttribute("userLogin") == null) {
			return "redirect:/login";
		}
		return "blogs.contact";
	}

	@GetMapping("post")
	public String post(HttpSession session) {
		if (session.getAttribute("userLogin") == null) {
			return "redirect:/login";
		}
		return "blogs.post";
	}

}
