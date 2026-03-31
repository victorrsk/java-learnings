package poo.stringbuilder;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime datetime = LocalDateTime.now();

        Post post1 = new Post(datetime, "First post", "First post content", 10);
        Comment comment1 = new Comment("First post comment!");
        Comment comment2 = new Comment("Second comment!");
        Comment comment3 = new Comment("Third comment!");

        post1.addComment(comment1);
        post1.addComment(comment2);
        post1.addComment(comment3);

        System.out.println(post1);


    }
}
