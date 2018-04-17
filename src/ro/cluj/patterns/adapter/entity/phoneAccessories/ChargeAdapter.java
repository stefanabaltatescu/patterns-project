package ro.cluj.patterns.adapter.entity.phoneAccessories;

import ro.cluj.patterns.adapter.entity.Port;

public class ChargeAdapter {
    private Port fromPort;
    private Port toPort;

    ChargeAdapter(Port fromPort, Port toPort) {
        this.fromPort = fromPort;
        this.toPort = toPort;
    }

    public Port getFromPort() {
        return fromPort;
    }

    public void setFromPort(Port fromPort) {
        this.fromPort = fromPort;
    }

    public Port getToPort() {
        return toPort;
    }

    public void setToPort(Port toPort) {
        this.toPort = toPort;
    }
}
