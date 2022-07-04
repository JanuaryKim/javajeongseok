package ch11.practice;

public class AnonymousClassPractice {
    public static void main(String[] args) {

        Rectangle a = new Rectangle();

        Shape anonymous = new Shape() {
            @Override
            public int get() {
                return 0;
            }
        };

        System.out.println(a.get());			// Shape 인터페이스를 구현한 Rectangle
        System.out.println(anonymous.get());	// Shape 인터페이스를 구현한 익명 객체
    }

}

class Rectangle implements Shape {
    int depth = 40;

    @Override
    public int get() {
        return width * height * depth;
    }
}

interface Shape {

    int width = 10;
    int height = 20;

    int get();
}