package day01.class03;

public class SamsungTV implements TV {


    public SamsungTV() {
        System.out.println(" ===> day01.class03.SamsungTV(1) 객체 생성");
    }




    // 초기화
    public void initMethod() {
        System.out.println("객체 초기화 작업처리...");
    }

    // 객체 삭제 전 처리
    public void destoryMethod() {
        System.out.println("객체 삭제 전에 해야할 작업 처리...");
    }

    @Override
    public void powerOn() {
        System.out.println("day01.class03.SamsungTV --- 전원 켠다.");
    }

    @Override
    public void powerOff() {
        System.out.println("day01.class03.SamsungTV --- 전원 끈다.");
    }

    @Override
    public void volumeUp() {
        System.out.println("day01.class03.SamsungTV --- 소리 올린다.");
    }

    @Override
    public void volumeDown() {
        System.out.println("day01.class03.SamsungTV --- 소리 내린다.");
    }
}
