public class C2NrAdapter {
    private C3Nr c3Nr;

    public C2NrAdapter(int num1, int num2) {
        this.c3Nr = new C3Nr(num1, num2, 0);
    }

    public int sum() {
        return c3Nr.sum();
    }
}