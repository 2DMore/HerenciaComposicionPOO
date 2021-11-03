public class tank implements shooter, mover {
    public void shoot(){
        System.out.println("Tank shoot");
    }
    public void move(){
        System.out.println("Tank move");
    }
    public static void main(String[] args) {
        tank tanque=new tank();
        tanque.shoot();
        tanque.move();
    }
}
