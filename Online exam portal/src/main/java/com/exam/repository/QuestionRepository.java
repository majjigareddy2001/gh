package com.exam.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.entity.Question;


public interface QuestionRepository extends JpaRepository<Question, Long> {

}
