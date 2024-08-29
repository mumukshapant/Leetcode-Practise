// ref : https://www.youtube.com/watch?v=tH051S6aM5M

//represents 1 tweet 
class Tweet implements Comparable<Tweet> {

    // ek tweet ke pass kya kya hoga -- time,
    int time;
    int tweetId;

    Tweet(int t, int id) {
        time = t;
        tweetId=id;
    }

    public int compareTo(Tweet that) {
        return that.time - this.time;
    }
}

class User {
    int userId;

    Set<Integer> followers;
    List<Tweet> tweets;

    User(int userId) {
        this.userId = userId;
        followers = new HashSet<>();
        tweets = new LinkedList<>();

    }

    public void addTweet(Tweet t) {
        tweets.add(t); // insertion at the end
    }

    public void addFollower(int followeeId) {
        followers.add(followeeId);
    }

    public void removeFollower(int followeeId) {
        followers.remove(followeeId);
    }
}

class Twitter {

    Map<Integer, User> usermap;
    int timecounter;

    public Twitter() {

        usermap = new HashMap<>();
        timecounter = 0;

    }

    public void postTweet(int userId, int tweetId) {

        timecounter++;

        if (!usermap.containsKey(userId)) {
            usermap.put(userId, new User(userId));
        }
        User user = usermap.get(userId);
        user.addTweet(new Tweet(timecounter, tweetId));

    }

    public List<Integer> getNewsFeed(int userId) {

          if(!usermap.containsKey(userId) ) {
            return new ArrayList<>(); 
          }

          PriorityQueue<Tweet> pq= new PriorityQueue<>(); 

          User user= usermap.get(userId); 

          //followers tweets
          for(int followerId: user.followers){
            
            int count=0; 

            for(Tweet t: usermap.get(followerId).tweets){

                pq.offer(t); 
                count++; 
                if(count>10)
                    break; 

            }
          }

          //self tweets
  
int count=0; 
            for(Tweet t: user.tweets){

                pq.offer(t); 
                count++; 
                if(count>10)
                    break; 

            }
          
          List<Integer> res= new ArrayList<>(); 
          int index=0; 
          while(!pq.isEmpty() && index<10){

            Tweet tweet= pq.poll(); 
            res.add(tweet.tweetId); 
            index++; 

          }

return res; 
        

    }

    public void follow(int followerId, int followeeId) {

        if (!usermap.containsKey(followerId)) {
            usermap.put(followerId, new User(followerId));
        }

        if (!usermap.containsKey(followeeId)) {
            usermap.put(followeeId, new User(followeeId));
        }

        User user = usermap.get(followerId);
        user.addFollower(followeeId);

    }

    public void unfollow(int followerId, int followeeId) {

         if(!usermap.containsKey(followerId) || !usermap.containsKey(followeeId) )
            return ; 

        User user= usermap.get(followerId); 
        user.removeFollower(followeeId); 

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