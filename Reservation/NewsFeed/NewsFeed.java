import java.util.Arrays;

public class NewsFeed {
	String[] topics = {"Opinion","Tech","Science","Health"};
	int[] views = {0,0,0,0};
	
	public NewsFeed() {

	}
	
	public String[] getTopics() {
		return topics;
	}
	
	public String getTopTopic() {
		return topics[0];
	}
	
	public void viewTopic(int topicIndex) {
		views[topicIndex]++;
	}

	public static void main(String[] args) {
		NewsFeed sampleFeed = new NewsFeed();
		
		System.out.println("The top topic is "+ sampleFeed.getTopTopic());
		
		sampleFeed.viewTopic(1);
		sampleFeed.viewTopic(2);
		sampleFeed.viewTopic(3);
		sampleFeed.viewTopic(2);
		sampleFeed.viewTopic(2);
		sampleFeed.viewTopic(1);
		
		System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!");
	}

}
