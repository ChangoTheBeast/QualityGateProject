package com.sparta.reece;

public abstract class Phone {

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    private String number;
    private String sim;
    private String processor;

    public void call(Phone phone) {
        if (!phone.getNumber().equals(this.number)) {
            Printer.print("Connected to phone: " + phone.getNumber());
        }
    }
}
