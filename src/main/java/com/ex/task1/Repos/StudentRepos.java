package com.ex.task1.Repos;

import com.ex.task1.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepos extends CrudRepository<Student, Long> {
}
