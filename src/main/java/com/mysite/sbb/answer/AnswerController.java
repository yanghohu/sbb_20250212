package com.mysite.sbb.answer;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionService;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/answer")
@Controller
@RequiredArgsConstructor
public class AnswerController {

    private final QuestionService questionService;

    @PostMapping("/create/{id}")
    public String dreateAnswer(Model model, @PathVariable("id") Integer id,
                               @RequestParam String content) {
        Question question = this.questionService.getQuestion(id);
        // TODO : 답변을 등록한다.
        return String.format("redirect:/question/detail/%s", id);

    }
}
