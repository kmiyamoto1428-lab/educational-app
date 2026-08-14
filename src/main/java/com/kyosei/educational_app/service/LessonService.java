package com.kyosei.educational_app.service;

import com.kyosei.educational_app.entity.Lesson;
import com.kyosei.educational_app.repository.LessonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonService {

    private final LessonRepository lessonRepository;

    public LessonService(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    public List<Lesson> findAllLessons() {
        return lessonRepository.findAll();
    }
}
