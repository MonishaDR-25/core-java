package com.xworkz.excelRead;
import com.xworkz.excelDto.IceCreamDto;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

    public class ReadIceCreamExcel {

        public static List<IceCreamDto> readExcelData(String fileName) {
            List<IceCreamDto> list = new ArrayList<>();

            try (FileInputStream fis = new FileInputStream("C:\\Users\\monis\\Desktop\\excel\\icecream.xlsx");
                 Workbook workbook = WorkbookFactory.create(fis)) {

                DataFormatter formatter = new DataFormatter();
                int numberOfSheets = workbook.getNumberOfSheets();

                for (int i = 0; i < numberOfSheets; i++) {
                    Sheet sheet = workbook.getSheetAt(i);
                    Iterator<Row> rowIterator = sheet.iterator();

                    while (rowIterator.hasNext()) {
                        Row row = rowIterator.next();
                        if (isRowEmpty(row)) continue;

                        String name = formatter.formatCellValue(row.getCell(0));
                        String flavour = formatter.formatCellValue(row.getCell(1));
                        Integer quantity = parseIntSafe(formatter.formatCellValue(row.getCell(2)));
                        String takeAway = formatter.formatCellValue(row.getCell(3));
                        String addOns = formatter.formatCellValue(row.getCell(4));
                        String coupon = formatter.formatCellValue(row.getCell(5));

                        IceCreamDto dto = new IceCreamDto(name, flavour, quantity, takeAway, addOns, coupon);
                        list.add(dto);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            return list;
        }

        private static boolean isRowEmpty(Row row) {
            if (row == null)
                return true;
            for (int c = row.getFirstCellNum(); c < row.getLastCellNum(); c++) {
                Cell cell = row.getCell(c);
                if (cell != null && cell.getCellType() != CellType.BLANK
                        && !new DataFormatter().formatCellValue(cell).trim().isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        private static Integer parseIntSafe(String str) {
            try {
                return Integer.parseInt(str.trim());
            } catch (Exception e) {
                return 0;
            }
        }

        public static void main(String[] args) {
            List<IceCreamDto> iceCreams = readExcelData("icecream.xlsx");

            System.out.println("IceCream List:");
            iceCreams.forEach(System.out::println);
        }
    }


