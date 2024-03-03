// Driver Class
class Main {
    public static void main(String args[]) {
        Singleton e = Singleton.getInstance();
        Singleton d = Singleton.getInstance();
        e.y = e.y + 48;
        System.out.println("Value of e.y = " + e.y);
        System.out.println("Value of d.y = " + d.y);
    }
}
