using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;

namespace TestowyProjekt
{
    public class Tests
    {
        IWebDriver driver;
        [SetUp]
        public void Setup()
        {
            driver = new ChromeDriver(@"F:\Programowanie\SoftwareAutomationTesting\Selenium\KursSelenium\TestowyProjekt\TestowyProjekt\Resources\");
            
        }

        [Test]
        public void Test1()
        {
            driver.Navigate().GoToUrl("https://www.google.pl");
            driver.SwitchTo().Frame(0);
            driver.FindElement(By.ClassName("CwaK9")).Click();






        }
    }
}