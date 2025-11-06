package com.gustavofelix.workshopmongodb.repository;

import com.gustavofelix.workshopmongodb.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {

    List<Post> findByTitleContaining(String text);

}
