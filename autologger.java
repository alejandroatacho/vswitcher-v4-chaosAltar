int tileFromMe = 25; // between 25 tiles and 0 it will log you out
if (client.getGameState().equals(GameState.LOGGED_IN)) {

    if (client.getPlayers().stream().anyMatch(player -> !player.equals(client.getLocalPlayer()) && player.getWorldLocation().distanceTo(client.getLocalPlayer().getWorldLocation()) <= tileFromMe)) { 
       v.getGame().logout();
    }
}