package com.miu.postssevice.dto.request;

import com.miu.postssevice.entity.Attachment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdatePostRequest {
    @NotNull
    private long id;
    @NotNull
    private long userId;
    @NotEmpty
    private String content;
    private List<AttachmentRequest> attachments;

}