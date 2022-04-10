class Converter
{
    static String decTo(int num, int base)
    {
        int rem = -1;
        int div = -1;

        int order = 1;
        int answer = 0;

        StringBuilder out = new StringBuilder();

        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while(true)
        {
            rem = num % base;
            out.append(hex[rem]);

            num = num / base;
            if(num == 0){ break; }
        }

        return out.reverse().toString();
    }


    static int toDec(String val, int base)
    {
        int ret = 0;
        int p = val.length()-1;

        for(int i = 0; i < val.length(); ++i){
            ret += (val.charAt(i) - '0') * Math.pow(base, p); // subtract ascii code for 0 (48) from any number character to get integer value
            --p;
        }

        return ret;
    }
}
