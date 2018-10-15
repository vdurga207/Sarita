import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
public static void main(String[] args) throws IOException {
	FileInputStream fi=new FileInputStream("D:\\ReadData.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fi);
	XSSFSheet sh=wb.getSheetAt(0);
	int rows=sh.getLastRowNum();
	List<Object> al=new ArrayList();
	for(int j=0;j<4;j++)
	{
	
	for(int i=0;i<rows;i++)
	{
			System.out.print(sh.getRow(i).getCell(j));
			al.add(sh.getRow(i).getCell(j));
			
		}
	System.out.print("\t");
	}
	System.out.println();
	
	
	XSSFWorkbook wb2=new XSSFWorkbook();
	XSSFSheet sh2=wb2.createSheet("1");
	//XSSFCell c;
	int rows2=sh2.getLastRowNum();
	for(int i=0;i<rows2;i++)
	{
		Row r=sh.createRow(i);
		if(al.contains("S.NO"))
		{
				r.createCell(0).setCellValue((double) al.get(i));
				//c.setCellStyle((CellStyle) al.get(i));
		}
		else
		{
			//r.createCell(1).setCellValue((al.get(i));
		}
	}
	FileOutputStream fout=new FileOutputStream("D:\\WriteData.xlsx");
	wb2.write(fout);
	wb2.close();
	fout.close();
	
}
}
