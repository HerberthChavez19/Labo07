public class Notifier implements INotifier{
    
    @Override
    public void sendMsg(String mensaje) {
        System.out.println("Acerquese a la unidad de pago lo mas antes posible.");
        System.out.println("Enviado por mensaje de texto.");
    }
    
}
