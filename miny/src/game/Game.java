package game;

import herny.plan.HraciePole;

import java.util.Objects;

import static utility.ZKlavesnice.readInt;
import static utility.ZKlavesnice.readString;

public class Game {
    private String meno;
    private HraciePole hraciePole;

    public Game(){
        getInfoGame();

        hraciePole.generateVisualOfGame();
    }


    public void getInfoGame(){
//        this.meno = readString("Napíšte Váše meno:");
        setMeno();


        hraciePole = new HraciePole(    readInt("Napis pocet riadkov (velkost hracej plochy y):"),
                                        readInt("Napis pocet stlpcov (velkost hracej plochy x):"),
                                        readInt("Napis pocet min v hre:"));

    }

    public void setMeno(){
        this.meno = readString("Napíšte Váše meno:");

        System.out.println("Nice!");
        System.out.println("Zvladol si tuto komplikovanú ulohu ty retard!");
        System.out.println("Ešte raz si skontroluj svoje meno či je správne: " + meno);
        String odpovedMena = readString("Cheš si zmeniť svoje meno? Ak áno napíš: 'ano'");
        if(Objects.equals(odpovedMena, "ano")){
            this.meno = readString("Napíšte Váše meno:");
            System.out.println("Tvoje meno je zmenené na: " + this.meno);
        }
        else{
            System.out.println("Skvele zvládol si to");
        }

    }
}
