package poly.ex.sender;

public class FaceBookSender implements Sender{
    private String message;
    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북에 발송합니다 : " + message);
    }
}
