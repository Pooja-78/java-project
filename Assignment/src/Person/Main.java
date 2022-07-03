package Person;

import Person.Farmer;
import Person.WholeSaler;
public class Main {
    
    public static void main(String[] args)  {

        WholeSaler wholeSaler1 = new WholeSaler("Pooja",(long) 701965172);

        Farmer f1 = new Farmer("ramya", (long) 938003198);
        Farmer f2 = new Farmer("rakshitha", (long) 761950153);
        Farmer f3 = new Farmer("rani", (long) 123456783);
        Farmer f4 = new Farmer("pavitra", (long) 67564334);
        Farmer f5 = new Farmer("nisarga", (long) 78954358);
        Farmer f6 = new Farmer("nikitha", (long) 67533899);
        try {
            wholeSaler1.addFarmer(f1);
            wholeSaler1.addFarmer(f2);
            wholeSaler1.addFarmer(f3);
            wholeSaler1.addFarmer(f4);
            wholeSaler1.addFarmer(f5);
            wholeSaler1.addFarmer(f6);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("You cannot add more than 5 farmers to the farmers list");
        }
        
        System.out.println();
        System.out.println("List of Farmers");
        System.out.println("-----------------------");
        for (Farmer f : wholeSaler1.farmers) {
            System.out.printf("\n name: %s,  contact number: %s", f.getName(), f.getContact());
        }

    }

}
