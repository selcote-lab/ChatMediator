import java.util.ArrayList;
import java.util.List;

interface ChatMediator {
    public void sendMessage(String msg, User user);
    public void addUser(User user);
}

class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl(){
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void sendMessage(String msg, User user) {

        for(User u : this.users) {
            if (u != user) {
                u.receive(msg);
            }
        }
    }
}