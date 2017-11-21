package model.bean;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;


//Modulo de Envio de email para o usuario que irá recuperar a senha.

public class JavaMailApp
{
     public int newsenha;
    public boolean EnviaMail(String email, String cpf){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;  
        
              
        try {
        stmt = con.prepareStatement("SELECT senha FROM login WHERE idlogin = (SELECT idlogin FROM funcionario WHERE cpf_funcionario=?)");
        stmt.setString(1,cpf);
        rs = stmt.executeQuery();  
        while(rs.next()){
            newsenha = rs.getInt("senha");                
        }
       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel trazer os resultados -> "+ex);
        }finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
        }
              
           /* String msg = "<html>"+
                            "<META http-equiv=Content-Type content=\"text/html; charset=iso-8859-1\">"+
                            "Olá,<br><br> Essa é sua senha temporária para acessar nosso sistema :<br> "+newsenha+"</b>"+
                            " <br><br><hr><b>EQUIPE FOR SOLUTIONS.</b></html>";*/
           
           String msg = "Olá,\n\n"+
                        "Essa é sua senha temporária para acessar nosso sistema :"+newsenha+"\n\n"+
                        "att, \nEQUIPE FOR SOLUTIONS";
              
            boolean check = false;
            Properties props = new Properties();
            /** Parâmetros de conexão com servidor Gmail */
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");

            Session session = Session.getDefaultInstance(props,
                        new javax.mail.Authenticator() {
                             protected PasswordAuthentication getPasswordAuthentication() 
                             {
                                   return new PasswordAuthentication("garotosqueprogramam@gmail.com", "ledonmoleton");
                             }
                        });
            /** Ativa Debug para sessão */
            session.setDebug(true);
            try {

                  Message message = new MimeMessage(session);
                  message.setFrom(new InternetAddress("garotosqueprogramam@gmail.com")); //Remetente

                  Address[] toUser = InternetAddress //Destinatário(s)
                             .parse(email);  
                  message.setRecipients(Message.RecipientType.TO, toUser);
                  message.setSubject("Recuperação de Senha For Solutions");//Assunto
                  message.setText(msg);
                  /**Método para enviar a mensagem criada*/
                  Transport.send(message);
                  check = true;
             } catch (MessagingException e) {
                  throw new RuntimeException(e);                  
            }
           
            return check;
          }
    
    public boolean emailfunc(String email,String cliente,String tel,int os){      
      
              
           /* String msg = "<html>"+
                            "<META http-equiv=Content-Type content=\"text/html; charset=iso-8859-1\">"+
                            "Olá,<br><br> Essa é sua senha temporária para acessar nosso sistema :<br> "+newsenha+"</b>"+
                            " <br><br><hr><b>EQUIPE FOR SOLUTIONS.</b></html>";*/
           
           String msg = "Olá,\n\n"+
                        "Temos um serviço realizado, entre em contato com o cliente "+cliente+" para que ele possa retirar - ló.\n"+
                        "Informações:\n"+
                        "Cliente: "+cliente+"\n"+
                        "Contato: "+tel+"\n"+
                        "Número de O.S.: "+os+"\n\n"+
                        "att, \nEQUIPE FOR SOLUTIONS";
              
            boolean check = false;
            Properties props = new Properties();
            /** Parâmetros de conexão com servidor Gmail */
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");

            Session session = Session.getDefaultInstance(props,
                        new javax.mail.Authenticator() {
                             protected PasswordAuthentication getPasswordAuthentication() 
                             {
                                   return new PasswordAuthentication("garotosqueprogramam@gmail.com", "ledonmoleton");
                             }
                        });
            /** Ativa Debug para sessão */
            session.setDebug(true);
            try {

                  Message message = new MimeMessage(session);
                  message.setFrom(new InternetAddress("garotosqueprogramam@gmail.com")); //Remetente

                  Address[] toUser = InternetAddress //Destinatário(s)
                             .parse(email);  
                  message.setRecipients(Message.RecipientType.TO, toUser);
                  message.setSubject("Novo Serviço Realizado");//Assunto
                  message.setText(msg);
                  /**Método para enviar a mensagem criada*/
                  Transport.send(message);
                  check = true;
             } catch (MessagingException e) {
                  throw new RuntimeException(e);                  
            }
           
            return check;
          }
      
    
}
