package top.jaylearning.studentmanger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 70788
 */
@Controller
public class WebController {
    @GetMapping("/success")
    String success(){
        return "success";
    }
}
