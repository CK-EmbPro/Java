import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FormatTextContents {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner (new BufferedReader(new FileReader("districts.txt")));
        scan.useDelimiter("[,\n]");
        while(scan.hasNext()){
//            String[] lineSections= scan.nextLine().split(",");
            int districtCode = scan.nextInt();
            String disctrictName = scan.next();
            int ProvinceCode = scan.nextInt();
            String ProvinceName= scan.next();

            System.out.println("DistrictCode "+districtCode+", DistrictName "+disctrictName+", ProvinceCode "+ProvinceCode+", ProvinceName "+ProvinceName);
            System.out.println();

        }
    }
}
