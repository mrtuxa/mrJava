import cfg.TokenClass;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;


public class RunTime {
    public static void main(String[] args) {
        TokenClass secret = new TokenClass();

        DiscordApi api = new DiscordApiBuilder()
                .setToken(secret.getToken())
                .login()
                .join();

        api.updateActivity(">help for informations", "https://rr.noordstar.me/6480fa80");


    }
}
