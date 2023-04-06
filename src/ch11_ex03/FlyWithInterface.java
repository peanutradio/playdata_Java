package ch11_ex03;

interface Flyable {
    void fly(); // public 추상메서드
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("[새]가 날개를 퍼덕이며 날아갑니다!");
    }
}

class Helicopter implements Flyable {
    public void fly() {
        System.out.println("[헬기]가 프로펠러를 돌리며 날아갑니다.");
    }
}

class Rocket implements Flyable {
    public void fly() {
        System.out.println("[로켓]이 불꽃을 뿜으며 날아갑니다!");
    }
}

public class FlyWithInterface {

    public static void main(String[] args) { //객체 생
        Bird b = new Bird();
        Helicopter h = new Helicopter();
        Rocket r = new Rocket();

        Flyable[] arr = {b, h, r}; // 상위 인터페이스 타입으로 배열화.
        for (int i = 0; i < arr.length; i++) {
            arr[i].fly(); // 인터페이스를 통한 메소드 오버라이딩.
        }
    }
}
