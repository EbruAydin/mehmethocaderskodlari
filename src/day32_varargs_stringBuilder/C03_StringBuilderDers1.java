package day32_varargs_stringBuilder;

public class C03_StringBuilderDers1 {
    public static void main(String[] args) {

        StringBuilder sbr1=new StringBuilder();
        StringBuilder sbr2=new StringBuilder("Java cok guzel");
        StringBuilder sbr3=new StringBuilder(10);


        System.out.println("sbr1 length : " + sbr1.length());//0
        System.out.println("sbr1 capacity : " + sbr1.capacity());//16 anladigim kadariyla bu standart bir kapasite

        System.out.println("sbr2 length : " + sbr2.length());//14
        System.out.println("sbr2 capacity : " + sbr2.capacity());//30

        System.out.println("sbr3 length : " + sbr3.length());//0
        System.out.println("sbr3 capacity : " + sbr3.capacity());//10

        //append methodu ile sbr1'e ekleme yapabiliriz

        sbr1.append("Java").append(" ").append("cok").append(" ").append("guzel");
        System.out.println("sbr1 length : " + sbr1.length());//14
        System.out.println("sbr1 capacity : " + sbr1.capacity());//16

        sbr1.append(3);
        System.out.println(sbr1);//Java cok guzel3
        sbr1.append(true);
        System.out.println(sbr1); //Java cok guzel3true
        System.out.println("sbr1 length : " + sbr1.length());//19
        System.out.println("sbr1 capacity : " + sbr1.capacity());//34

        sbr1.append("tum dersler java olsa");
        System.out.println("sbr1 length : " + sbr1.length());//40
        System.out.println("sbr1 capacity : " + sbr1.capacity());//70

        System.out.println(sbr1);//Java cok guzel3truetum dersler java olsa

        // length ve kapacite arasindaki farki ortadan kaldiriyor ve esitliyor
        sbr1.trimToSize();
        System.out.println("sbr1 length : " + sbr1.length());//40
        System.out.println("sbr1 capacity : " + sbr1.capacity());//40

    }
}
