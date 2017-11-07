package POIProject.POIProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

public class TestPOI {
	
	public static void readExcel() throws IOException{
		File f = new File("./src/main/java/POIProject/POIProject/POITest.xlsx");
		System.out.println(f.exists());
		FileInputStream inputstream = new FileInputStream(f);
		HSSFWorkbook wb = new HSSFWorkbook(inputstream);
		HSSFSheet sheet = wb.getSheetAt(0);
		HSSFRow row;
		HSSFCell cell;
		
		Iterator rows = sheet.iterator();
		while(rows.hasNext()){
			row=(HSSFRow)rows.next(); 
			Iterator cells = row.cellIterator();
			while(cells.hasNext()){
				cell=(HSSFCell) cells.next();
				if(cell.getCellType()==HSSFCell.CELL_TYPE_STRING){
					System.out.println(cell.getStringCellValue());
				}
				else{
					System.out.println(cell.getNumericCellValue());
				}
									
				}
			}
		//inputstream.close();
		
		}
	
	
	@Test
	public void readFile() throws IOException{
		TestPOI.readExcel();
		System.out.println("Hello");
	}
	

}
