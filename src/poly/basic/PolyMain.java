package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        // 다형적 참조의 핵심은 부모는 자식을 품을 수 있다.
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

    }
}
