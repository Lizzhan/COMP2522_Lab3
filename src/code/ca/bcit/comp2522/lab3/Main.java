package ca.bcit.comp2522.lab3;

public class Main {

    private static final int IPOD1_SONGS = 300;
    private static final int IPOD2_SONGS = 400;
    private static final int IPOD3_SONGS = 300;
    private static final double IPOD1_VOLUME = 80.0;
    private static final double IPOD2_VOLUME = 85.0;
    private static final double IPOD3_VOLUME = 70.0;

    private static final boolean IPAD1_HAS_CASE = true;
    private static final boolean IPAD2_HAS_CASE = false;
    private static final boolean IPAD3_HAS_CASE = true;
    private static final String IPAD1_OS = "iPadOS 15";
    private static final String IPAD2_OS = "iPadOS 14";
    private static final String IPAD3_OS = "iPadOS 15";

    private static final double IPHONE1_MINUTES = 120.0;
    private static final double IPHONE2_MINUTES = 180.0;
    private static final double IPHONE3_MINUTES = 120.0;
    private static final String IPHONE1_CARRIER = "Verizon";
    private static final String IPHONE2_CARRIER = "T-Mobile";
    private static final String IPHONE3_CARRIER = "AT&T";

    private static final double IPHONE16_MINUTES = 100.0;
    private static final String IPHONE16_CARRIER = "Verizon";
    private static final boolean IPHONE16_1_HIGH_RES = true;
    private static final boolean IPHONE16_2_HIGH_RES = true;
    private static final boolean IPHONE16_3_HIGH_RES = false;
    private static final int IPHONE16_1_STORAGE = 512;
    private static final int IPHONE16_2_STORAGE = 256;
    private static final int IPHONE16_3_STORAGE = 512;

    public static void main(final String[] args) {
        // Create IPod objects
        final IPod ipod1 = new IPod(IPOD1_SONGS,
                                    IPOD1_VOLUME);
        final IPod ipod2 = new IPod(IPOD2_SONGS,
                                    IPOD2_VOLUME);
        final IPod ipod3 = new IPod(IPOD3_SONGS,
                                    IPOD3_VOLUME);

        // Test equality and inequality for IPod
        System.out.println("IPod Equality Test:");
        System.out.println(ipod1.equals(ipod2) ? "INCORRECT: ipod1 should not be equal to ipod2" : "CORRECT: ipod1 is not equal to ipod2");
        System.out.println(ipod1.equals(ipod3) ? "CORRECT: ipod1 is equal to ipod3" : "INCORRECT: ipod1 should be equal to ipod3");
        System.out.println();

        // Create IPad objects
        final IPad ipad1 = new IPad(IPAD1_HAS_CASE,
                                    IPAD1_OS);
        final IPad ipad2 = new IPad(IPAD2_HAS_CASE,
                                    IPAD2_OS);
        final IPad ipad3 = new IPad(IPAD3_HAS_CASE,
                                    IPAD3_OS);

        // Test equality and inequality for IPad
        System.out.println("IPad Equality Test:");
        System.out.println(ipad1.equals(ipad2) ?
                           "INCORRECT: ipad1 should not be equal to ipad2" :
                           "CORRECT: ipad1 is not equal to ipad2");
        System.out.println(ipad1.equals(ipad3) ?
                           "CORRECT: ipad1 is equal to ipad3" :
                           "INCORRECT: ipad1 should be equal to ipad3");
        System.out.println();

        // Create IPhone objects
        final IPhone iphone1 = new IPhone(IPHONE1_MINUTES,
                                          IPHONE1_CARRIER);
        final IPhone iphone2 = new IPhone(IPHONE2_MINUTES,
                                          IPHONE2_CARRIER);
        final IPhone iphone3 = new IPhone(IPHONE3_MINUTES,
                                          IPHONE3_CARRIER);

        // Test equality and inequality for IPhone
        System.out.println("IPhone Equality Test:");
        System.out.println(iphone1.equals(iphone2) ?
                           "INCORRECT: iphone1 should not be equal to iphone2" :
                           "CORRECT: iphone1 is not equal to iphone2");
        System.out.println(iphone1.equals(iphone3) ?
                           "CORRECT: iphone1 is equal to iphone3" :
                           "INCORRECT: iphone1 should be equal to iphone3");
        System.out.println();

        // Create IPhone16 objects
        final IPhone16 iphone16_1 = new IPhone16(IPHONE16_MINUTES,
                                                 IPHONE16_CARRIER,
                                                 IPHONE16_1_HIGH_RES,
                                                 IPHONE16_1_STORAGE);
        final IPhone16 iphone16_2 = new IPhone16(IPHONE16_MINUTES,
                                                 IPHONE16_CARRIER,
                                                 IPHONE16_2_HIGH_RES,
                                                 IPHONE16_2_STORAGE);
        final IPhone16 iphone16_3 = new IPhone16(IPHONE16_MINUTES,
                                                 IPHONE16_CARRIER,
                                                 IPHONE16_3_HIGH_RES,
                                                 IPHONE16_3_STORAGE);

        // Test equality and inequality for IPhone16
        System.out.println("IPhone16 Equality Test:");
        System.out.println(iphone16_1.equals(iphone16_2) ?
                           "CORRECT: iphone16_1 is equal to iphone16_2" :
                           "INCORRECT: iphone16_1 should be equal to iphone16_2");
        System.out.println(iphone16_1.equals(iphone16_3) ?
                           "INCORRECT: iphone16_1 should not be equal to iphone16_3" :
                           "CORRECT: iphone16_1 is not equal to iphone16_3");
        System.out.println();
    }
}
