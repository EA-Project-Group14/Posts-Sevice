package com.miu.postssevice.controller;

import com.miu.postssevice.dto.request.PostRequest;
import com.miu.postssevice.dto.request.UpdatePostRequest;
import com.miu.postssevice.dto.response.PostResponse;
import com.miu.postssevice.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private final PostService postService;

    @GetMapping
    public List<PostResponse> getAll(){
        return postService.getAllPosts();
    }

    @GetMapping(params = "userId")
    public List<PostResponse> getUserPosts(Long userId){
        return postService.getUserPosts(userId);
    }
    @PostMapping
    public void save(@RequestBody PostRequest post){
        System.out.println("post.getUserId() = " + post.getUserId());
        postService.save(post);
    }

    @DeleteMapping("/{postId}")
    public void delete(@PathVariable Long postId){
        postService.delete(postId);
    }

    @PutMapping("/{postId}")
    public PostResponse update(@PathVariable Long postId, @RequestBody UpdatePostRequest postRequest){
        return postService.update(postId, postRequest);
    }


}
