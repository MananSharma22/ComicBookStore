
package com.ComicBookStore.Mail;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail 
{
public static void sendMail(String recepient) throws Exception
    {
        System.out.println("Preparing to send email");
        Properties prop=new Properties();
            prop.put("mail.smtp.host","smtp.gmail.com");
            prop.put("mail.smtp.port","465");
            prop.put("mail.smtp.auth","true");
            prop.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
            prop.put("mail.smtp.socketFactory.port","465");
            
            String myAccountEmail="manan.****@gmail.com";
            String password="****";
            
            Session session= Session.getDefaultInstance(prop,new Authenticator(){

                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(myAccountEmail,password);          
                }          
            });
            Message message=prepareMessage(session,myAccountEmail,recepient);
          Transport.send(message);
          System.out.println("message sent successfully");
    }
            private static Message prepareMessage(Session session,String myAccountEmail, String recepient)
            {
                try{
                Message message=new MimeMessage(session);
                message.setFrom(new InternetAddress(myAccountEmail));
                message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
                message.setSubject("ComicBookStore-Orders");
                message.setText("Your order is Placed Successfully!");
                return message;
            }
                catch(Exception e){}
    return null;
            }
         
    }    

