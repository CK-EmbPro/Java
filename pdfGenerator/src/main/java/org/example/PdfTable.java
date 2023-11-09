package org.example;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.*;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Stream;

class District1 {
    public String districtCode;
    public String districtName;
    public String provinceCode;
    public String provinceName;

    public District1(String districtCode, String districtName, String provinceCode, String provinceName){
        this.districtCode = districtCode;
        this.districtName = districtName;
        this.provinceCode = provinceCode;
        this.provinceName = provinceName;
    }

    public String getDistrictCode() {
        return this.districtCode;
    }

    public String getDistrictName() {
        return this.districtName;
    }

    public String getProvinceCode() {
        return this.provinceCode;
    }

    public String getProvinceName() {
        return this.provinceName;
    }
}

public class PdfTable {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<District1> data = new ArrayList<>();
       try {
           Scanner scan = new Scanner(new FileReader("districts.txt"));
           scan.useDelimiter("[,\n]");

           try {
               while (scan.hasNext()) {
                   String districtCode = scan.next();
                   String districtName = scan.next();
                   String provinceCode = scan.next();
                   String provinceName = scan.next();

                   data.add(new District1(districtCode, districtName, provinceCode, provinceName));
               }
           }catch (NoSuchElementException e){
               Utils.print(e.getMessage());
           }



           Document document = new Document();
           PdfWriter.getInstance(document, new FileOutputStream("districts.pdf"));

           document.open();
           Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
           Chunk chunk = new Chunk("Table of Districts and their provinces", font);

           chunk.setTextRise(6);

           PdfPTable table = new PdfPTable(4);
           addTableHeader(table);


           for (District1 d : data) {
               addCustomCells(d, table);
           }

           document.add(chunk);
           document.add(table);

           document.close();
       }catch (IOException | DocumentException | URISyntaxException e){
           e.printStackTrace();
       }
    }

    public static void addTableHeader(PdfPTable table){
        Stream.of("DistrictCode", "DistrictName", "ProvinceCode", "ProvinceName")
                .forEach((columnTitle)->{
                    PdfPCell header = new PdfPCell();
                    header.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    header.setBorderWidth(2);
                    header.setPhrase(new Phrase(columnTitle));

                    table.addCell(header);
                });
    }

    public static void addCustomCells(District1 district, PdfPTable table) throws URISyntaxException, BadElementException, IOException {
        PdfPCell cell1 = new PdfPCell(new Phrase(district.getDistrictCode()));
        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell1);

        PdfPCell cell2 = new PdfPCell(new Phrase(district.getDistrictName()));
        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell2);

        PdfPCell cell3 = new PdfPCell(new Phrase(district.getProvinceCode()));
        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell3);

        PdfPCell cell4 = new PdfPCell(new Phrase(district.getProvinceName()));
        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(cell4);
    }



}
