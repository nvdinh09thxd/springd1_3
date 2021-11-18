package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("blogs")
public class BlogsController {

	@GetMapping("index")
	public String index() {
		return "blogs.index";
	}

	@GetMapping("about")
	public String about() {
		return "blogs.about";
	}

	@GetMapping("contact")
	public String contact() {
		return "blogs.contact";
	}
	
	@GetMapping("post")
	public String post() {
		return "blogs.post";
	}

}
