package in.moni.external;

import in.moni.internal.Post;

public class BlogPost extends Post {
    @Override
    public void publish() {
        System.out.println("Publishing blog post");
    }

    public void addTags() {
        System.out.println("Adding blog tags");
    }
}
