package com.extreme.finance.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import com.extreme.finance.model.Buy;

@Component
public class ExcelGenertor {

	public static ByteArrayInputStream excelGenerating(List<Buy> buyList) throws IOException {
		
	String[] columns = {"BID","FBUYNAME","BUYDATE","BUYRATE","BUYQUANTITY","AMOUNT"};
	
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	
	XSSFWorkbook workbook = new XSSFWorkbook();
	
	XSSFSheet sheet = workbook.createSheet("Emp Buy Data");
	
    Font headerFont = workbook.createFont();
    headerFont.setBold(true);
    
    headerFont.setColor(IndexedColors.BLUE1.getIndex());
    
    CellStyle headerCellStyle = workbook.createCellStyle();
    
    headerCellStyle.setFont(headerFont);
    
    Row headerRow = sheet.createRow(0);
    for (int i = 0; i < columns.length; i++) {
		Cell cell = headerRow.createCell(i);
		cell.setCellValue(columns[i]);
		cell.setCellStyle(headerCellStyle);
	}
    int rowIndex=1;
    for (Buy b : buyList) {
    	Row row = sheet.createRow(rowIndex++);
    	row.createCell(0).setCellValue(b.getBid());
    	row.createCell(1).setCellValue(b.getFbuyname());
    	row.createCell(2).setCellValue(b.getBuydate());
    	row.createCell(3).setCellValue(b.getBuyrate());
    	row.createCell(4).setCellValue(b.getBuyquantity());
    	row.createCell(5).setCellValue(b.getAmount());
		
	}
    
    workbook.write(out);
    Path path = Paths.get("F://Buy.xlsx");
    Files.write(path, out.toByteArray());
    return new ByteArrayInputStream(out.toByteArray());
	}

}
