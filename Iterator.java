import User.User;

public interface Iterator {
        public User getNext();
        public boolean hasMore();
        public int getPosition();
        public void reset();
}