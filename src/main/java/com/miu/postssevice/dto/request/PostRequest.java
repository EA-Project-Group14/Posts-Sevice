package com.miu.postssevice.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.miu.postssevice.entity.Attachment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostRequest {
    private long userId;
    private String content;
    private List<Attachment> attachments;
}
