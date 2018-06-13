package day01.class04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Properties;

public class CollectionBeanClient {
    public static void main(String[] args) {
        AbstractApplicationContext context = new GenericXmlApplicationContext("class04/applicationContext_Collection.xml");
        CollectionBean collectionBean = (CollectionBean) context.getBean("collectionBean");
//        List<String> addressList = collectionBean.getAddressList();
//        for (String address : addressList) {
//            System.out.println(address);
//        }
//        Set<String> addressSet = collectionBean.getAddressSet();
//        for (String address : addressSet) {
//            System.out.println(address);
//        }
//        Map<String, String> map = collectionBean.getMap();
//        for (Map.Entry<String, String> entry: map.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
        Properties properties = collectionBean.getProperties();
        System.out.println(properties);

    }

}
