package listeners;

import cfg.Settings;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class InviteCMD implements MessageCreateListener {
    Settings s = new Settings();
    /**
     * @param messageCreateEvent
     */
    @Override
    public void onMessageCreate(MessageCreateEvent e) {
        if (e.getMessageContent().equalsIgnoreCase(s.getPrefix() + "invite")) {
            // do stuff
        }
    }
}
