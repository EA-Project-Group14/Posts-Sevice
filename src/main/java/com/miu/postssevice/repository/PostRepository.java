package com.miu.postssevice.repository;

import com.miu.postssevice.entity.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

    List<Post> getPostsByUserId(Long userId);
}
