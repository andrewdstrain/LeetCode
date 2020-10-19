import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Twitter {
	Map<Integer, User> users;
	int incrementor;

    /** Initialize your data structure here. */
    public Twitter() {
    	users = new HashMap<>();
    	incrementor = 0;
    }
    
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        ensureExistance(userId);
        
        users.get(userId).getTweets().put(incrementor++, tweetId);
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        ensureExistance(userId);
    	
        // A treemap ensures the reverse order requirement but it also requires
        // additional coding, below, to get the job done.
    	Map<Integer, Integer> treemap = new TreeMap<>(Collections.reverseOrder());
    	
    	for (Integer followId : users.get(userId).getFollows()) {
            ensureExistance(followId);
            
            // Put the tweets for the followed user in the treemap
    		Map<Integer, Integer> tweets = users.get(followId).getTweets();
    		for (Integer key : tweets.keySet()) {
    			treemap.put(key, tweets.get(key));
    		}
    	}
    	
    	/*
    	 * Initialize looping
    	 * 
    	 * The output is of List<Integer>, which doesn't exist. The Map.Entry
    	 * iterator is used to get the reverse ordered results.
    	 * 
    	 */
    	Iterator<Map.Entry<Integer, Integer>> iter = treemap.entrySet().iterator();
    	
    	// Initialize newsFeed
    	List<Integer> newsFeed = new ArrayList<>();
    	int count = 0;
    	
    	// Only want the first 10
    	while (iter.hasNext() && count < 10) {
    		newsFeed.add(iter.next().getValue());
    		count++;
    	}
                
    	return newsFeed;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        ensureExistance(followerId);
        
        users.get(followerId).getFollows().add(followeeId);
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if (followerId == followeeId) return;
        
        ensureExistance(followerId);
        
        users.get(followerId).getFollows().remove(followeeId);
    }
    
    // Make sure that the user exists
    private void ensureExistance(Integer userId) {
    	if (! users.containsKey(userId)) {
    		users.put(userId, new User(userId));
    	}
    }

}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */