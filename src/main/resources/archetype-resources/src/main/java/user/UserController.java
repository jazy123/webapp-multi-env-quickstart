package ${package}.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/toLogin")
	public String toLogin(){
		return "";
	}
	
	@RequestMapping("/login")
	public String login(){
		return "";
	}
	
	@RequestMapping("/logout")
	public String logout(){
		return "";
	}

}
