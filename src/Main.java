public class Main {
    public static void main(String[] args) {
        Triangle triangleOne =new Triangle(5,5,5);
        System.out.println(triangleOne.areaTriangle());
        System.out.println(triangleOne.toString());
        Triangle triangleTwo =new Triangle();
        triangleTwo.setSideFirst(2.0);
        triangleTwo.setSideSecond(3.0);
        triangleTwo.setSideThird(4.0);
        System.out.println(triangleTwo.areaTriangle());
        System.out.println(triangleTwo.toString());
    }
}
