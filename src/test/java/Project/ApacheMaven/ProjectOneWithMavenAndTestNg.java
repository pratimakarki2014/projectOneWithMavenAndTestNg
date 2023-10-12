package Project.ApacheMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class ProjectOneWithMavenAndTestNg {
	WebDriver driver;
	
  @Test
  public void verifyIfAdminIsAbleToLoginWithCorrectUsernameAndCorrectPassword() throws InterruptedException {
	  driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	  String adminName = "rahulshettyacademy";
	  String adminPassword = "learning";
	  
	  driver.findElement(By.id("username")).sendKeys(adminName); 
	  Reporter.log("Correct Admin name input");
	  
	  driver.findElement(By.id("password")).sendKeys(adminPassword);
	  Reporter.log("Correct Admin password input");
	  
	  driver.findElement(By.xpath("//*[@id=\'login-form\']/div[4]/div/label[1]/span[1]")).click();
	  Reporter.log("Admin radio button clicked");
	  
	  driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	  Reporter.log("Term and conditions clicked");
	  
	  driver.findElement(By.id("signInBtn")).click();
	  Reporter.log("Sign in button clicked");
  }
  
  @Test
  public void verifyIfAdminIsAbleToLoginWithCorrectUsernameButIncorrectPassword() {
	  driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	  String adminName = "rahulshettyacademy";
	  String adminPassword = "abc";
	  
	  driver.findElement(By.id("username")).sendKeys(adminName);
	  Reporter.log("Input correct username");
	  
	  driver.findElement(By.id("password")).sendKeys(adminPassword);
	  Reporter.log("Input incorrect password");
	  
	  driver.findElement(By.xpath("//*[@id=\'login-form\']/div[4]/div/label[1]/span[1]")).click();
	  Reporter.log("Admin radio button clicked");
	  
	  driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	  Reporter.log("Term and conditions clicked");
	  
	  driver.findElement(By.id("signInBtn")).click();
	  Reporter.log("Sign in button clicked");
	  
	  
	  WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]"));
	  assertNotNull(errorMessage, "Error message for correct adminName but incorrect adminPassword");
	  Reporter.log("\r\nSucess!! error message for correct admin name but incorrect admin password");
	  
  }
   
  @Test
  public void verifyIfAdminIsAbleToLoginWithIncorrectUsernameButCorrectPassword() {
	  driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	  String adminName = "Kiam";
	  String adminPassword = "learning";
	  
	  driver.findElement(By.id("username")).sendKeys(adminName);
	  Reporter.log("Input Incorrect admin name");
	  
	  driver.findElement(By.id("password")).sendKeys(adminPassword);
	  Reporter.log("Input correct admin password");
	  
	  driver.findElement(By.xpath("//*[@id=\'login-form\']/div[4]/div/label[1]/span[1]")).click();
	  Reporter.log("Admin radio button clicked");
	  
	  driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	  Reporter.log("Term and conditions clicked");
	  
	  driver.findElement(By.id("signInBtn")).click();
	  Reporter.log("Sign in button clicked");
  }
  
  @Test
  public void verifyIfAdminIsAbleToLoginWithIncorrectUsernameAndIncorrectPassword() {
	  driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	  String adminName = "Mallisha";
	  String adminPassword = "xyz";
	  
	  driver.findElement(By.id("username")).sendKeys(adminName);
	  Reporter.log("Input Incorrect admin username");
	  
	  driver.findElement(By.id("password")).sendKeys(adminPassword);
	  Reporter.log("Input incorrect admin password");
	  
	  driver.findElement(By.xpath("//*[@id=\'login-form\']/div[4]/div/label[1]/span[1]")).click();
	  Reporter.log("Admin radio button clicked");
	  
	  driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	  Reporter.log("Term and conditions clicked");
	  
	  driver.findElement(By.id("signInBtn")).click();
	  Reporter.log("Sign in button clicked");
  }
  
  @Test
  public void verifyIfAdminIsAbleToLoginWithEmptyUsernameAndPasswordFields() {
	  driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	  String adminName = "";
	  String adminPassword = "";
	  
	  driver.findElement(By.id("username")).sendKeys(adminName);
	  Reporter.log("Input Incorrect admin username");
	  
	  driver.findElement(By.id("password")).sendKeys(adminPassword);
	  Reporter.log("Input incorrect admin password");
	  
	  driver.findElement(By.xpath("//*[@id=\'login-form\']/div[4]/div/label[1]/span[1]")).click();
	  Reporter.log("Admin radio button clicked");
	  
	  driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	  Reporter.log("Term and conditions clicked");
	  
	  driver.findElement(By.id("signInBtn")).click();
	  Reporter.log("Sign in button clicked");
  }
	
  @Test
 public void verifyIfUserIsAbleToLoginWithCorrectUsernameAndCorrectPassword() throws InterruptedException {
	  driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	  String adminName = "rahulshettyacademy";
	  String adminPassword = "learning";
	  
	  driver.findElement(By.id("username")).sendKeys(adminName);
	  Reporter.log("Input correct username");
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("password")).sendKeys(adminPassword);
	  Reporter.log("Input incorrect password");
	  
	  Thread.sleep(2000);
	  
  	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/label[2]/span[2]")).click();
  	  
  	  Thread.sleep(2000);
  	 
 	  driver.findElement(By.xpath("//*[@id=\"okayBtn\"]")).click();
	  	
  	  Thread.sleep(2000);
  	  
	  driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	  Reporter.log("Term and conditions clicked");
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("signInBtn")).click();
	  Reporter.log("Sign in button clicked");
	  
	  Thread.sleep(2000);
  }
 
  
 @Test
 public void verifyIfUserIsAbleToLoginWithCorrectUsernameButIncorrectPassword() throws InterruptedException {
	  driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	  String adminName = "rahulshettyacademy";
	  String adminPassword = "qwse";
	  
	  driver.findElement(By.id("username")).sendKeys(adminName);
	  Reporter.log("Input correct username");
	  
	  driver.findElement(By.id("password")).sendKeys(adminPassword);
	  Reporter.log("Input incorrect password");
	  
	  Thread.sleep(2000);
	  
  	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/label[2]/span[2]")).click();
  	  
  	  Thread.sleep(2000);
  	 
 	  driver.findElement(By.xpath("//*[@id=\"okayBtn\"]")).click();
	  	
  	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	  Reporter.log("Term and conditions clicked");
	  
	  driver.findElement(By.id("signInBtn")).click();
	  Reporter.log("Sign in button clicked"); 
 }
 
 @Test
 public void verifyIfUserIsAbleToLoginWithIncorrectUsernameButCorrectPassword() throws InterruptedException {
	  driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	  String adminName = "Liam";
	  String adminPassword = "learning";
	  
	  driver.findElement(By.id("username")).sendKeys(adminName);
	  Reporter.log("Input correct username");
	  
	  driver.findElement(By.id("password")).sendKeys(adminPassword);
	  Reporter.log("Input incorrect password");
	  
	  Thread.sleep(2000);
	  
  	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/label[2]/span[2]")).click();
  	  
  	  Thread.sleep(2000);
  	 
 	  driver.findElement(By.xpath("//*[@id=\"okayBtn\"]")).click();
	  	
  	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	  Reporter.log("Term and conditions clicked");
	  
	  driver.findElement(By.id("signInBtn")).click();
	  Reporter.log("Sign in button clicked");
 }
 
 @Test
 public void verifyIfUserIsAbleToLoginWithIncorrectUsernameAndIncorrectPassword() throws InterruptedException {
	  driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	  String adminName = "Sammin";
	  String adminPassword = "NLearning";
	  
	  driver.findElement(By.id("username")).sendKeys(adminName);
	  Reporter.log("Input correct username");
	  
	  driver.findElement(By.id("password")).sendKeys(adminPassword);
	  Reporter.log("Input incorrect password");
	  
	  Thread.sleep(2000);
	  
  	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/label[2]/span[2]")).click();
  	  
  	  Thread.sleep(2000);
  	 
 	  driver.findElement(By.xpath("//*[@id=\"okayBtn\"]")).click();
	  	
  	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	  Reporter.log("Term and conditions clicked");
	  
	  driver.findElement(By.id("signInBtn")).click();
	  Reporter.log("Sign in button clicked");
 }
 
 @Test
 public void verifyIfUserIsAbleToSignInWithEmptyUsernameAndPasswordFields() throws InterruptedException {
	  driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	  String adminName = "";
	  String adminPassword = "";
	  
	  driver.findElement(By.id("username")).sendKeys(adminName);
	  Reporter.log("Input Incorrect admin username");
	  
	  driver.findElement(By.id("password")).sendKeys(adminPassword);
	  Reporter.log("Input incorrect admin password");
	  
	  Thread.sleep(2000);
	  
  	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/label[2]/span[2]")).click();
  	  
  	  Thread.sleep(2000);
  	 
 	  driver.findElement(By.xpath("//*[@id=\"okayBtn\"]")).click();
	  	
  	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	  Reporter.log("Term and conditions clicked");
	  
	  driver.findElement(By.id("signInBtn")).click();
	  Reporter.log("Sign in button clicked");
 }
 /*
 @Test
 public void verifyIfUserOrAdminCanCheckMarkOnTermAndCondition() {
	 driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
 }
 */ 
  
 @Parameters({"url", "browser"})
  @BeforeTest
  public void setUp(String url, String browser) {
	  driver = new ChromeDriver();
	  driver.get(url);
	  driver.manage().window().maximize();
	  Reporter.log("Browser Init and navigate to https://rahulshettyacademy.com/loginpagePractise/");
  }

  @AfterTest
  public void cleanUp() throws InterruptedException {
	  
	  Thread.sleep(2000);
	  driver.quit();
  }

}
