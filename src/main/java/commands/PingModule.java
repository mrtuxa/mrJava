package commands;

import cfg.Settings;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

import java.time.temporal.ChronoUnit;

public class PingModule implements MessageCreateListener {
    Settings s = new Settings();

    /**
     * @param messageCreateEvent
     */
    @Override
    public void onMessageCreate(MessageCreateEvent e) {
        if (e.getMessageContent().equalsIgnoreCase(s.getPrefix() + "ping")) {
            long ping = e.getMessage().getCreationTimestamp().until(e.getChannel().getCreationTimestamp(), ChronoUnit.MILLIS);
            e.getChannel().sendMessage("Pong! " + ping + "ms");
        }
    }
}