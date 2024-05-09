public class WhatsappDecorator extends BaseNotifierDecorator{

    public WhatsappDecorator(INotifier wrapee){
        super(wrapee);
    }

    @Override
    public void sendMsg(String message) {
        super.sendMsg(message);
        System.out.println("Enviado por Whatsapp.");
    }

    
}
