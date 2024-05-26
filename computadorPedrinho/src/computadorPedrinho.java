public class computadorPedrinho {
    public static void main(String[] args) {
        System.out.println("MSN");
        MSNmessenger msn = new MSNmessenger();
        msn.enviarMensagem();
        msn.receberMensagem();
    
        System.out.println("FACEBOOK");
        Facebookmessenger fcb = new Facebookmessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("TELEGRAM");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
