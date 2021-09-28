import java.nio.file.*;
import java.io.IOException;

//Java doc: class Files avec method copy
//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Files.html

class FileBackup{
	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();

		try{
			Files.createDirectory(fs.getPath("backup"));
		} catch (IOException e){
			System.out.println(e);
		} finally{
			try{
				Files.copy(fs.getPath("FileBackup.java"), fs.getPath("backup","FileBackup.java"));
			} catch (IOException e){
				System.out.println(e);
			}
		}
		
	}
}

