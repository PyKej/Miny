package herny.plan;

public class HraciePole {
    private int velkostX;
    private int velkostY;
    private int pocetMin;
    private String[][] hraciaPlocha;

    public HraciePole(int velkostX, int velkostY, int pocetMin) {
        this.velkostX = velkostX;
        this.velkostY = velkostY;
        this.pocetMin = pocetMin;


    }

    public int getVelkostX() {
        return velkostX;
    }

    public int getVelkostY() {
        return velkostY;
    }

    public int getPocetMin() {
        return pocetMin;
    }

    public void generateVisualOfGame(){
        hraciaPlocha = new String[velkostX][velkostY];

        // naplnenie hracej plochy nulami
        for (int i = 0; i < velkostX; i++) {
            for (int j = 0; j < velkostY; j++) {
                hraciaPlocha[i][j] = "x";
            }
        }

        for (int i = 0; i < hraciaPlocha.length; i++) {
            for (int j = 0; j < hraciaPlocha[i].length; j++) {
                System.out.print(hraciaPlocha[i][j] + " ");
            }
            System.out.println(); // Move to next line after printing each row
        }

        System.out.println("");
    }




}
