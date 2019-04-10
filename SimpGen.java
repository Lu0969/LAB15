public class SimpGen {

    public  void simpgen(){
            TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(5, "Обобщение");
            tgObj.showTypes();
            int v = tgObj.getOb1();
            System.out.println("Значение: " + v);
            String str = tgObj.getOb2();
            System.out.println("Значение: " + str);


    }
}
