package com.kyosei.educational_app.repository;

import com.kyosei.educational_app.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
    
}
