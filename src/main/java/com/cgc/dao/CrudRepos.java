package com.cgc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgc.records.students;

public interface CrudRepos extends JpaRepository<students, Integer> {

}
