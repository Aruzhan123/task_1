package com.ex.task1.Repos;

import com.ex.task1.model.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepos extends CrudRepository<Group, Long> {
}
