package sporadic.IO_example;

import java.io.File;

/**
 * This is a class to demo File class in java.
 * 
 * A directory is a File
 * 
 * which can contain a list of other files and directories. You use File object
 * to create directories, to list down files available in a directory. For
 * complete detail check a list of all the methods which you can call on File
 * object and what are related to directories.
 * 
 * Java automatically takes care of path separators on UNIX and Windows as per
 * conventions. If you use a forward slash (/) on a Windows version of Java, the
 * path will still resolve correctly.
 * 
 * @author jiahuan
 *
 */
public class JavaFileExample {

	private static final String DIRECTORY_TO_CREATE = "/tmp/fileCreatedFromRunning-JavaFileExample";
	private static final String DIRECTORY_TO_LIST = "/Users/SteveSun/Downloads";
	
	public static void main(String[] args) {
		mkDirectory(DIRECTORY_TO_CREATE);

		listDirectories(DIRECTORY_TO_LIST);
	}

	/**
	 * @param dir TODO
	 * 
	 */
	static void mkDirectory(String DIRECTORY_TO_CREATE) {
		File d = new File(DIRECTORY_TO_CREATE);
		// Create directory now.
		d.mkdirs();
	}

	/**
	 * You can use list() method provided by File object to list down all the
	 * files and directories available in a directory as follows:
	 * @param dir TODO
	 */
	static void listDirectories(String DIRECTORY_TO_LIST) {
		File file = null;
		String[] paths;

		try {
			// create new file object
			file = new File(DIRECTORY_TO_LIST);

			// array of files and directory
			paths = file.list();

			// for each name in the path array
			for (String path : paths) {
				// prints filename and directory name
				System.out.println(path);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
