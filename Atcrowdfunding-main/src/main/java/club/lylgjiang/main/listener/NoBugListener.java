package club.lylgjiang.main.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class NoBugListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		// 代码护体神兽
		Logger log = LogManager.getLogger(NoBugListener.class);
		log.debug("  \r\n  ━━━━━━神兽出没━━━━━━\r\n" + 
				"\r\n" + 
				"  　　　┏┓　　　┏┓\r\n" + 
				"\r\n" + 
				"  　　┏┛┻━━━┛┻┓\r\n" + 
				"\r\n" + 
				"  　　┃　　　━　　　┃\r\n" + 
				"\r\n" + 
				"  　　┃　┳┛　┗┳　┃\r\n" + 
				"\r\n" + 
				"  　　┃　　　┻　　　┃\r\n" + 
				"\r\n" + 
				"  　　┗━┓　　　┏━┛Code is far away from bug with the animal protecting\r\n" + 
				"\r\n" + 
				"  　　　　┃　　　┃    神兽保佑,代码无bug\r\n" + 
				"\r\n" + 
				"  　　　　┃　　　┗━━━┓\r\n" + 
				"\r\n" + 
				"  　　　　┃　　　　　　　┣┓\r\n" + 
				"\r\n" + 
				"  　　　　┃　　　　　　　┏┛\r\n" + 
				"\r\n" + 
				"  　　　　┗┓┓┏━┳┓┏┛\r\n" + 
				"\r\n" + 
				"  　　　　　┗┻┛　┗┻┛\r\n" + 
				"\r\n" + 
				" \r\n" + 
				"\r\n" + 
				"  ━━━━━━bug消失━━━━━━");

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
	}

}
