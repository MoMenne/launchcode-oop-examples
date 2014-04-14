package com.launchcode;

/**
 * User: mpmenne
 * Date: 4/13/14
 * Time: 8:50 PM
 */

/**
 *
 * There are three principles to Object Oriented Programming:
 * P        polymorphism
 * I        inheritance
 * E        encapsulation
 *
 * These principles are the primary ways Object Oriented Design differentiates
 *  itself from procedural programming
 *
 * The purpose behind these principles and Object Oriented Programming
 *  on the whole is to reduce duplication and coupling with in an application
 * STAY DRY!!!!  (do not repeat yourself)
 *
 * EncapsulationGood keeps implementation details private; exposing only what is needed.
 *
 * Inheritance reduces duplication having shared methods between a parent and child class.
 *
 * Polymorphism allows an object to appear as more than one class.  This can be done
 *  using both inheritance as well as interfaces.
 *
 */

public class InheritancePolymorphismExample {

    /**
     * Inheritance shares allows shared methods between a parent and child class.
     * For example, if you declare a method in a parent class,
     *  that method does not have to be declared again in a child class.
     *
     * Polymorphism lets an object be used as multiple types.
     * For example, since a child object can do everything that a parent
     *  object can do, we can declare the type of the child object as either
     *  the class of the child object OR the class of the parent object.
     *
     * This can also be accomplished through the use of interfaces.
     *  An object can be declared the type of any interface that is implemented.
     *
     */

    public static void main(String[] varArgs) {
//        Phone phone = new Phone();
//        phone.dial("1800 Dominoes");

//        CellPhone cellPhone = new CellPhone();
//        cellPhone.dial("314 111 1111");
//        cellPhone.sendTextMessage("314 111 1111", "Hey what are you up to tonight");

//        Computer computer = new Computer();
//        computer.sendEmail("info@launchcodestl.com", "Hey I'm all done with my final project");

//        SmartPhone smartPhone = new SmartPhone();
//        smartPhone.sendEmail("info@launchcode", "Hey!");

        // test out all of the phones!
//        System.out.println("Testing the phones");
//        Phone phone = new Phone();
//        CellPhone cellPhone = new CellPhone();
//        SmartPhone smartPhone = new SmartPhone();
//
//        Phone[] phones = {phone, cellPhone, smartPhone};
//        for (Phone testPhone : phones) {
//            testPhone.dial("1800 dominoes");
//        }

        // test out the email
//        SmartPhone smartPhone = new SmartPhone();
//        Computer computer = new Computer();
//        EmailReadyDevice[] testDevices = {computer, smartPhone};
//        for (EmailReadyDevice testDevice : testDevices) {
//            testDevice.sendEmail("info@launchcode", "Test Emails");
//        }


    }

    private static class Phone {
        private String currentPhoneNumber;

        public Phone() {
            System.out.println("Hey I'm a phone");
        }

        public void dial(String callingNumber) {
            String dialingMessage = String.format("Dialing %s", callingNumber);
            System.out.println(dialingMessage);
        }
    }

    private static class CellPhone extends Phone {
        public CellPhone() {
            System.out.println("and a cell phone!");
        }

        public void sendTextMessage(String number, String message) {
            System.out.println(String.format("Sending %s to %s", number, message));
        }
    }

    private static interface EmailReadyDevice {
        public void sendEmail (String emailAddress, String message);
    }

    private static class Computer implements EmailReadyDevice {
        public Computer() {
            System.out.println("Hello.  I am a computer");
        }
        public void sendEmail (String emailAddress, String message) {
            System.out.println(String.format("Sending an email to %s ... %s", emailAddress, message));
        }
    }

    private static class SmartPhone extends CellPhone implements EmailReadyDevice {
        public SmartPhone() {
            System.out.println("and a smart phone");
        }

        public void sendEmail(String emailAddress, String message) {
            System.out.println(String.format("%s ... %s -sent from my iPhone", emailAddress, message));
        }
    }

}
