package ro.cluj.patterns.adapter.entity.phoneAccessories;

import ro.cluj.patterns.adapter.entity.phone.Phone;

public interface ChargePhone {
    void chargePhone(Phone phone, PhoneCharger phoneCharger);
}
