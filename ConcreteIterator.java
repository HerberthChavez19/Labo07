import java.util.ArrayList;
import java.util.List;
import User.User;

public class ConcreteIterator implements Iterator {
    // private List<User> users;
    private int currentPosition;
    private List<User> users = new ArrayList<>();

    public ConcreteIterator(List<User> users) {
        this.users = users;
        this.currentPosition = 0;
    }

    @Override
    public User getNext() {
        if (hasMore()) {
            User nextUser = users.get(currentPosition);
            currentPosition++;
            return nextUser;
        }
        return null;
    }

    @Override
    public boolean hasMore() {
        return currentPosition < users.size();
    }

    @Override
    public int getPosition() {
        return currentPosition;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
