package com.mehrdaddarraji.techblog.repository;

import com.mehrdaddarraji.techblog.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

}
