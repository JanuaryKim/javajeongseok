package jeongseok.practice;

class Driver {
    String name;

    public Driver(String name) {
        this.name = name;
    }
}

class Walker{
    String name;

    public Walker(String name) {
        this.name = name;
    }
}

class Car <T> {   //해당 T는 drive 메소드의 T와 전혀 관련이 없다.
    public <T extends Driver> void drive(T driver) {

        System.out.println(driver.name + " 운전사가 운전을 합니다~ ");
    }
}

public class GenericsMethodPractice {
    public static void main(String[] args) {
        Car car = new Car();

        car.drive(new Driver("제뉴어리맨"));
//        car.drive(new Walker("뚜벅이")); //제네릭스 메소드에 선언된 제네릭 제한에 맞지 않으므로 에러 발생


        int[] iArr = new int[]{1,2,3,4};


    }
}
