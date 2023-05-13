public class Main {
    public static void main(String[] args) {
        C2Nr c2Nr = new C2Nr(2, 3);
        System.out.println("Sum of two numbers = " + c2Nr.sum());

        C3Nr c3Nr = new C3Nr(2, 3, 4);
        System.out.println("Sum of three numbers = " + c3Nr.sum());

        C2NrAdapter adapter = new C2NrAdapter(2, 3);
        System.out.println("Sum of two numbers using Adapter = " + adapter.sum());
    }
}