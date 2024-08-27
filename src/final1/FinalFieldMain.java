package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        System.out.println("필드 초기화");
        FieldInit fieldInit11 = new FieldInit();
        FieldInit fieldInit12 = new FieldInit();
        FieldInit fieldInit13 = new FieldInit();
        System.out.println(fieldInit11.value);
        System.out.println(fieldInit12.value);
        System.out.println(fieldInit13.value);

        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
