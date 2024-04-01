package com.example.demo.service.Impl;

import com.example.demo.dao.PostRepository;
import com.example.demo.entity.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.payload.PostDto;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        //our business logic is here.

        //data coming from POST request
        // DTO --> Entity transfer and then save to DB
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post postSaved = this.postRepository.save(post);

        //Entity --> DTO --> return to API
        PostDto response = new PostDto();
        response.setId(postSaved.getId());
        response.setTitle(postSaved.getTitle());
        response.setDescription(postSaved.getDescription());
        response.setContent(postSaved.getContent());

        return response;
    }
}
