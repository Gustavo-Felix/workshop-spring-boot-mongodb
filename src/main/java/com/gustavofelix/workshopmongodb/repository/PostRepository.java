package com.gustavofelix.workshopmongodb.repository;

import com.gustavofelix.workshopmongodb.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
