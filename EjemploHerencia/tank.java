public class tank extends vehicle {
    public void shoot(){
        System.out.println("Shooting");
    }
    public static void main(String[] args) {
        tank tanque=new tank();
        tanque.move();
        tanque.shoot();
    }
}
