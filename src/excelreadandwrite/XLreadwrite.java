package excelreadandwrite;

public class XLreadwrite {

	public static void main(String[] args) {
		
		Xls_Reader wr=new Xls_Reader("./src/Excelfile/excel work1.xlsx");
		
		int count=wr.getRowCount("Sheet1");
		System.out.println(count);
		
		for(int r=2;r<=count;r++)
		{
			String username=wr.getCellData("Sheet1", "Username", r);
			System.out.println(username);
			String password=wr.getCellData("Sheet1", "Password", r);
			System.out.println(password);
			
			wr.setCellData("Sheet1","Status" , r,"dataprinted" );
			
			
			
		}
		
		
		

	}

}
