package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // 정적 변수와 메서드에만 접근 및 호출 가능
        staticValue++;
        staticMethod();
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceMethod=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
