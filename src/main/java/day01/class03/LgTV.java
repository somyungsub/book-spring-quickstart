package day01.class03;

public class LgTV implements TV {
    @Override
    public void powerOn() {
        System.out.println("day01.class03.LgTV --- 전원 켠다.");
    }

    @Override
    public void powerOff() {
        System.out.println("day01.class03.LgTV --- 전원 끈다.");
    }

    @Override
    public void volumeUp() {
        System.out.println("day01.class03.LgTV --- 소리 올린다.");
    }

    @Override
    public void volumeDown() {
        System.out.println("day01.class03.LgTV --- 소리 내린다.");
    }
}

