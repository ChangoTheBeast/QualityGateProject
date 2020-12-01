package com.sparta.reece;

public class ApplePhone extends Phone{

    @Override
    public void call(Phone phone) {
        super.call(phone);
        if (!phone.getNumber().equals(this.getNumber())) {
            Printer.print("Connected On Apple phone");
        }

    }
}
