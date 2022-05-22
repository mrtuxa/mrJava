package listeners;

import cfg.Settings;
import org.javacord.api.entity.message.MessageBuilder;
import org.javacord.api.entity.message.component.ActionRow;
import org.javacord.api.entity.message.component.SelectMenu;
import org.javacord.api.entity.message.component.SelectMenuOption;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

import java.util.Arrays;
import java.util.List;

public class InviteCMD implements MessageCreateListener {
    Settings s = new Settings();
    /**
     * @param messageCreateEvent
     */
    @Override
    public void onMessageCreate(MessageCreateEvent e) {
        if (e.getMessageContent().equalsIgnoreCase(s.getPrefix() + "invite")) {
            e.getChannel().sendMessage((List<EmbedBuilder>) new MessageBuilder()
                    .setContent("Select an option of this list!")
                    .addComponents(
                            ActionRow.of(SelectMenu.create("options", "Click here to show the options", 1, 1,
                                    Arrays.asList(SelectMenuOption.create("Option One", "You selected Option One!", "Click here to select Option One"),
                                            SelectMenuOption.create("Option Two", "You selected Option Two!", "Click here to select Option Two"),
                                            SelectMenuOption.create("Option Three", "You selected Option Three!", "Click here to select Option Three"))))))
        }
    }
}
