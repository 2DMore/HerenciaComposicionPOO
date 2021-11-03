public class cannon implements shooter{
    public void shoot(){
        System.out.println("Cannon shoot");
    }
    public static void main(String[] args) {
        cannon canon=new cannon();
        canon.shoot();
    }
}