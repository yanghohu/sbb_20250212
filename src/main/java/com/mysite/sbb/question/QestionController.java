package com.mysite.sbb.question;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QestionController {

    @GetMapping("/question/list")
    //@ResponseBody
    public String list() {
        return "question_list";
    }
}
