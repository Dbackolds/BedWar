package org.sobadfish.bedwar.event;

import cn.nukkit.event.Cancellable;
import cn.nukkit.event.Event;
import cn.nukkit.event.HandlerList;

public class PlayerGetExpEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    public static HandlerList getHandlers() {
        return HANDLERS;
    }

    private final String playerName;

    private int exp;

    private final String cause;

    public PlayerGetExpEvent(String playerName,int exp,String cause){
        this.playerName = playerName;
        this.exp = exp;
        this.cause = cause;
    }

    public String getCause() {
        return cause;
    }

    public int getExp() {
        return exp;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }


}
