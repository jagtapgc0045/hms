package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {
	WebDriver ldriver;

	public AddNewCustomer(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(ldriver, this);
	}

	// click on customerbutton
	@FindBy(xpath = "(//a[@href='#'])[7]")
	private WebElement customerbutton;

	// click on customer item
	@FindBy(xpath = "(//a[@href='/Admin/Customer/List'])//p")
	private WebElement CustomerItem;

	// click on add new button
	@FindBy(xpath = "//a[@href='/Admin/Customer/Create']")
	private WebElement addnewbutton;

	// Enter email
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement entemail;

	// Enter password
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement entpassword;

	// Enter Firstname
	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement entfirstname;

	// Enter LastName
	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement entlastname;

	// Select Gender
	@FindBy(xpath = "//input[@id='Gender_Male']")
	private WebElement gender;

	// Enter birthdate
	@FindBy(xpath = "//input[@id='DateOfBirth']")
	private WebElement DOB;

	// Enter company name
	@FindBy(xpath = "//input[@id='Company']")
	private WebElement entcompany;

	// tax checkbox
	@FindBy(xpath = "//input[@id='IsTaxExempt']")
	private WebElement taxcheckbox;

	// NewsLetter
	@FindBy(xpath = "//div[@class='k-multiselect-wrap k-floatwrap']")
	private WebElement entnewsletter;

	// customer role
	@FindBy(xpath = "(//div[@class='k-multiselect-wrap k-floatwrap'])[2]")
	private WebElement customerrole;

	// manager of vendor
	@FindBy(xpath = "//select[@class='form-control valid']")
	private WebElement manofvendor;

	// Active Checkbox
	@FindBy(xpath = "//input[@id='Active']")
	private WebElement checkbox;

	// admin comment
	@FindBy(xpath = "//textarea[@id='AdminComment']")
	private WebElement admincomment;

//	public NewCustomer(WebDriver rdriver)
//	{
//		ldriver=rdriver;
//		PageFactory.initElements(ldriver, this);
//	}
//	//@FindBy (xpath="(//a[@href='#'])[7]") private WebElement customerbutton;

	public void clickonCustomerButton() {
		customerbutton.click();
	}

	public void clickonCustomerItem() {
		CustomerItem.click();
	}

	public void clickonAddNew() {
		addnewbutton.click();
	}

	public void enterEmail() {
		entemail.sendKeys("sdfg");
	}

//	public void 
//	{
//		
//	}
//	
//	public void 
//	{
//		
//	}
//	
//	public void 
//	{
//		
//	}
//	
//	public void 
//	{
//		
//	}
//	
//	public void 
//	{
//		
//	}
//	
//	public void 
//	{
//		
//	}
//	
//	public void 
//	{
//		
//	}
//	
//	public void 
//	{
//		
//	}
//	
//	public void 
//	{
//		
//	}
//	
//	public void 
//	{
//		
//	}
//	
//	public void 
//	{
//		
//	}

}
