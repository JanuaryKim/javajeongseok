package jeongseok.practice;

enum User{

    GOLD(10,"골드"), SILVER(5,"실버"), BRONZE(3,"브론즈"), GUEST(0,"손님");

    private final int code;      //위에 괄호안에 있는 10, 5, 3, 0 이 할당될 변수
    private final String krGrade; //위에 괄호안에 있는 골드, 실버, 브론즈, 손님 이 할당될 변수

    User(int code, String krGrade) { //생성자, 암묵적으로 private이다. (외부에서 생성자를 호출할 수 없다)
        this.code = code;
        this.krGrade = krGrade;
    }

    public int getCode(){
        return this.code;
    } //getter
    public String getKrGrade() {
        return krGrade;
    } //getter

}

public class EnumPractice {
    public static void main(String[] args) {

        User user1 = User.GOLD;
        User user2 = User.GUEST;

        if(user1.getCode() > user2.getCode())
        {
            System.out.println("user1이 더 높은 회원입니다");
        }
    }
}
