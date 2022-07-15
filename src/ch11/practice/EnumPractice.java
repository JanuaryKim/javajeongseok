package ch11.practice;

enum User{

    GOLD(10,"골드"), SILVER(5,"실버"), BRONZE(3,"브론즈"), GUEST(0,"손님");

    int code;
    String krGrade;

    User(int code, String krGrade) {
        this.code = code;
        this.krGrade = krGrade;
    }

    public int getCode(){
        return this.code;
    }

    public String getKrGrade() {
        return krGrade;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setKrGrade(String krGrade) {
        this.krGrade = krGrade;
    }
}

public class EnumPractice {
    public static void main(String[] args) {

        User user1 = User.GOLD;
        User user2 = User.GUEST;

        if(user1.code > user2.code)
        {
            System.out.println("user1이 더 높은 회원입니다");
        }
    }
}
