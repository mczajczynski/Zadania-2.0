public class Main {

    public static void main(String[] args) {

        Telefon t1= new Telefon("Nokia","Lumia",5,"Czarny");
        Telefon t2= new Telefon("Samsung","S6",6,"Biały");

//        t1.marka="Nokia";
//        t1.model="Lumia";
//        t1.iloscCali=5;
//        t1.kolor="Czarny";
//
//        t2.marka="Samsung";
//        t2.model="s6";
//        t2.iloscCali=6;
//        t2.kolor="Biały";

        System.out.println("Telefon 1: " + t1.marka + " " + t1.model + " " + t1.kolor + " ilość cali: " + t1.iloscCali );
        System.out.println("Telefon 2: " + t2.marka + " " + t2.model + " " + t2.kolor + " ilość cali: " + t2.iloscCali);




    }
}
