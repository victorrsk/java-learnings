package basics.stringbuilder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post(LocalDateTime moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes += likes;
    }

    public List<Comment> getComments() {
        return this.comments;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.title + "\n");
        sb.append(this.likes + " likes");
        sb.append(" - " + this.moment);
        sb.append("\n" + this.content + "\n");
        for (Comment comment : this.comments) {
            sb.append(comment.getText() + "\n");
        }

        return sb.toString();
    }
}
