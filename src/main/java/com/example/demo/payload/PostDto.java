package com.example.demo.payload;

public class PostDto {
    private long id;
    private String title;
    private String description;
    private String content;

    public PostDto() {
    }

    public PostDto(Long id, String title, String description, String content) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
    }
    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = this.id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
