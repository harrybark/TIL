package me.harry.designpatterns.designpatterns.structural_patterns.facade.after;

public class Client {

    public static void main(String[] args) {

        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("keesun");
        emailMessage.setTo("whiteship");
        emailMessage.setSubject("오징어게임");
        emailMessage.setText("밖은 더 지옥어디라고..");

        emailSender.sendEmail(emailMessage);
    }
}
