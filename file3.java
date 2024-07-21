public class file3 {
    public static void main(String[] args) {
        // byte: 1 byte, stores whole numbers from -128 to 127
        byte byteValue = 100;
        System.out.println("Byte value: " + byteValue);

        // short: 2 bytes, stores whole numbers from -32,768 to 32,767
        short shortValue = 10000;
        System.out.println("Short value: " + shortValue);

        // int: 4 bytes, stores whole numbers from -2,147,483,648 to 2,147,483,647
        int intValue = 100000;
        System.out.println("Int value: " + intValue);

        // long: 8 bytes, stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long longValue = 1000000000L;
        System.out.println("Long value: " + longValue);

        // float: 4 bytes, stores fractional numbers, sufficient for storing 6 to 7 decimal digits
        float floatValue = 10.1234567F;
        System.out.println("Float value: " + floatValue);

        // double: 8 bytes, stores fractional numbers, sufficient for storing 15 decimal digits
        double doubleValue = 10.123456789012345;
        System.out.println("Double value: " + doubleValue);

        // boolean: 1 bit, stores true or false values
        boolean booleanValue = true;
        System.out.println("Boolean value: " + booleanValue);

        // char: 2 bytes, stores a single character/letter or ASCII values
        char charValue = 'A';
        System.out.println("Char value: " + charValue);
    }
}

