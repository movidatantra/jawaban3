import java.util.ArrayList;

public class UAS1E {
    public void ShowPost(UAS1E profile) {
    }

    private String UserID;
    private String UserName;
    private ArrayList<String> MY_MESSAGES;

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public ArrayList<String> getMY_MESSAGES() {
        return MY_MESSAGES;
    }

    public void setMY_MESSAGES(ArrayList<String> MY_MESSAGES) {
        this.MY_MESSAGES = MY_MESSAGES;
    }

    public UAS1E(String ID, String usr, ArrayList<String> MY_MESSAGES) {
        this.UserID = ID;
        this.UserName = usr;
        this.ShowPost(UAS1E)= MY_MESSAGES;
    }

    public static void main(String[] args) {
        UAS1E social= new UAS1E();
        social.setUserID("001");
        social.setUserName("@whitehat");


        ArrayList<String> messages = new ArrayList<>();
        messages.add("What's your name?");
        messages.add("How are you?");
        messages.add("where do you come from?");


    }
}

