package com.kyosei.educational_app.controller;

import com.kyosei.educational_app.entity.Lesson;
import com.kyosei.educational_app.service.LessonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



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

    @GetMapping("/lessons/{id}")
    public String lessonDetail(@PathVariable Long id, Model model) {

        Lesson lesson = lessonService.findById(id);

        model.addAttribute("lesson", lesson);

        return "lesson-detail";
    }

    @GetMapping("/lessons/new")
    public String lessonCreate() {
        
        return "lesson-create";
    }

    @PostMapping("/lessons")
    public String postMethodName(@ModelAttribute Lesson lesson) {

        lessonService.save(lesson);
        
        return "redirect:/lessons";
    }
    
}