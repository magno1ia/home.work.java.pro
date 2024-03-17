package hw14_02_24;

public class Kiirilic extends Alphabet{
    String[] kirAlf = new String[]{"c","v","b","n"};
    @Override
    public void printAlphabet() {
        this.setName("Kiirilic");
        super.printAlphabet();
        for (int nr1 = 0 ; nr1 < kirAlf.length; nr1++){
            System.out.println(kirAlf[nr1]);
        }
    }

 }
