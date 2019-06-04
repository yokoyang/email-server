import io.github.biezhi.ome.OhMyEmail;
import io.github.biezhi.ome.SendMailException;

import javax.mail.MessagingException;

import static io.github.biezhi.ome.OhMyEmail.SMTP_163;

public class SendMail {
    public SendMail() {
        OhMyEmail.config(SMTP_163(false), "", "");
    }

    public void sentStudent(Student student) {

        String content = student.getName() +
                "同学你好" +
                "lab1: " +
                student.getLab1() +
                " lab2: " +
                student.getLab2() +
                " lab3: " +
                student.getLab3() +
                " avg: " +
                student.getAvg();
        try {
            OhMyEmail.subject("")
                    .from("")
                    .to(student.getEmail())
                    .text(content)
                    .send();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void testSendText() throws MessagingException, SendMailException {
        OhMyEmail.subject("这是一封测试TEXT邮件")
                .from("复旦")
                .to("yokocc255@163.com")
                .text("信件内容")
                .send();
    }
}
