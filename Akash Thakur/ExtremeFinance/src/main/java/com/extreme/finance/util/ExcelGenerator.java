package com.extreme.finance.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import com.extreme.finance.model.Buy;
import com.extreme.finance.model.EmployeeData;

@Component
public class ExcelGenerator {
	
	
	
	public static ByteArrayInputStream excelGenerating(List<Buy> buyList) throws IOException {
		
		String[] columns = {"BID","FBUYNAME","BUYDATE","BUYRATE","BUYQUANTITY","AMOUNT"};
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Buy Data");
		
		Font headerfont = workbook.createFont();
		headerfont.setBold(true);
		headerfont.setColor(IndexedColors.BROWN.getIndex());
		
		CellStyle headerCellStyle =workbook.createCellStyle();
		
		headerCellStyle.setFont(headerfont);
		
		Row headerRow = sheet.createRow(0);
		
		for(int i = 0; i<columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
			cell.setCellStyle(headerCellStyle);
		}
		
		int rowIndex = 1;
		
		for(Buy b : buyList) {
			
			Row row = sheet.createRow(rowIndex++);
			row.createCell(0).setCellValue(b.getBid());
			row.createCell(1).setCellValue(b.getFbuyName());
			row.createCell(2).setCellValue(b.getBuyDate());
			row.createCell(3).setCellValue(b.getBuyRate());
			row.createCell(4).setCellValue(b.getBuyQuantity());
			row.createCell(5).setCellValue(b.getAmount());
		}
		
		workbook.write(out);
		Path path = Paths.get("E:\\Buy.xlsx");
		Files.write(path, out.toByteArray());
		
		return new ByteArrayInputStream(out.toByteArray());
		
		
	}

}
