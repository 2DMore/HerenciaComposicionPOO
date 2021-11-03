public class car implements mover {
    
    public void move(){
        System.out.println("Car moving");
    }
    public static void main(String[] args) {
        car carro=new car();
        carro.move();
    }
}
