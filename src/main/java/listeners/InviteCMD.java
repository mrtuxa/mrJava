package listeners;

import cfg.Settings;
import org.javacord.api.entity.channel.ServerTextChannel;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.entity.server.invite.Invite;
import org.javacord.api.entity.server.invite.InviteBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class InviteCMD implements MessageCreateListener {

    /**
     * @param messageCreateEvent
     */
    @Override
    public void onMessageCreate(MessageCreateEvent e) {
        Settings s = new Settings();
        if (e.getMessageContent().equalsIgnoreCase(s.getPrefix() + "invite")) {

            ServerTextChannel channel = (ServerTextChannel) e.getMessage().getChannel();
            Invite iv = new InviteBuilder(channel)
                    .setMaxUses(2)
                    .setNeverExpire()
                    .create().join();
            String ivlink = iv.getCode();
            e.getChannel().sendMessage(new EmbedBuilder()
                    .setTitle("***Invite Manager***")
                    .setDescription("Manage your server's invite codes here!")
                    .setAuthor("Invite Manager", "https://github.com/mrtuxa", "https://avatars.githubusercontent.com/u/69870860?v=4")
                    .addField("Invite Code", "Invite Link: https://discord.gg/" + ivlink, false)
                    .setFooter("executed by " + e.getMessageAuthor().getDisplayName(), e.getMessageAuthor().getAvatar())
            );
        }
    }
}
