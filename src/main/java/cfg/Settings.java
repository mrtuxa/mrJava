package cfg;
public class Settings {
    private String RPCname = ">help for informations";
    private String RPCurl = "https://www.youtube.com/watch?v=xvFZjo5PgG0";
    private String prefix = ">";
    public String getRPCname() {
        return RPCname;
    }

    public String getRPCurl() {
        return RPCurl;
    }

    public void setRPCname(String RPCname) {
        this.RPCname = RPCname;
    }

    public void setRPCurl(String RPCurl) {
        this.RPCurl = RPCurl;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
