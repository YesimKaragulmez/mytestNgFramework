package com.techproed.excelAutomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    //   Write the Row 1 Column 4 : POPULATION
    //   And Set the value of Paris population Row 2 Column 4 = 21480000
    //first ,you can write the population of each capital one by one
    //Using a loop ,write the population of the capitols
    @Test
    public void writeExcel() throws IOException {
        String path = "\\Users\\user\\IdeaProjects\\mytestNGframework\\src\\test\\resouces\\Capitals (1).xlsx";
        FileInputStream file = new FileInputStream(path);//opening the file
        Workbook workbook = WorkbookFactory.create(file);//opening the workbook
        Sheet sheet = workbook.getSheetAt(0);//getting the first sheet
        Row row = sheet.getRow(0);//getting the first row
        Cell cell = row.createCell(3);//creating a cell
        cell.setCellValue("POPULATION");
        //Opening a file to send data to the created cell
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);//writing on the cell and saving the workbook
        fileOutputStream.close();
        file.close();
        workbook.close();
    }


}
