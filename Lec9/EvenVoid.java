class EvenVoid {

    // void function
    void printEven() {
        for(int i = 2; i <= 10000; i += 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        EvenVoid obj = new EvenVoid();
        obj.printEven();
    }
}
