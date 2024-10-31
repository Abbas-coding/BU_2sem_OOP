package account;

public class Member {
    private String memberName;
    private String memberEmail;
    private String memberContact;

    public Member(String mName, String mEmail, String mContact){
        this.memberName = mName;
        this.memberEmail = mEmail;
        this.memberContact = mContact;
    }

    public String getMemberContact() {
        return memberContact;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public String getMemberName() {
        return memberName;
    }
}
