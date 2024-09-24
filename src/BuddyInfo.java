public class BuddyInfo {

    //variables
    private String name;
    private String address;
    private String phoneNumber;


    //constructors
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber=phoneNumber;
    }
    //default constructor
    public BuddyInfo() {
        this("none", "none", "none");
    }



    //getters
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {

        BuddyInfo buddy = new BuddyInfo("bob", "elkin street", "744737737");
        System.out.println("Hello " + buddy.getName());
    }
}
