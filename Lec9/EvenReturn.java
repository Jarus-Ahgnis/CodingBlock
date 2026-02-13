class EvenReturn {

    int printEven() {
        for(int i = 2; i <= 10000; i += 2)
            System.out.println(i);
        return 0;
    }

    public static void main(String[] args) {
        EvenReturn obj = new EvenReturn();
        obj.printEven();
    }
}
