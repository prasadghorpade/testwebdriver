package framework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class AppProperties {

	private static AppProperties appprop;
	public static String PropFile;
	public static String browser_name;
	public static String browserLocation;

	private AppProperties() {

		try {
			PropFile = "D:\\Oxygen-Eclipse1\\cucumbertestdemo\\src\\main\\resources\\run.properties";
			Properties p = new Properties();
			FileReader fr = new FileReader(PropFile);
			p.load(fr);
			
			AppProperties.browser_name= p.getProperty("browser_name");
			AppProperties.browserLocation=p.getProperty("browserLocation");
			System.out.println(AppProperties.browser_name);
			fr.close();
			System.out.println("Reading and loading " + PropFile + " Properties sucessful");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Failed to read from " + PropFile + " file." + "\n Stack :" + e);
		}

	}

	public static AppProperties getProperties() {
		if (appprop == null) {
				appprop = new AppProperties();
			} 
		
		return appprop;
	}

}
