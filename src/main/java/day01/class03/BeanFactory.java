package day01.class03;

public class BeanFactory {
    public Object getBean(String beanName) {
        if ("samsung".equals(beanName)) {
            return new SamsungTV();
        } else if ("lg".equals(beanName)) {
            return new LgTV();
        } else {
            return null;
        }
    }
}
