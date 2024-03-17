package hw14_02_24;

public class Main {
    public static void main(String[] args) {
    Latinic lat = new Latinic() ;
    lat.printAlphabet();
    Kiirilic kiir = new Kiirilic();
    kiir.printAlphabet();
    Arabic arab = new Arabic();
    arab.printAlphabet();
    Alphabet[] alphabets = new Alphabet[]{lat,kiir,arab};
    printAllInfo(alphabets);
}
    public static void printAllInfo(Alphabet[] alphabets ){
        for (int nrAlf = 0 ; nrAlf < alphabets.length ; nrAlf++){
            alphabets[nrAlf].printAlphabet();
        }

    }
}
