package com.BestBuy.Utils;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestEcom {
	public static WebDriver driver = null;

	public void launchBrowser(String url) {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(url);
		}

		catch (Exception ex) {

			System.out.println("Problem while launching the browser");
			ex.printStackTrace();

		}
	}
	public void Brokenlink() {
		
		//1.Write code to open a web browser and navigate to the Best Buy e-commerce website (https://www.bestbuy.com/).

		 WebElement link = driver.findElement(By.tagName("a"));

			String url = link.getAttribute("href");

			if (url == null || url.isEmpty()) {

				System.out.println("Invalid url");

			}

			try {
				HttpURLConnection httpConnection = (HttpURLConnection) new URL(url).openConnection();
				httpConnection.connect();
				int respCode = httpConnection.getResponseCode();

				if (respCode >= 400) {
					System.out.println(url + " is broken and its responsecode is " + respCode);
				} else
					System.out.println(url + " is Valid and its responsecode is " + respCode);

			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}



	public void quitBrowser() {
		try {
			driver.quit();

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}

	public void closeBrowser() {
		try {
			driver.close();

		}

		catch (Exception ex) {

			ex.printStackTrace();
		}
	}

	public void typeText(WebElement ele, String text) {
		try {
			ele.clear();
			ele.sendKeys(text);

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}

	public void clickAction(WebElement ele) {
		try {
			ele.click();

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}

	public void waitForElement(WebElement ele) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOf(ele));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			// wait.until(ExpectedConditions.)

		} catch (Exception ex) {

			ex.printStackTrace();
		}

	}

	public void waitForElementWithTimouts(WebElement ele, int timeOut) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.visibilityOf(ele));
			wait.until(ExpectedConditions.elementToBeClickable(ele));

		} catch (Exception ex) {

			ex.printStackTrace();
		}

	}

	public void pollingWait(WebElement ele) {
		try {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(2));
			wait.until(ExpectedConditions.visibilityOf(ele));
			wait.until((ExpectedConditions.elementToBeClickable(ele)));

		} catch (Exception ex) {

			ex.printStackTrace();
		}

	}

	public void DropDownByValue(WebElement ele, String value) {
		try {
			Select sel = new Select(ele);
			sel.selectByValue(value);

		} catch (Exception ex) {

			ex.printStackTrace();
		}

	}

	public void DropDownByIndex(WebElement ele, int index) {
		try {
			Select sel = new Select(ele);
			sel.selectByIndex(index);

		} catch (Exception ex) {

			ex.printStackTrace();
		}

	}

	public void DropDownByVisibleText(WebElement ele, String VisibleText) {
		try {
			Select sel = new Select(ele);
			sel.selectByVisibleText(VisibleText);

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}

	public void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}

	public void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}

	public void moveTo(WebElement ele) {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(ele).build().perform();

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}

	public void rightClick(WebElement ele) {
		try {

			Actions act = new Actions(driver);
			act.moveToElement(ele).contextClick().build().perform();

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}

	// isEnabled
	public boolean verifyEnabled(WebElement ele) {
		boolean retVal = false;
		try {
			if (ele.isEnabled()) {
				System.out.println("Pass : Element is enabled");
				retVal = true;

			} else {
				System.out.println("Fail : Element is not enabled");

			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return retVal;
	}

	public boolean verifyDisplayed(WebElement ele) {
		boolean retVal = false;

		try {
			if (ele.isDisplayed()) {
				System.out.println("Pass : Element is Displayed");
				retVal = true;

			} else {
				System.out.println("Fail : Element is Displayed");

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		return retVal;
	}

	public boolean verifySelected(WebElement ele) {
		boolean retVal = false;
		try {
			if (ele.isSelected()) {
				System.out.println("Pass : Element is Selected");
				retVal = true;

			} else {
				System.out.println("Fail : Element is Selected");

			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return retVal;
	}

	// frame
	public void framesByIndex(int index) {
		try {
			driver.switchTo().frame(index);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void framesByWebElement(WebElement ele) {
		try {
			driver.switchTo().frame(ele);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void framesByNameOrID(String nameOrID) {
		try {
			driver.switchTo().frame(nameOrID);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void framesByDefault() {
		try {
			driver.switchTo().defaultContent();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	// draganddrop
	public void dragAndDrop(WebElement source, WebElement target) {
		try {
			Actions act = new Actions(driver);
			act.dragAndDrop(source, target).build().perform();

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}

	// doubleclick
	public void doubeclick(WebElement ele) {
		try {
			Actions act = new Actions(driver);
			act.doubleClick(ele).build().perform();

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}

	// clickAndHold
	public void clickandHold(WebElement source, WebElement target) {
		try {
			Actions act = new Actions(driver);
			act.clickAndHold(source).moveToElement(target).build().perform();

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}

	// javasscriptexecutor
	public void jsScrollUpDrown(int x) {
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0," + x + ")");

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}

	public void jsScrollRightLeft(int y) {
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(" + y + ",0)");

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}

	public void jsScrollUntillFound(WebElement ele) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", ele);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void jsWebElementClick(WebElement ele) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", ele);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void jsTitle() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			System.out.println(js.executeScript("return document.title").toString());

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	// screenshot
	public void screenShotOperation(String Sname) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("./ScreenShots/" + Sname + ".png");
			FileUtils.copyFile(source, destination);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	// windowhandling
	public void windowHandlingOperation() {
		try {
			String pWindow = driver.getWindowHandle();
			Set<String> windowHandle = driver.getWindowHandles();

			for (String adr : windowHandle) {

				if (!(pWindow.contentEquals(adr))) {
					driver.switchTo().window(adr);
				}
				System.out.println(adr);

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	// fileupload using Sendkeys

	public void fileUploadSendKeys(WebElement ele, String path) {
		try {
			ele.sendKeys(path);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	// fileupload another method
	public void fileAndClickUsingSikuli(String fileName) {
		try {
			String sourcePath = "D:\\POMUIFramework\\sikuliimages\\";
			Screen screen = new Screen();

			Pattern p1 = new Pattern(sourcePath + fileName);
			screen.find(p1);
			screen.click(p1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
