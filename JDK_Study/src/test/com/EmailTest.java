//package test.com;
//
//import java.io.File;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.Properties;
//
//import javax.activation.DataHandler;
//import javax.activation.FileDataSource;
//import javax.mail.Authenticator;
//import javax.mail.Message;
//import javax.mail.Multipart;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.AddressException;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
//
///**
// * 邮件报警
// * 
// * @author 李勇(yong.li@renren-inc.com) 2011-11-03
// */
//public class EmailTest {
//
//    private String smtpHost;
//    private String fromAddress;
//    private String password;
//    private InternetAddress[] toAddresses;
//    
//    public EmailTest(String smtpHost, String fromAddress, String password){
//        this.smtpHost = smtpHost;
//        this.fromAddress = fromAddress;
//        this.password = password;
//        try {
//            //添加接受邮件的人
//            this.toAddresses = new InternetAddress[]{
//                    new InternetAddress("bo.yu@renren-inc.com"), 
//                    new InternetAddress("xuerong.yao@jiexi-inc.com"),
//                    new InternetAddress("ying.wang@jiexi-inc.com")
//                    };
//        } catch (AddressException e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 发送邮件
//     * 
//     * @param title
//     * @param content
//     * @return
//     */
//    public boolean sendMail(String title, String content, String filename) {
//        Properties props = System.getProperties();
//        // Setup mail server
//        props.put("mail.smtp.host", this.smtpHost);
//        props.put("mail.smtp.port", "25");
//        props.put("mail.smtp.auth", "true");
//        // Get Session
//        Session session = Session.getInstance(props, new Authenticator() {
//
//            @Override
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(fromAddress, password);
//            }
//        });
//
//        try {
//            MimeMessage message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(this.fromAddress));
//            message.addRecipients(Message.RecipientType.TO, this.toAddresses);
//            message.setSubject(title);
//            message.setText(content);
//            Multipart mp = new MimeMultipart();
//            MimeBodyPart mbp = new MimeBodyPart();
//            mbp.setContent(content, "text/html;charset=UTF-8");
//            mp.addBodyPart(mbp);
//            if (filename != null) {
//                File file = new File(filename);
//                if (file.exists()) {
//                    MimeBodyPart mbpFile = new MimeBodyPart();
//                    FileDataSource fds = new FileDataSource(filename);
//                    mbpFile.setDataHandler(new DataHandler(fds));
//                    mbpFile.setFileName(fds.getName());
//                    mp.addBodyPart(mbpFile);
//                }
//            }
//            message.setContent(mp);
//            Transport.send(message);// 发送邮件
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return true;
//    }
//    
//    /**
//     * @return
//     * 昨天的日期
//     */
//    public String getLastDay(){
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(new Date());
//        calendar.add(Calendar.DAY_OF_MONTH, -1);
//        Date date = calendar.getTime();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        return sdf.format(date);
//    }
//    
//    /**
//     * 主方法，发送邮件
//     * @param args
//     */
//    public static void main(String[] args) {
//        EmailTest et = new EmailTest("smtp.renren.com", "platform@renren.com", "CY9kYNZA5W");
//        String time = et.getLastDay();
//        if(et.sendMail("加公共主页的用户id", "日期：" + time + "\n如果未成功接收附件，请及时联系bo.yu@renren-inc.com", "/data/boyu/temp/" + time)){
//            System.out.println("成功发送邮件！fuck！");
//        }else{
//            System.out.println("fuck!发送邮件失败！再发送一次！");
//            et.sendMail("加公共主页的用户id", "日期：" + time + "\n如果未成功接收附件，请及时联系bo.yu@renren-inc.com", "/data/boyu/temp/" + time);
//        }
//    }
//
//}
//
