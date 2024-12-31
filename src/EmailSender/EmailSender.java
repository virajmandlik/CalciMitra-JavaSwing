package EmailSender;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class EmailSender {
   public static boolean sendEmailWithAttachment(String recipientEmail, String subject, String messageBody, String filePath) {
        final String senderEmail = "viraj.mandlik@mitaoe.ac.in"; 
        final String senderPassword = "obtoknmrvvsdyyez"; 

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject(subject);

            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(messageBody);

            MimeBodyPart attachmentBodyPart = new MimeBodyPart();
            attachmentBodyPart.attachFile(filePath);

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(attachmentBodyPart);

            message.setContent(multipart);

            Transport.send(message);
            System.out.println("Email sent successfully to " + recipientEmail);
            return true; // Return true if email is sent successfully

        } catch (Exception e) {
            System.out.println("Failed to send email: " + e.getMessage());
            return false; // Return false if there was an error
        }
    }
}