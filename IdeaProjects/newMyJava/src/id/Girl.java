package id;

public class Girl {
    BoyFriend boyFriend;

    public Girl(BoyFriend boyFriend) {
        this.boyFriend = boyFriend;
    }

    public void spend(){
        System.out.println("My boyfriend spends");
    }

    public void care(){
        System.out.println("My boyfriend cares so much");
    }


    public  void setBoyFriend(BoyFriend boyFriend) {
        this.boyFriend = boyFriend;
    }

    public BoyFriend getBoyFriend() {
        return boyFriend;
    }
}
