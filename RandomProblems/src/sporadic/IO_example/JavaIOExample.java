package sporadic.IO_example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIOExample {

	private static final String INPUT = "/Users/SteveSun/Downloads/bash.sh";
	// "/tmp/input.txt";

	private static final String OUTPUT = "/tmp/output.txt";

	public static void main(String[] args) throws IOException {

		byteStreamsIO();

		// characterStreamsIO();

		// standardStreamsIO();
	}

	/**
	 * Java byte streams are used to perform input and output of 8-bit bytes.
	 * Though there are many classes related to byte streams but the most
	 * frequently used classes are: FileInputStream and FileOutputStream.
	 * Following is an example which makes use of these two classes to copy an
	 * input file into an output file:
	 * 
	 * @throws IOException
	 */
	static void byteStreamsIO() throws IOException {// This type is
													// package-level access,
													// without public, protected
													// and private keywords,
													// this is package-level
													// method
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(INPUT);
			fos = new FileOutputStream(OUTPUT);

			int c;
			while ((c = fis.read()) != -1) {
				fos.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				fis.close();
			}
			if (fos != null) {
				fos.close();
			}
		}
	}

	/**
	 * Java Byte streams are used to perform input and output of 8-bit bytes,
	 * where as Java Character streams are used to perform input and output for
	 * 16-bit unicode. Though there are many classes related to character
	 * streams but the most frequently used classes are: FileReader and
	 * FileWriter Though internally FileReader uses FileInputStream and
	 * FileWriter uses FileOutputStream but here major difference is that
	 * FileReader reads two bytes at a time and FileWriter writes two bytes at a
	 * time.
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	static void characterStreamsIO() throws FileNotFoundException, IOException {
		FileReader in = null;
		FileWriter out = null;

		try {
			in = new FileReader(INPUT);
			out = new FileWriter(OUTPUT);

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

	/**
	 * All the programming languages provide support for standard I/O where
	 * user's program can take input from a keyboard and then produce output on
	 * the computer screen. If you are aware if C or C++ programming languages,
	 * then you must be aware of three standard devices STDIN, STDOUT and
	 * STDERR. Similar way Java provides following three standard streams
	 * 
	 * Standard Input: This is used to feed the data to user's program and
	 * usually a keyboard is used as standard input stream and represented as
	 * System.in.
	 * 
	 * Standard Output: This is used to output the data produced by the user's
	 * program and usually a computer screen is used to standard output stream
	 * and represented as System.out.
	 * 
	 * Standard Error: This is used to output the error data produced by the
	 * user's program and usually a computer screen is used to standard error
	 * stream and represented as System.err.
	 * 
	 * Following is a simple program which creates InputStreamReader to read
	 * standard input stream until the user types a "q":
	 * 
	 * @throws IOException
	 */
	static void standardStreamsIO() throws IOException {
		InputStreamReader isr = null;

		try {
			isr = new InputStreamReader(System.in);
			System.out.println("Enter characters, 'q' to quit.");
			char c;
			do {
				c = (char) isr.read();
				System.out.print(c);
			} while (c != 'q');
		} finally {
			if (isr != null) {
				isr.close();
			}
			System.out.println("\nProgram stopped.");
		}
	}

}
