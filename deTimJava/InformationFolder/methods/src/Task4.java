public class Task4 {
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        System.out.println("The area according to the given parameters is: " + task4.calculateArea(7, 8, 10));
    }

    private double calculateArea(int a, double b, double c) {

        double height = Math.sqrt((a * a) - ((a / 2) * (a / 2)));   //Height is needed for calculating area

        if (a + b > c && a + c > b && b + c > a) {  //Testing if the parameters are forming a triangle

            if (a * a + b * b == c * c || c * c + a * a == b * b || b * b + c * c == a * a) {   //Testing if the triangle is right-angled for improved calculation
                return a * b / 2;
            } else {

                if (a > b && a > c) {   //Depending on the length the baseline is chosen
                    return a * height / 2;
                } else if (b > a && b > c) {
                    return b * height / 2;
                } else {
                    return c * height / 2;
                }
            }
        } else {
            System.out.println("The digits wont even create a triangle!");
            return 0;
        }
    }
}
