package me.shinsunyoung.springbootdeveloper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@ResponseBody
class TestConroller {
    @GetMapping("/test")
    public String test(){
        return "Hello, World!";
    }
}
