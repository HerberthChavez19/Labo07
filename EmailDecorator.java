public class EmailDecorator extends BaseNotifierDecorator{

    public EmailDecorator(INotifier wrapee) {
        super(wrapee);
    }

    @Override
    public void sendMsg(String nombre) {
        super.sendMsg(nombre);
        System.out.println("Enviado por Email.");
    } 
}
