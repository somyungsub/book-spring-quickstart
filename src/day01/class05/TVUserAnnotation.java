package day01.class05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUserAnnotation {
    public static void main(String[] args) {
        AbstractApplicationContext context = new GenericXmlApplicationContext("day01/class05/applicationContext_annotation.xml");
        TV tv = (TV) context.getBean("LgTV");
//        TV tv = (TV) context.getBean("tv"); // 에러
        tv.powerOn();
        tv.powerOff();
        tv.volumeUp();
        tv.volumeDown();
        context.close();
    }
}
