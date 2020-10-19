import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Twitter")
public class TwitterTest {
    @Test
    void leetCodeTest() {
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

    @Test
    void onlyTen() {
        Twitter twitter = new Twitter();
        List<Integer> answer = new ArrayList<>();

        twitter.postTweet(1, 1);
        twitter.postTweet(1, 2);
        twitter.postTweet(1, 3);
        twitter.postTweet(1, 4);
        twitter.postTweet(1, 5);
        twitter.postTweet(1, 6);
        twitter.postTweet(1, 7);
        twitter.postTweet(1, 8);
        twitter.postTweet(1, 9);
        twitter.postTweet(1, 10);
        twitter.postTweet(1, 11);

        answer.add(11);
        answer.add(10);
        answer.add(9);
        answer.add(8);
        answer.add(7);
        answer.add(6);
        answer.add(5);
        answer.add(4);
        answer.add(3);
        answer.add(2);

        Assertions.assertEquals(answer, twitter.getNewsFeed(1));
    }
}
