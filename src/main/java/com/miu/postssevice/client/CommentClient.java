package com.miu.postssevice.client;

import com.miu.postssevice.dto.response.CommentResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "comments-service")
public interface CommentClient {

    @RequestMapping(method = RequestMethod.GET, value = "/comments")
    List<CommentResponse> getCommentsByPostId(@RequestParam Long postId);

    @RequestMapping(method = RequestMethod.DELETE, value = "/comments")
    void deletePostComments(@RequestParam Long postId);
}
