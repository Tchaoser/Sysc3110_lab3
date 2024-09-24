import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        if (buddy != null) {
            buddies.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("tom", "carleton", "613");
        AddressBook addressbook = new AddressBook();
        addressbook.addBuddy(buddy); //value of size = 0
        addressbook.removeBuddy(buddy);
        int men;
        //value of size after stepover is one
        //repository: https://github.com/Tchaoser/Sysc3110_lab3.git
        //change in code
        //chnage made in git
        //change made in branch
    }
}
