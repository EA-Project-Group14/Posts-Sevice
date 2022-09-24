package com.miu.postssevice.dto.request;

import com.miu.postssevice.entity.Post;

import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import java.io.File;

public class AttachmentRequest {
    private long id;
    private File file;
    private Post post;
}
