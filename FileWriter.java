import java.io.*;
class FileWriter {

	public FileWriter(String string) {
		// TODO Auto-generated constructor stub
	}
	private void write(String string) {
		// TODO Auto-generated method stub
		
	}
	private void close() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter fw = new FileWriter("Copy Your File URL, instead of this Statement:");
			for(int i=0;i<=12;i++) {
				fw.write("Line"+i+"\n");
				
			}
			fw.close();
		}
		catch(Exception e) {
			System.out.println("Exception:" +e);
		}
	}
	

	
}
