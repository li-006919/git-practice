package SMSTest;

public class User {
    private String UserName;
    private String PassWard;
    private String idCard;
    private String PhoneNum;

    public User() {
    }

    public User(String userName, String passWard, String idCard, String phoneNum) {
        UserName = userName;
        PassWard = passWard;
        this.idCard = idCard;
        PhoneNum = phoneNum;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWard() {
        return PassWard;
    }

    public void setPassWard(String passWard) {
        PassWard = passWard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNum() {
        return PhoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        PhoneNum = phoneNum;
    }
}
