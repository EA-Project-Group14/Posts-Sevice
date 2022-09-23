package com.miu.postssevice.dto.request;

import com.miu.postssevice.entity.Attachment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdatePostRequest {
    private long id;
    private long userId;
    private String content;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private List<Attachment> attachments;

}