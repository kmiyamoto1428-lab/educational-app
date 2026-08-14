package com.kyosei.educational_app.controller;

import com.kyosei.educational_app.entity.Lesson;
import com.kyosei.educational_app.service.LessonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LessonController {

    private final LessonService lessonService;

    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @GetMapping("/lessons")
    public String lessons(Model model) {

        List<Lesson> lessons = lessonService.findAllLessons();

        model.addAttribute("lessons", lessons);

        return "lessons";
    }
}