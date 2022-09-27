package com.miu.postssevice.service;

import com.miu.postssevice.dto.request.PostRequest;
import com.miu.postssevice.dto.request.UpdatePostRequest;
import com.miu.postssevice.dto.response.PostResponse;
import com.miu.postssevice.entity.Post;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService{

    void save(PostRequest post);
    List<PostResponse> getAllPosts();
    void delete(Long postId);
    PostResponse update(Long postId, PostRequest post);
    List<PostResponse> getUserPosts(Long userId);

}
