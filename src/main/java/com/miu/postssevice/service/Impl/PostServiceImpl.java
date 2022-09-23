package com.miu.postssevice.service.Impl;

import com.miu.postssevice.dto.request.PostRequest;
import com.miu.postssevice.dto.request.UpdatePostRequest;
import com.miu.postssevice.dto.response.PostResponse;
import com.miu.postssevice.entity.Post;
import com.miu.postssevice.repository.PostRepository;
import com.miu.postssevice.service.PostService;
import org.hibernate.sql.Update;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void save(PostRequest post) {
        postRepository.save(modelMapper.map(post,Post.class));
    }

    @Override
    public List<PostResponse> getAllPosts() {
        List<PostResponse> posts = new ArrayList<>();
        for(Post temp : postRepository.findAll()){
            posts.add(modelMapper.map(temp,PostResponse.class));
        }
        return posts;
    }

    @Override
    public void delete(Long postId) {
        postRepository.deleteById(postId);
    }

    @Override
    public PostResponse update(UpdatePostRequest post) {
        return modelMapper.map(postRepository.save(modelMapper.map(post,Post.class)),PostResponse.class);
    }

    @Override
    public List<PostResponse> getUserPosts(Long userId) {
        List<PostResponse> posts = new ArrayList<>();
        for(Post temp : postRepository.getPostsByUserId(userId)){
            posts.add(modelMapper.map(temp,PostResponse.class));
        }
        return posts;
    }
}
