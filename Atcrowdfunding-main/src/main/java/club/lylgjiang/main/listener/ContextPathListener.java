package club.lylgjiang.main.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 项目路径监听器:把项目根路径添加到application域中
 * 
 * @author 姜立成
 * @date:   2019年5月24日 下午11:45:34
 *
 */
public class ContextPathListener implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		ServletContext application = sce.getServletContext();
		String contextPath = application.getContextPath();
		
		// 添加项目根路径到application对象中
		application.setAttribute("contextPath", contextPath);
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}

}
