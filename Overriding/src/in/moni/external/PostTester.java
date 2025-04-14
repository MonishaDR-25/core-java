package in.moni.external;

import in.moni.internal.Post;

public class PostTester {
    public void test(Post post) {
        if (post != null) {
            post.publish();
            if (post instanceof BlogPost) {
                BlogPost blog = (BlogPost) post;
                blog.addTags();
            } else {
                System.err.println("Not blog post");
            }
        } else {
            System.err.println("Post is null");
        }
    }
}
