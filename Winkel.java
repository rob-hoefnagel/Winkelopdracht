//-         Maak een winkel. De winkel heeft een has-relatie met apparaten. Apparaat heeft een prijs.
//        - Iedere winkel heeft 1 apparaat.
//        - Elke winkel heeft de methode kopen.
//        -Met kopen mag je een bedrag meegeven
//        - Als het bedrag hoger is dan de prijs van het apparaat, dan krijg je het apparaat terug, anders krijg je null terug.
//        - Als je null terug krijgt zegt de winkel: “houd me niet voor de gek”

public class Winkel {
    public static void main(String[] args) {
        Winkeltje winkel1 = new Winkeltje();
        winkel1.mijnApparaat.prijs = 60;
        winkel1.kopen(60);
    }
}
class Winkeltje {
    Apparaat mijnApparaat = new Apparaat();
    void kopen(int prijs1){
        if(prijs1 >= mijnApparaat.prijs ){
            System.out.println("je mag het kopen");
        } else {
            System.out.println("houd me niet voor de gek");
        }
    }

}
class Apparaat {
    int prijs;

}