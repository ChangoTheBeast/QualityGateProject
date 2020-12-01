package com.sparta.reece;

public class Starter {
    public static void start() {
        ApplePhone applePhone = new ApplePhone();
        AndroidPhone androidPhone = new AndroidPhone();

        applePhone.setNumber("077313123");
        androidPhone.setNumber("0423424");

        androidPhone.call(applePhone);

        applePhone.call(androidPhone);

        androidPhone.call(androidPhone);
    }
}
