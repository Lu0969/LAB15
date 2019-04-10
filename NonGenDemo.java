public class NonGenDemo {
    public  void nongendemo() {
        NonGen iOb;

        iOb = new NonGen(88);
        int v = (Integer) iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        NonGen strOb = new NonGen("Тест без обобщений");
        strOb.showType();
        String str = (String) strOb.getOb();
        System.out.println("Значение: " + str);
/*
        // Этот код компилируется, но он принципиально неверный!
        iOb = strOb;
        v = (Integer) iOb.getOb(); //Ошибка во время выполнения*/
    }
}
