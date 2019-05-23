package club.lylgjiang.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import club.lylgjiang.manager.service.TestService;

@Controller
public class TestController {

	@Autowired
	private TestService testServiceImpl;
	
	@RequestMapping("/manager/test.do")
	public String test() {
		
		int index = testServiceImpl.insertUser("zs");
		
		if(index>0) {
			return "success";
		}else {
			return "";
		}
	}
	
}
