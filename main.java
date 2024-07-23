//Title: V4 Chaos Altar - Auto Bones Use On Altar
//______________________________________________________________________________________________
// User Variables:
int bones = 526; //change this id to your bone ID
//______________________________________________________________________________________________

// Hinamizawa Variables Down Below:
int bones_counter = v.getInventory().count(bones);
int chaosAltarId = 411;
int opCode = 2;
WorldPoint altarSpot1 = new WorldPoint(2948, 3820, 0); //altar
WorldPoint altarSpot2 = new WorldPoint(2948, 3821, 0); //altar
WorldPoint currentLocation = client.getLocalPlayer().getWorldLocation();
GameObject chaosAltar = v.getGameObject().findNearest(chaosAltarId);
int chaosAltarSceneX = chaosAltar.getSceneMinLocation().getX();
int chaosAltarSceneY = chaosAltar.getSceneMinLocation().getY();
    if (bones_counter > 0 && (currentLocation.equals(altarSpot1) || currentLocation.equals(altarSpot2))) {
        v.invoke("Use","<col=ff9040>Bones</col>",0,25,27,9764864,false);
        v.invoke("Use","<col=ff9040>Bones</col><col=ffffff> -> <col=ffff>Chaos altar",chaosAltarId,opCode,chaosAltarSceneX,chaosAltarSceneY,false); 

    } 
bones_counter = bones_counter;   
