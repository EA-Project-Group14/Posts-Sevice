package com.miu.postssevice.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.File;

@Entity
@Data
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    @Column(name = "ATTACHMENT")
    private File file;
    @ManyToOne
    private Post post;

}