package ua.denicon.rpgbot.configs;


public class Config {
    private char commandStart;
    private String host;
    private int port;
    private String nickName;

    public char getCommandStart() {
        return commandStart;
    }

    public void setCommandStart(char commandStart) {
        this.commandStart = commandStart;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
