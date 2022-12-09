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
public class ExcelGenerator {
 
	public static ByteArrayInputStream excelGenerating(List<Buy> buylist) throws IOException {
		
		
		String[] columns = {"BID","FBUYNAME","BUYDATE","BUYQUANTITY","AMOUNT"};
		
		ByteArrayOutputStream out =new ByteArrayOutputStream();
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("emp Buy Date");
		
		Font headerFont = workbook.createFont();
		headerFont.setColor(IndexedColors.BROWN.getIndex());
		
		CellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);
		
		Row headerRow = sheet.createRow(0);
		
		for(int col = 0; col<columns.length; col++) {
			Cell cell = headerRow.createCell(col);
			cell.setCellValue(columns[col]);
			cell.setCellStyle(headerCellStyle);
		}
		int rowIndex = 1;
		
		for(Buy blist :buylist) {
			Row row = sheet.createRow(rowIndex++);
			row.createCell(0).setCellValue(blist.getBid());
row.createCell(1).setCellValue(blist.getFbuyname());
		row.createCell(2).setCellValue(blist.getBuydate());
		row.createCell(3).setCellValue(blist.getBuyrate());
		row.createCell(4).setCellValue(blist.getBuyquantity());
		row.createCell(5).setCellValue(blist.getAmount());
		
		}
		workbook.write(out);
		Path path = Paths.get("E:\\Buy.xlsx");
		Files.write(path, out.toByteArray());
		return new ByteArrayInputStream(out.toByteArray());
		
	}
}
