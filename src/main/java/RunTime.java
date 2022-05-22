import cfg.Settings;
import cfg.TokenClass;
import listeners.InviteCMD;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.channel.TextChannel;


public class RunTime {
    public static void main(String[] args) {
        TokenClass secret = new TokenClass();
        Settings s = new Settings();
        System.out.println("Discord API is starting...");
        DiscordApi api = new DiscordApiBuilder()
                .setToken(secret.getToken())
                .addListener(new InviteCMD())
                .login()
                .join();

        api.updateActivity(s.getRPCname(), s.getRPCurl());
        System.out.println("Discord API is running.");

        TextChannel channel =
    }
}
