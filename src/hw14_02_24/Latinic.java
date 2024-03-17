package hw14_02_24;

public class Latinic extends Alphabet {
    String[] latAlf = new String[]{"d","f","g"};
    @Override
    public void printAlphabet() {
     this.setName("Latinic");
        super.printAlphabet();
        for (int nr = 0 ; nr < latAlf.length ; nr++ ){
            System.out.println(latAlf[nr]);
        }
       // for (String al: latAlf ){
        //  System.out.println(al);
        //}
    }


}
