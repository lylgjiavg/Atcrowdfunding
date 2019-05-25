package club.lylgjiang.main.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import club.lylgjiang.bean.pojo.TUser;
import club.lylgjiang.common.exception.UserOrPwdException;
import club.lylgjiang.common.util.Const;
import club.lylgjiang.manager.service.UserService;

@Controller
public class DispatcherController {

	@Autowired
	private UserService userServiceImpl;
	
	
	/**
	 * 跳转到主页:
	 * 		通过webapp下的index.jsp跳转到位于WEB-INF下的主页中
	 */
	@RequestMapping("/index")
	public String index() {
		
		return "index";
	}
	
	/**
	 * 跳转到登录页面
	 */
	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}
	
	/**
	 * 跳转到主页面
	 */
	@RequestMapping("/main")
	public String mainLog() {
		
		return "main";
	}
	
	/**
	 * 跳转到登录页面
	 * @throws Exception 
	 */
	@RequestMapping("/doLogin")
	public String doLogin(TUser user, HttpSession session) throws Exception {
		
		// 根据用户账号和密码查询指定账户是否存在
		TUser userResult = userServiceImpl.login(user);
		
		// 根据返回值判断用户登录是否成功,并根据相应情况进行操作
		if(userResult == null) {
			throw new UserOrPwdException("用户名或密码错误!");
		}
		
		// 把用户信息设置到session域中
		session.setAttribute(Const.USER_SESSION, userResult);
		
		return "redirect:main.htm";
	}
	
	
	
}
