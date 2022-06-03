package com.model;

import javax.persistence.*;

@Entity // đánh dấu đây là Entity => hibernate sẽ tạo bảng trong CSDL
@Table(name = "blogs")// tên mặc định là customer => @table để cài đặt lại thuộc tính của 1 bảng vd: đổi tên thành customers

public class Blog {
    @Id// đánh dấu đây là thuộc tính id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String content;

    public Blog() {
    }

    public Blog(Long id, String name, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
