public class BaseNotifierDecorator implements INotifier {
    private final INotifier wrapee;

    public BaseNotifierDecorator(INotifier wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public void sendMsg(String message) {
        wrapee.sendMsg(message);

    }
    
    
}
