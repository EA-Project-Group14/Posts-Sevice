package com.miu.postssevice.client;

import com.miu.postssevice.dto.response.CommentResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("comments")
public interface CommentClient {
    @RequestMapping(method = RequestMethod.GET, value = "/{postId}")
    List<CommentResponse> getCommentsByPostId(Long postId);

    @RequestMapping(method = RequestMethod.DELETE, value = "/post/{postId}")
    void deletePostComments(Long postId);
}
