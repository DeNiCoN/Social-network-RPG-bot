package ua.denicon.rpgbot.configs.commands;


public enum Commands {
    HELP((args, clientId) -> {

    }),
    JOIN((args, clientId) -> {

    }),
    LEAVE((args, clientId) -> {

    }),
    QUEST((args, clientId) -> {

    }),
    BATTLE((args, clientId) -> {

    }),
    INVENTORY((args, clientId) -> {

    }),
    PLAYERS((args, clientId) -> {

    }),
    TIMETOQUEST((args, clientId) -> {

    });

    private Action action;

    Commands(Action action) {
        this.action = action;
    }

    public Action getAction() {
        return action;
    }
}
