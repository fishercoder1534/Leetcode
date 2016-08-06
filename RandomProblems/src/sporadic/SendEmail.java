package sporadic;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

//TODO: make this program work!

/**
 * To send an e-mail using your Java Application is simple enough but to start
 * with you should have JavaMail API and Java Activation Framework (JAF)
 * installed on your machine.
 * 
 * [DONE] You can download latest version of JavaMail (Version 1.2) from Java's
 * standard website.
 * 
 * [DONE] You can download latest version of JAF (Version 1.1.1) from Java's
 * standard website.
 * 
 * Download and unzip these files, in the newly created top level directories
 * you will find a number of jar files for both the applications. You need to
 * add mail.jar and activation.jar files in your CLASSPATH.
 * 
 * Send a Simple E-mail: Here is an example to send a simple e-mail from your
 * machine.
 * 
 * Here it is assumed that your localhost is connected to the internet and
 * capable enough to send an email.
 */

// This app is not running now, I guess it's b/c my localhost is not connected
// to Internet yet. I need to figure this out.
public class SendEmail {

	public static void main(String[] args) {
		// Recipient's email ID needs to be mentioned.
		String to = "sunjiahuan@gmail.com";

		// Sender's email ID needs to be mentioned
		String from = "steve.j.sun@gmail.com";

		// Assuming you are sending email from localhost
		String host = "10.34.128.145";

		// Get system properties
		Properties properties = System.getProperties();

		// Setup mail server
		properties.setProperty("mail.smtp.host", host);

		// Get the default Session object.
		Session session = Session.getDefaultInstance(properties);

		try {
			// Create a default MimeMessage object.
			MimeMessage message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(
					to));

			// Set Subject: header field
			message.setSubject("This is the Subject Line!");

			// Now set the actual message
			message.setText("This is actual message");

			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
}
