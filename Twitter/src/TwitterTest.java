import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Twitter")
public class TwitterTest {
    @Test
    void test() {
        Twitter twitter = new Twitter();
        List<Integer> answer = new ArrayList<>();

        twitter.postTweet(1, 5);
        answer.add(5);
        Assertions.assertEquals(answer, twitter.getNewsFeed(1));

        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        answer.add(0, 6);
        Assertions.assertEquals(answer, twitter.getNewsFeed(1));

        twitter.unfollow(1, 2);
        answer.remove(0);
        Assertions.assertEquals(answer, twitter.getNewsFeed(1));
    }
}
