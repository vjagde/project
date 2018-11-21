FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
.withTimeout(30, TimeUnit.SECONDS)
.pollingEvery(5, TimeUnit.SECONDS)
.ignoring(NoSuchElementException.class);

WebElement ele = wait.until(new Function<WebDriver, WebElement>()
{

public WebElement apply(WebDriver driver)

            {         

WebElement element = driver.findElement(By.xpath("....."));

String getTextOnPage = element.getText();

if(getTextOnPage.equals("Selenium Certification Training"))

{

System.out.println(getTextOnPage);

return element;

}                                             

else

{

System.out.println("FluentWait Failed");

                        return null;

}}

});
