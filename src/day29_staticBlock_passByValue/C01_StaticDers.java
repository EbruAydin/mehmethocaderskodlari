package day29_staticBlock_passByValue;

public class C01_StaticDers {

    String okulIsmi="Yildiz koleji";
    static String okulTel="12345678";

    public static void staticMethid(){
        System.out.println("Static method calisti.");

    }

    public void staticOlmayanMethod() {
        System.out.println("Sadece static olmayan method calisti.");
    }
}
