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
        model.addAttribute("name", name);
        return "hello-template";
    }


    /**
     * @param name
     * @return JSON : {"name":"spring!!!"}
     */
    @GetMapping("hello-api")
    @ResponseBody // HTTP-BODY에 문자 내용 직접 반환 (페이지 검사시 데이터만 있음)
    public Hello HelloAPI(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello; // object로 들어오면 HttpMessageConverter(JsonConverter)에 의해 JSON
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
