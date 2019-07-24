import java.util.Arrays;

public class NewsFeed {
  
  String[] topics;
  
  public NewsFeed(String[] initialTopics) {
		topics = initialTopics;
  }
  
  public static void main(String[] args) {
		NewsFeed feed;
    if (args[0].equals("Human")) {
      
      //topics for a Human feed:
      String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
			feed = new NewsFeed(humanTopics);
      
    } else if(args[0].equals("Robot")) {
      
      //topics for a Robot feed:
      String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
      feed = new NewsFeed(robotTopics);
      
    } else {
      String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
      feed = new NewsFeed(genericTopics);
    }
        
    System.out.println("The topics in this feed are:");
    System.out.println(Arrays.toString(feed.topics));
  }
}
