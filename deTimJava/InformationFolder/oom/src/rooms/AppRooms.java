package rooms;

public class AppRooms {
    public static void main(String[] args) {

        Company company = new Company("Goodyear", "Künzell", 10);
        for (int i = 0; i <= 6; i++) {
            company.createRoom();
        }
        System.out.println(company.toString());

        company.roomSearch();

        System.out.println(company.toString());
    }
}
