package Oefeningen.Oefening1;

public class PersoonApp {
    public static void main(String[] args) {
        oefeningen.oefening1.Persoon bram = new oefeningen.oefening1.Persoon();
        String[] voornamen = {"Bram", "Steve", "Sander"};
        bram.voegVoornamenToe(voornamen);
        bram.setNaam("Blockken");
        bram.setGewicht(100);
        bram.setGeboortejaar("06/07/2000");
        bram.setLengte(1.81);
        System.out.printf("BMI: %.2f%n", bram.berekenBmi());
        System.out.printf("Omschrijving: %s%n", bram.geefOmschrijving());
        System.out.println(bram.toString());
    }
}
