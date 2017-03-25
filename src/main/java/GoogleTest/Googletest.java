package GoogleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googletest {
	public void googletest() throws IOException
		{
			WebDriver wd = new FirefoxDriver();
			wd.manage().window().maximize();
			wd.get("http://www.google.com/");
			
			File f = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("D:\\Workspace\\GitHubTestNew\\Screenshot\\GoogleScreen.jpg"));
		}
}
