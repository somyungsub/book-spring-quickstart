package day01.class05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("LgTV")
public class LgTV implements TV {
//    @Qualifier("AppleSpeaker")
//    @Resource(name = "AppleSpeaker")    // 설정된 이름 기반
//    @Autowired    // 객체타입기반
    private Speaker speaker;
    public LgTV() {
    }


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
        speaker.volumeUp();
    }

    @Override
    public void volumeDown() {
        System.out.println("day01.class03.LgTV --- 소리 내린다.");
        speaker.volumeDown();
    }
}

