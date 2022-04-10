class TestConverter
{
    public static void testToHex()
    {
        int passed = 0;
        int failed = 0;

        String retVal = "";

        System.out.println("Testing conversion to HEX");

        for(int i = 0; i < 1000; ++i){
            retVal = Converter.decTo(i, 16);

            if(retVal.toLowerCase().equals(Integer.toHexString(i))){
                ++passed;
            } else {
                ++failed;
                System.out.println(i + " " + retVal + " should be " + Integer.toHexString(i));
            }
        }

        System.out.println("Tests passed: " + passed);
        System.out.println("Tests failed: " + failed);

    }

    public static void testToBinary()
    {
        int passed = 0;
        int failed = 0;

        String retVal = "";

        System.out.println("Testing conversion to BINARY");

        for(int i = 0; i < 1000; ++i){
            retVal = Converter.decTo(i, 2);

            if(retVal.toLowerCase().equals(Integer.toBinaryString(i))){
                ++passed;
            } else {
                ++failed;
                System.out.println(i + " " + retVal + " should be " + Integer.toBinaryString(i));
            }
        }

        System.out.println("Tests passed: " + passed);
        System.out.println("Tests failed: " + failed);
    }


    public static void testFromBinary()
    {
        int passed = 0;
        int failed = 0;

        int retVal = 0;

        System.out.println("Testing conversion from BINARY");

        for(int i = 0; i < 1000; ++i){
            retVal = Converter.toDec(Integer.toBinaryString(i), 2);

            if(retVal == i){
                ++passed;
            } else {
                ++failed;
                System.out.println("Case: " + i + "! Result: " + retVal + " should be " + i);
            }
        }

        System.out.println("Tests passed: " + passed);
        System.out.println("Tests failed: " + failed);
    }
}
