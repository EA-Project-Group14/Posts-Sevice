package com.miu.postssevice.controller;

import com.miu.postssevice.dto.request.PostRequest;
import com.miu.postssevice.dto.request.UpdatePostRequest;
import com.miu.postssevice.dto.response.PostResponse;
import com.miu.postssevice.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Posts")
public class PostController {
    @Autowired
    private final PostService postService;

    @GetMapping
    public List<PostResponse> getAll(){
        return postService.getAllPosts();
    }

    @GetMapping("/user/{userId}")
    public List<PostResponse> getUserPosts(@Valid @PathVariable Long userId){
        return postService.getUserPosts(userId);
    }
    @PostMapping
    public void save(@Valid PostRequest post){
        postService.save(post);
    }

    @DeleteMapping
    public void delete(@Valid Long postId){
        postService.delete(postId);
    }

    @PutMapping
    public PostResponse update(@Valid UpdatePostRequest postRequest){
        return postService.update(postRequest);
    }


}
