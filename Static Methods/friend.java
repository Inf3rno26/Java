public class friend {
    String name;
    static int numOfFriends;

    friend(String name){
        this.name = name;
        numOfFriends++;
        
    }

    static void showFriend(){
        System.out.println("You have " + numOfFriends + " no of friends.");
    }

    public static void main(String[] args) {
        friend f1 = new friend("Vishad");
        friend f2 = new friend("Mihir");
        friend f3 = new friend("Jay");

        // System.out.println(friend.numOfFriends);
        friend.showFriend();
    }
}
