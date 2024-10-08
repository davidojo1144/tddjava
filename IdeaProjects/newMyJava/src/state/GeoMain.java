package state;

import java.util.Scanner;

public class GeoMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Geopolitical zone to give you that states under it");
        String zone = sc.nextLine();
        GeoPoliticalZone.States state = GeoPoliticalZone.States.valueOf(zone);
        System.out.println(state.getDescription());



    }
}
