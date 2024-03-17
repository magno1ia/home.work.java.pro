package hw14_02_24;

public class Arabic extends Alphabet {
    String[] arabAlf = new String[]{"r","t","z","u","i"};
    @Override
    public void printAlphabet() {
        this.setName("Arabic");
        super.printAlphabet();
        for (int nr2 = 0 ; nr2 < arabAlf.length ; nr2++){
            System.out.println(arabAlf[nr2]);
        }
    }


}
