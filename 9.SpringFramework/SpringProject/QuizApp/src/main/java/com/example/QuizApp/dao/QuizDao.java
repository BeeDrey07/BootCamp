package com.example.QuizApp.dao;

import com.example.QuizApp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
