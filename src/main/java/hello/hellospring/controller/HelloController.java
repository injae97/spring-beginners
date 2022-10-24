package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {



    @GetMapping("hello") // GET 
    public String hello(Model model) {
        model.addAttribute("data","hello!!");
        return "hello";
    }


    /**
     * @param name (url:path?name=value)
     * @return hello-template
     */
    @GetMapping("hello-mvc")
    public String HelloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name",name);
        return "hello-template";
    }
}
