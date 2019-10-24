public class wrappers {
    public static void main (String [] args)
    {
        Integer i = new Integer(682);
        //we can assign wrappers to primitive
        //Unboxing
        int j=i;
        //Autoboxing
        i=i*j+2;
        System.out.println("The Integer wrapper i value is "+i);
        System.out.println("The Integer primitive j value is "+j);
        Double d = new Double(2.33);
        //can get value from wrappers by doubleValue method
        double e=d.doubleValue();
        System.out.println("The double primitive e value is "+e);

        Boolean b = new Boolean(false);
        boolean b2 = b.booleanValue();
        String str1 = Boolean.toString(b2);
        String str2 = b.toString();

        // wrappers have methods.
        String s = i.toString();
        System.out.println("The string s is= "+s);
        char ch = 'a';
        // Autoboxing primitive to Character
        Character a = ch;
        byte b1 = 4;
        // wrapping around Byte object
        Byte b3 = new Byte(b1);
        System.out.println("The wrapper b2 value is  "+b2);
        // wrapping around Float object
        float f1 = 18.6f;
        Float f2 =new Float(f1);
        System.out.println("The wrapper f2 value is  "+f2);
        long l = 55;
        //can get value from primitive by ValueOf method
        Long l2 = Long.valueOf(l);
        System.out.println(l2);
        short sh = 79;
        String str3 = "5";
        short sh2 = Short.parseShort(str3);



    }
}
