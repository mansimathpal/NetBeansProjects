package Controller; 
import com.learning.Customer;
import com.learning.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import Service.*;

@Controller
@RequestMapping(value = "/loginView.htm")

public class LoginController {
    LoginService loginService;
    public void setLoginService(LoginService loginService){
        this.loginService = loginService;
    }
    @RequestMapping(method = RequestMethod.GET)
    public String showLoginView(ModelMap model)
    {
        Customer customer = new Customer();
        model.addAttribute("Customer", customer);
        return "loginView";
        
    }
    @RequestMapping(method = RequestMethod.POST)
    public String processForm(@ModelAttribute(value = "Customer") Customer customer,ModelMap model)
    {
        ApplicationContext ac = new 
        ClassPathXmlApplicationContext("Activity2.1(spring)/Spring-Config.xml");
        Account act = (Account)ac.getBean("AccountBean");
        String str = "AccountNumber: " +act.getAccountNumber(); 
        model.addAttribute("accountNumber", str);
        String str1 = "Account Balance ($): "+act.getBalance();
        model.addAttribute("accountBalance", str1);
        model.addAttribute("helloMessage", loginService.sayHello(customer.getUserName()));
            return "userAccount";
    }
}
