import java.util.*;

class ConverterCLI
{
    public static void runTest()
    {
        TestConverter.testToHex();
        TestConverter.testToBinary();
        TestConverter.testFromBinary();
    }

    public static void listCmds()
    {
        System.out.println("Enter cmd number to use desired converter");
        System.out.println("    [0]: Decimal to Hex");
        System.out.println("    [1]: Binary to Decimal");
        System.out.println("    [2]: Decimal to Binary");
        System.out.println("    [3]: Run tests");

        System.out.println("    [b]: Choose another converter");
        System.out.println("    [q]: Quit");
    }

    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);

        String cmd = "";
        String input = "";

        listCmds();

        while(true){
            try{
                switch (cmd)
                {
                    case "0" : {
                        while(true){
                            System.out.println("Input value to convert to HEX");
                            input = keyboard.next();
                            int num = Integer.parseInt(input);
                            System.out.println(num + " == 0x"+ Converter.decTo(num, 16));
                        }
                    }
                    case "1" : {
                        while(true){
                            System.out.println("Input value to convert binary to decimal");
                            input = keyboard.next();
                            if(!input.matches("[0-1]*")){throw (new NumberFormatException());}
                            System.out.println(input + " == "+ Converter.toDec(input, 2));
                        }

                    }
                    case "2" : {
                        while(true){
                            System.out.println("Input value to convert to binary");
                            input = keyboard.next();
                            int num = Integer.parseInt(input);
                            System.out.println(num + " == "+ Converter.decTo(num, 2));
                        }

                    }
                    case "3" : { runTest(); }

                    case "q" : { return; }
                }

                cmd = keyboard.next();

            } catch (NumberFormatException wrongNum){
                if(input.equals("b")){
                    cmd = "";
                    listCmds();
                } else { System.out.println("ERROR: Value out of range"); }
            }
        }
    }
}
