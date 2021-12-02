package Oefeningen.Oefening1;

public class Persoon {
    private String voornaam;
    private String naam;
    private double lengte;
    private double gewicht;
    private String geboortejaar;

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void setGeboortejaar(String geboortejaar) {
        this.geboortejaar = geboortejaar;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getNaam() {
        return naam;
    }

    public double getLengte() {
        return lengte;
    }

    public double getGewicht() {
        return gewicht;
    }

    public String getGeboortejaar() {
        return geboortejaar;
    }

    public double berekenBmi(){
        return getGewicht() / (getLengte() * getLengte());
    }

    public String geefOmschrijving(){
        if (berekenBmi() < 18){
            return "Ondergewicht";
        }else if (berekenBmi() < 25){
            return "Normaal";
        }else if (berekenBmi() < 30){
            return "Overgewicht";
        }else if (berekenBmi() < 40){
            return "Obesitas";
        }else{
            return "Morbide obesitas";
        }
    }

    public void voegVoornamenToe(String[] voornamen){
        for (String naam : voornamen){
            voornaam += naam + " ";
        }
    }

    @Override
    public String toString() {
        return "Deze persoon is " + voornaam + " " + naam + "%n" +
                "Gewicht %15: " + gewicht + "%n" +
                "Lengte %15: " + lengte + "/n" +
                "geboortejaar %15" + geboortejaar;
    }
}
