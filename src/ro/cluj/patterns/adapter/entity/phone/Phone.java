package ro.cluj.patterns.adapter.entity.phone;

import ro.cluj.patterns.adapter.entity.phoneAccessories.PhoneCharger;
import ro.cluj.patterns.adapter.entity.Port;

public class Phone {
    private PhoneBrand brand;
    private Port port;
    private PhoneCharger phoneCharger;

    public PhoneBrand getBrand() {
        return brand;
    }

    public void setBrand(PhoneBrand brand) {
        this.brand = brand;
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }

    public PhoneCharger getPhoneCharger() {
        return phoneCharger;
    }

    public void setPhoneCharger(PhoneCharger phoneCharger) {
        this.phoneCharger = phoneCharger;
    }
}
