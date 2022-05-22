import cfg.TokenClass;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;


public class RunTime {
    public static void main(String[] args) {
        TokenClass secret = new TokenClass();
        System.out.println("Discord API is starting...");
        DiscordApi api = new DiscordApiBuilder()
                .setToken(secret.getToken())
                .login()
                .join();

        api.updateActivity(">help for informations", "https://www.youtube.com/watch?v=xvFZjo5PgG0");
        System.out.println("Discord API is running.");

    }
}
