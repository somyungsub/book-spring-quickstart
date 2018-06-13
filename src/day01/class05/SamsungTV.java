package day01.class05;

import org.springframework.stereotype.Component;

@Component("SamsungTV")
public class SamsungTV implements TV {

    private Speaker speaker;
    private int price;
    private int pricee;

    /*
        생성자 인젝션 연습
     */
    public SamsungTV() {
        System.out.println(" ===> day01.class03.SamsungTV(1) 객체 생성");
    }

    public SamsungTV(Speaker speaker) {
        System.out.println(" ===> day01.class03.SamsungTV(2) 객체 생성");
        this.speaker = speaker;
    }

    public SamsungTV(Speaker speaker, int price) {
        System.out.println(" ===> day01.class03.SamsungTV(3) 객체 생성");
        this.speaker = speaker;
        this.price = price;
    }

    /*
        Setter 인젝션 연습
     */

    public void setSpeaker(Speaker speaker) {
        System.out.println("===> setSpeaker()호출");
        this.speaker = speaker;
    }

    public void setPrice(int price) {
        System.out.println("===> setPrice()호출");
        this.price = price;
    }
    public void setPrice22(int price) {
        System.out.println("===> setPrice22()호출");
        this.pricee = price;
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
        System.out.println("가격 : " + price);
        System.out.println("가격2 : " + pricee);
    }

    @Override
    public void powerOff() {
        System.out.println("day01.class03.SamsungTV --- 전원 끈다.");
    }

    @Override
    public void volumeUp() {
        System.out.println("day01.class03.SamsungTV --- 소리 올린다.");
        speaker.volumeUp();
    }

    @Override
    public void volumeDown() {
        System.out.println("day01.class03.SamsungTV --- 소리 내린다.");
        speaker.volumeDown();
    }
}
