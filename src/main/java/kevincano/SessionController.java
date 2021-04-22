package kevincano;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class SessionController {
	
	
		public void hidden(HttpSession session) {
			session.setAttribute("count", -1);
		}

		@RequestMapping("")
		public String index(Model model, HttpSession session) {
			
			
			model.addAttribute("message", "Welcome User!");
			Integer count = (Integer) session.getAttribute("count");
			
			count++;
			session.setAttribute("count", count);
			
			return "session.jsp";
		}
		@RequestMapping("/counter")
		public String counter() {
			
			
			return "counter.jsp";
		}
	
	
}
