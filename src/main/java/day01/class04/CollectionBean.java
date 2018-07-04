package day01.class04;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
    private List<String> addressList;
    private Set<String> addressSet;
    private Map<String, String> map;
    private Properties properties;


    // List
    public void setAddressList(List<String> addressList) {
        this.addressList = addressList;
    }

    public List<String> getAddressList() {
        return addressList;
    }

    // Set
    public Set<String> getAddressSet() {
        return addressSet;
    }

    public void setAddressSet(Set<String> addressSet) {
        this.addressSet = addressSet;
    }

    // Map
    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    // Properties

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
