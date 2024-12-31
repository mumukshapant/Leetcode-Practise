class Tweet implements Comparable<Tweet>{

    int tweetid;
    int time;

    public Tweet(int tweetid, int time) {
        this.tweetid = tweetid;
        this.time = time;
    }

    public int compareTo(Tweet that) {
        return that.time - this.time;
    }
}

class User {
    int uid;
    Set<Integer> follower;
    List<Tweet> listoftweet;

    public User(int uid) {
        this.uid = uid;
        follower = new HashSet<>();
        listoftweet = new LinkedList<>();

    }

    public void addTweet(Tweet t ){
    // add tweet "t" to the list of tweets "listoftweet" created inside User class
    listoftweet.add(t); 
    }

    public void removeTweet(Tweet t){
        listoftweet.remove(t); 
    }

    public void addFollower(int fid){
        follower.add(fid); 
    }

    public void removeFollower(int fid){
        follower.remove(fid); 
    }
}

class Twitter {
    int time; 
    Map<Integer, User> usermap;


    public Twitter() {
        time = 0;
        usermap = new HashMap<>(); 
    }

    public void postTweet(int uid, int tid) {

        time++;
        if (!usermap.containsKey(uid)) {
            usermap.put(uid, new User(uid));
        }

        User user = usermap.get(uid);
        user.addTweet(new Tweet(tid, time)); // Tweet t -- time, tid;}

    }

    public List<Integer> getNewsFeed(int uid) {
        /**
        1. 10 most recent tweets
        2. self + followers
        3. ordered most recent to least recent
         */

        if(!usermap.containsKey(uid) ) {
            return new ArrayList<>(); 
          }
        
        PriorityQueue<Tweet> pq = new PriorityQueue<>(); // pq of TWEET
        User user = usermap.get(uid);
       
       

        //tweets of followers
        for(int fid: user.follower){
            int count=0;
        for(Tweet t: usermap.get(fid).listoftweet){
            pq.offer(t); 

            // IF WE DONT Create Comparable interface ----- the pq expects the elements being added to implement the Comparable interface. However, your Tweet class does not implement Comparable, resulting in a ClassCastException. 
            // you need to ensure that your Tweet class implements the Comparable interface and provides an implementation for the compareTo method. 



            count++; 
            if(count>10)
                break;
            
        }
    }

     //self 
        int count=0; 
        for(Tweet t : user.listoftweet){
            pq.offer(t); 
            count++; 

            if(count>10) 
                break; 

        }


        List<Integer> res= new ArrayList<>(); 

        int i=0; 
        while(!pq.isEmpty() && i<10){
            Tweet t = pq.poll(); 
            res.add(t.tweetid); 
            i++; 
        
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

        User user = usermap.get(followerId);
        user.removeFollower(followeeId);
        
    }
    
}
