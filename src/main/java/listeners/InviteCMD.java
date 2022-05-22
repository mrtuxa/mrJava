package listeners;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class InviteCMD implements MessageCreateListener {
    /**
     * @param messageCreateEvent
     */
    @Override
    public void onMessageCreate(MessageCreateEvent e) {
        if (e.getMessageContent().equalsIgnoreCase())
    }
}
