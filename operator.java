public class operator {
    public static void main(String[] args) {
        int a = 10 , b = 3;

        // operator aritmatika
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b) + "\n");

        //operator relasi
        System.out.println("a == b: " + (a==b));
        System.out.println("a > b: " + (a>b));
        System.out.println("a < b: " + (a<b) + "\n");

        //operator logika
        boolean x = true, y = false;
        System.out.println("x && y: " + (x&&y));
        System.out.println("x || y: " + (x||y));
        System.out.println("!x: " + (!x) + "\n");
    }
}
