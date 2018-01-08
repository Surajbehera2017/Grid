package com;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SelfNode {

	static WebDriver driver;
	
	public static void main(String[] args) throws MalformedURLException 
	{
		String url = "http://google.co.in";
		String Node = "http://172.25.114.13:4444/wd/hub";
		File file = new File("D:/Suraj/IEDriverServer.exe");
		System.setProperty("WebDriver.IE.Driver", file.getAbsolutePath());
		
		DesiredCapabilities CAP = DesiredCapabilities.internetExplorer();
		CAP.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		CAP.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		CAP.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, false);
		
		driver = new RemoteWebDriver(new URL(Node), CAP);
		
		driver.navigate().to(url);
		
		File Path = new File("D:\\Firefox25\\firefox.exe");
		/*	
		FirefoxBinary binary = new FirefoxBinary(Path);
		FirefoxProfile Profile = new FirefoxProfile();
		
		driver2 = new FirefoxDriver(binary,Profile);
		driver2.get("http://upmsit1.dls.deutsche-leasing.de:81/AS/manual-login-upm");
		driver2.quit();*/
		
		//driver.quit();
	}

}
