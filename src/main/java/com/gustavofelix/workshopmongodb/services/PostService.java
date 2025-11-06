package com.gustavofelix.workshopmongodb.services;

import com.gustavofelix.workshopmongodb.domain.Post;
import com.gustavofelix.workshopmongodb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> findAll() {
        return postRepository.findAll();
    }

}
