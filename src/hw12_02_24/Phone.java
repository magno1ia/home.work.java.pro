package hw12_02_24;

public class Phone {
    int number;
    String model;
    double weight;

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Phone (int number, String model, double weight) {
       this.number = number;
       this.model = model;
       this.weight = weight;

   }
   public void receiveCall(String name){
       System.out.println("Звонит " + name) ;
   }
   public void getPhoneNumber(){
       System.out.println(this.number);
   }

    public static void main(String[] args) {
        Phone one = new Phone(24,"fg",1.3);
        Phone two = new Phone(13,"mk",1.2);
        Phone three = new Phone(26,"hj",1.4);
        System.out.println(one.getModel());
        System.out.println(two.getWeight());
        System.out.println(three.getNumber());
        System.out.println(one);
        one.getPhoneNumber();
        one.receiveCall("mark");

    }
}
