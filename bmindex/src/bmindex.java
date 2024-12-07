public class bmindex {

    public static void main(String[] args) {


        double vaha = 100;              //v kg, priklad: 100 kg
        double vyska = 1.9;             //v m, priklad: 1.9 m

        if ( vaha <= 0 &&  vyska <= 0) { System.out.println("Hodnota vahy aj vysky je neplatna"); return;}
        if ( vaha <= 0 ) { System.out.println("Hodnota vahy je neplatna"); return;}
        if ( vyska <= 0 ) { System.out.println("Hodnota vysky je neplatna"); return;}

        double bmi = (vaha / (Math.pow(vyska, 2)));

        System.out.print("Vas BMI je:   ");
        System.out.format("%.2f", bmi);System.out.println();
        System.out.print("Kategoria:    ");
        if ( bmi < 16.5 ) {System.out.println("Podvyziva");}
        if ( bmi >= 16.5 && bmi < 18.5) {System.out.println("Podvaha");}
        if ( bmi >= 18.5 && bmi < 25) {System.out.println("Zdrava vaha");}
        if ( bmi >= 25 && bmi < 30) {System.out.println("Nadvaha");}
        if ( bmi >= 30 && bmi < 35) {System.out.println("Obezita 1. st.");}
        if ( bmi >= 35 && bmi < 40) {System.out.println("Obezita 2. st.");}
        if ( bmi >= 40) {System.out.println("Obezita 3. st.");}


//https://github.com/1bd1/

    }
}
