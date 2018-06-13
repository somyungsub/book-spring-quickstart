package day01.class03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
    public static void main(String[] args) {
        // Factory 클래스를 활용
//        day01.class03.TV tv = new day01.class03.SamsungTV();
        BeanFactory beanFactory = new BeanFactory();    // factory 패턴 적용
        TV tv = (TV) beanFactory.getBean(args[1]);      // 생성의 역할을 위임
        tv.powerOn();
        tv.powerOff();
        tv.volumeUp();
        tv.volumeDown();

        // Spring 컨테이너 이용하여 객체 생성
        AbstractApplicationContext context = new GenericXmlApplicationContext("day01/class03/applicationContext.xml");
        TV tv2 = (TV) context.getBean("tv");
        tv2.powerOn();
        tv2.powerOff();
        tv2.volumeUp();
        tv2.volumeDown();

        // 컨테이너 scope : 싱글톤 확인
        TV tv3 =(TV) context.getBean("tv");
        System.out.println(tv2 == tv3);

        // 컨테이너 scope : prototype 확인
        TV tv4 =(TV) context.getBean("tv2");
        TV tv5 =(TV) context.getBean("tv2");
        System.out.println(tv4 == tv5);

        // 컨테이너 종료
        context.close();
    }
}
