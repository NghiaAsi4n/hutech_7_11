public class calculation {
    private int a;
    private int b;
    public calculation(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int sum(){
        return a + b;
    }
    public int minus(){
        return a - b;
    }

    public static void main(String[] args) {
        calculation cal = new calculation(5, 7);
        System.out.println(cal.sum());
    }
}
