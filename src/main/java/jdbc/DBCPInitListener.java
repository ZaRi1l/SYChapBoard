package jdbc;

import java.io.IOException;
import java.io.StringReader;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DBCPInitListener implements ServletContextListener {
	
	public void contextInitialized(ServletContextEvent sce) {
		String poolConfig = sce.getServletContext().getInitParameter("poolConfig");
		Properties prop = new Properties();
		try {
			prop.load(new StringReader(poolConfig));
		} catch (IOException e) {
			throw new RuntimeException("config load fail", e);
		}
		loadJDBCDriver(prop);
		initConnectionPool(prop);
	}

	private void loadJDBCDriver(Properties prop) {
		// TODO Auto-generated method stub
		
	}
	
	private void initConnectionPool(Properties prop) {
		// TODO Auto-generated method stub
		
	}
}
