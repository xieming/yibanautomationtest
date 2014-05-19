package com.yiban.automation.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWrapper {
    private static String CONFIG_NODE = "config";

    /**
     * Function to take the screen shot and save it to the classpath dir.
     * Usually, you will find the png file under the project root.
     * 
     * @param driver
     *            Webdriver instance
     * @param desc
     *            The description of the png
     */
    public static void screenShot(WebDriver driver, String desc) {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
        String dateString = formatter.format(currentTime);
        File scrFile = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);
        try {
            desc = desc.trim().equals("") ? "" : "-" + desc.trim();
            File screenshot = new File("screenshot" + File.separator
                    + dateString + desc + ".png");
            FileUtils.copyFile(scrFile, screenshot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get the handle of the pop up window.
     * 
     * @param driver
     *            Webdriver instance.
     * @param handles
     *            All handles before the window pops up.
     * @param timeOutInSeconds
     * @return The handle of the pop up window.
     */
    public static String getPopUpWindowHandle(final WebDriver driver,
            final Set<String> handles, long timeOutInSeconds) {
        String newWindow = (new WebDriverWait(driver, timeOutInSeconds))
                .until(new ExpectedCondition<String>() {
                    public String apply(WebDriver input) {
                        Set<String> newHandles = input.getWindowHandles();
                        newHandles.removeAll(handles);
                        if (newHandles.size() > 0) {
                            return newHandles.iterator().next();
                        }
                        return null;
                    }
                });
        return newWindow;
    }

    /**
     * When element will be not surely displayed , use this function
     * 
     * @param driver
     * @param by
     * @param timeOutInSeconds
     * @return
     */

    public static WebElement waitForElementPresent(WebDriver driver,
            final By by, long timeOutInSeconds) {

        WebElement we = null;
        try {
            WebDriverWait wdw = new WebDriverWait(driver, timeOutInSeconds);

            if ((we = wdw.until(new ExpectedCondition<WebElement>() {
                public WebElement apply(WebDriver d) {
                    // TODO Auto-generated method stub
                    return d.findElement(by);
                }
            })) != null) {
                // Do something;
            }
        } catch (Exception e) {
            // Do something;
        }
        return we;

    }

    public static WebElement waitForElementPresent1(WebDriver driver,
            final WebElement element, long timeOutInSeconds) {
        WebElement we = null;
        try {
            WebDriverWait wdw = new WebDriverWait(driver, timeOutInSeconds);

            if ((we = wdw.until(new ExpectedCondition<WebElement>() {
                public WebElement apply(WebDriver d) {
                    // TODO Auto-generated method stub
                    return element;
                }
            })) != null) {
                // Do something;
            }
        } catch (Exception e) {
            // Do something;
        }
        return we;

    }

    /**
     * When element will be displayed surely , use this function
     * 
     * A wrapper WebElement.isDisplayed method.
     * 
     * @param driver
     * @param ele
     * @param timeOutInSeconds
     * @return
     * @see WebElement
     */
    public static Boolean isDisplayed(final WebDriver driver,
            final WebElement element, long timeOutInSeconds) {
        return (new WebDriverWait(driver, timeOutInSeconds))
                .until(new ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver input) {
                        return element.isDisplayed();
                    }
                });
    }

    /**
     * A wrapper for executeScript method.
     * 
     * @param driver
     * @param js
     */
    public static void executeJavaScript(final WebDriver driver, final String js) {
        ((JavascriptExecutor) driver).executeScript(js);
    }

    /**
     * Wait for a short time. Cannot use WebDriver.manage.timeout. The IE does
     * not support.
     * 
     * @param driver
     * @param seconds
     */
    public static void waitPageLoad(final WebDriver driver, final long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void setInprogress(String configFile, String mode,
            String modifyNode, String newValue) {
        try {

            SAXReader saxReader = new SAXReader();
            Document document = saxReader.read(new File(configFile));
            Element node = (Element) document
                    .selectSingleNode("//student[@model='" + mode + "']");
            node.addAttribute(modifyNode, newValue);
            OutputFormat format = OutputFormat.createPrettyPrint();
            XMLWriter output = new XMLWriter(new FileWriter(
                    new File(configFile)), format);
            output.write(document);
            output.flush();
            output.close();

        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

  /*  public static void ifIeRefreshPage(final WebDriver driver) {
        WebDriverWrapper.waitPageLoad(driver, 5);
        if (((Object) TestConfiguration.browser).name().equals("ie")) {
            driver.navigate().refresh();
            WebDriverWrapper.waitPageLoad(driver, 5);
        }

    } */

    public static  void chooselistbox(final WebDriver driver, String selection, String choice)
    {
        Select droplist = new Select(driver.findElement(By.id(selection)));   
        droplist.selectByVisibleText(choice);

    }
    
    
    public static void hoverandclick(WebElement path, WebDriver driver)
    {
    	Actions builder = new Actions(driver); 
    	Actions hoverOverRegistrar = builder.moveToElement(path);
    	hoverOverRegistrar.perform();
    }
    
    
    public static void Contents(WebElement path, String frampath, String fbodypath, String neirong, WebDriver driver)
    {
    	((JavascriptExecutor)driver).executeScript("arguments[0].checked = true;", path);
    	driver.switchTo().frame(driver.findElement(By.id(frampath)));
    	driver.findElement(By.xpath(fbodypath)).clear();
    	driver.findElement(By.xpath(fbodypath)).sendKeys(neirong);
    	driver.switchTo().defaultContent();
    }
}