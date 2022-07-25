package jeongseok.practice;





enum Transportation{

    BUS(1000)  //BUS 상수
            {         // calcuCost 추상 메소드 재정의
        @Override
        int calcuCost(int distance) {
            return distance * basicCost; }},

    TAXI(2000) //TAXI 상수
            {       // calcuCost 추상 메소드 재정의
        @Override
        int calcuCost(int distance) {
            return distance * basicCost;
        }},

    AIRPLANE(40000) //AIRPLANE 상수
            {       // calcuCost 추상 메소드 재정의
        @Override
        int calcuCost(int distance) {
            return (distance * basicCost) * 2;
        }};

    protected final int basicCost; //protected로 해야 각 상수에서 접근 가능

    Transportation(int basicCost) {
        this.basicCost = basicCost;
    }

    abstract int calcuCost(int basicCost); //추상 메소드 선언

}

public class EnumPractice2 {
    public static void main(String[] args) {
        Transportation transportation = Transportation.AIRPLANE;

        System.out.println(transportation.calcuCost(2)); // 재정의된 calcuCost 호출
    }
}
