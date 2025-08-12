//public class Myapp {
//
//    public int addMe(int a, int b) {
//        return a + b;
//    }
//    public int subMe(int a, int b) {
//        return a - b;
//    }
//    public int mulMe(int a, int b) {
//        return a * b;
//    }
//    public int divMe(int a, int b) {
//        return a / b;
//    }
//
//
//}
public class Myapp {
    public static void main(String[] args) {
        Myapp app = new Myapp();
        System.out.println("2 + 3 = " + app.addMe(2, 3));
    }

    public int addMe(int a, int b) { return a + b; }
    public int subMe(int a, int b) { return a - b; }
    public int mulMe(int a, int b) { return a * b; }
    public int divMe(int a, int b) { return a / b; }
}
