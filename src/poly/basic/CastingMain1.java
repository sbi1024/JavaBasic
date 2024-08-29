package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 다운 캐스팅
        Parent poly = new Child();
        Child child = (Child) poly;
        child.childMethod();
    }
}
