package jeongseok.practice;

enum Transportation{

    BUS(1000) {
        @Override
        int calcuCost(int distance) {


            return distance * basicCost;
        }
    },
    TAXI(2000){
        @Override
        int calcuCost(int distance) {
            return distance * basicCost;
        }
    },
    AIRPLAINE(40000){
        @Override
        int calcuCost(int distance) {
            return (distance * basicCost) * 2;
        }
    };

    protected final int basicCost; //protected로 해야 각 상수에서 접근 가능


    Transportation(int basicCost) {
        this.basicCost = basicCost;
    }

    abstract int calcuCost(int basicCost);

}

public class EnumPractice2 {
    public static void main(String[] args) {
        Transportation transportation = Transportation.AIRPLAINE;

        System.out.println(transportation.calcuCost(2));
    }
}
