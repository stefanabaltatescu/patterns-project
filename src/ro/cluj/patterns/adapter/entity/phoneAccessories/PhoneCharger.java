package ro.cluj.patterns.adapter.entity.phoneAccessories;

import ro.cluj.patterns.adapter.entity.Port;
import ro.cluj.patterns.adapter.entity.phone.Phone;

public class PhoneCharger implements ChargePhone {
    private Port port;
    private ChargeAdapter chargeAdapter;

    @Override
    public void chargePhone(Phone phone, PhoneCharger phoneCharger) {
        if (phone.getPort() != phoneCharger.port) {
            chargeAdapter = new ChargeAdapter(phoneCharger.port, phone.getPort());
        }
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }

    public ChargeAdapter getChargeAdapter() {
        return chargeAdapter;
    }

    public void setChargeAdapter(ChargeAdapter chargeAdapter) {
        this.chargeAdapter = chargeAdapter;
    }
}