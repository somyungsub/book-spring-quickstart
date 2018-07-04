package day01.class04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser_DI {
    public static void main(String[] args) {
        AbstractApplicationContext context = new GenericXmlApplicationContext("day01/class04/applicationContext_DI.xml");
        TV tv = (TV) context.getBean("tv");
        tv.powerOn();
        tv.powerOff();
        tv.volumeUp();
        tv.volumeDown();
        context.close();
    }
}
