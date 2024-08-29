package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 일시적 다운 캐스팅
        Parent poly = new Child();
        ((Child) poly).childMethod();
    }
}
