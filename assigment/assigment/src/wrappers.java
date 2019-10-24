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





    }
}
