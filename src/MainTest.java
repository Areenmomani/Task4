public class MainTest {
    public static void main(String [] args) throws CloneNotSupportedException ,Eception2 ,Exception1
    {try {
        Employee e1 = new Employee("ahmad", 22, "se", "java developer",
                "from amman", "114815", 6000);
        Employee e2 = (Employee) e1.clone();
        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        Employee e3 = new Employee("mohammad", 25, "ce", "java developer",
                "from amman", "114415", 700);
        System.out.println(e1.equals(e3));
        e3.calculateTax();

        //equality of references
        e3 = e1;
        System.out.println(e1.equals(e3));
        System.out.println(e1.hashCode());
        System.out.println(e3.hashCode());
        System.out.println(e3.toString());
        e1.calculateTax();
        e1.calculateSIN();
        Employee e4 = new Employee();
        e4.calculateSIN();
    }
    catch (Eception2 e)
    {
        System.out.println(e.getMessage());
    }
    catch (Exception e)
    {
        System.out.println(e.getMessage());
    } catch (Exception1 exception1) {
        System.out.println( exception1.getMessage());
    }


    }
}
