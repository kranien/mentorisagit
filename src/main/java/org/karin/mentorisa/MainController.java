
package org.karin.mentorisa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

import org.karin.mentorisa.User;
import org.karin.mentorisa.UserRepository;
import org.springframework.web.servlet.view.RedirectView;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email, @RequestParam String password) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        User n = new User();
        n.setName(name);
        n.setEmail(email);
        n.setPassword(password);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

    @GetMapping(path="/checkUser")
    public @ResponseBody RedirectView checkUserPassword(@RequestParam String email, @RequestParam String password) {
        User n = new User() ;
        n = userRepository.findByEmail(email);
        if( password == n.getPassword())
        {
            return new RedirectView("/loginpage");
        }
        else
            return new RedirectView("/greeting");
    }

    @GetMapping("/loginpage")
    public String loginpage(@RequestParam(name="email", required=false, defaultValue="World")  String name, @RequestParam(name="password", required=false)  String password, Model model ) {
        model.addAttribute("email", name);
        model.addAttribute("password", password);
        return "loginpage";
    }

}