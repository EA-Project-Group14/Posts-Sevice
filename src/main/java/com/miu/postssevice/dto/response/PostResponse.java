package com.miu.postssevice.dto.response;

import com.miu.postssevice.entity.Attachment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostResponse {
    private long id;
    private long userId;
    private String content;
    private String lastUpdate;
    private List<Attachment> attachments;
    private List<CommentResponse> comments;
}
