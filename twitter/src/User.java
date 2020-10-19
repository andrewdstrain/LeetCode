import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class User {
	private int id;
	private Map<Integer, Integer> tweets;
	private Set<Integer> follows;
	
	private User() {}
	
	public User(int id) {
		this.id = id;
		this.tweets = new HashMap<>();
		this.follows = new HashSet<>();
		this.follows.add(id);	// Follow yourself
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<Integer, Integer> getTweets() {
		return tweets;
	}

	public void setTweets(Map<Integer, Integer> tweets) {
		this.tweets = tweets;
	}

	public Set<Integer> getFollows() {
		return follows;
	}

	public void setFollows(Set<Integer> follows) {
		this.follows = follows;
	}
}
