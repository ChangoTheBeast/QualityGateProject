package com.sparta.reece;

public class AndroidPhone extends Phone {
    @Override
    public void call(Phone phone) {
        super.call(phone);
        if (!phone.getNumber().equals(this.getNumber())) {
            Printer.print("Connected on an android phone.");
        }
    }
}
