package main;

import entity.NPC_OldMan;
import interactive_tiles.IT_DryTree;
import monster.MON_GreenSlime;
import objects.*;

public class AssetSetter {

    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {

        int mapNum = 0;
        int i = 0;
        gp.obj[mapNum][i] = new OBJ_Coin_Bronze(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 25;
        gp.obj[mapNum][i].worldY = gp.tileSize * 23;
        i++;

        gp.obj[mapNum][i] = new OBJ_Coin_Bronze(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 21;
        gp.obj[mapNum][i].worldY = gp.tileSize * 19;
        i++;

        gp.obj[mapNum][i] = new OBJ_Coin_Bronze(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 26;
        gp.obj[mapNum][i].worldY = gp.tileSize * 21;
        i++;

        gp.obj[mapNum][i] = new OBJ_Axe(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 33;
        gp.obj[mapNum][i].worldY = gp.tileSize * 21;
        i++;

        gp.obj[mapNum][i] = new OBJ_Shield_Blue(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 34;
        gp.obj[mapNum][i].worldY = gp.tileSize * 21;
        i++;

        gp.obj[mapNum][i] = new OBJ_Potion_Red(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 22;
        gp.obj[mapNum][i].worldY = gp.tileSize * 27;
        i++;

        gp.obj[mapNum][i] = new OBJ_Heart(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 22;
        gp.obj[mapNum][i].worldY = gp.tileSize * 29;
        i++;

        gp.obj[mapNum][i] = new OBJ_ManaCrystal(gp);
        gp.obj[mapNum][i].worldX = gp.tileSize * 22;
        gp.obj[mapNum][i].worldY = gp.tileSize * 31;

    }

    public void setNPC() {

        int mapNum = 0;

        gp.npc[mapNum][0] = new NPC_OldMan(gp);
        gp.npc[mapNum][0].worldX = gp.tileSize * 21;
        gp.npc[mapNum][0].worldY = gp.tileSize * 21;
    }

    public void setMonster() {

        int i = 0;
        int mapNum = 0;
        gp.monster[mapNum][i] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 23;
        gp.monster[mapNum][i].worldY = gp.tileSize * 36;
        i++;

        gp.monster[mapNum][i] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 23;
        gp.monster[mapNum][i].worldY = gp.tileSize * 37;
        i++;

        gp.monster[mapNum][i] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 23;
        gp.monster[mapNum][i].worldY = gp.tileSize * 42;
        i++;

        gp.monster[mapNum][i] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 23;
        gp.monster[mapNum][i].worldY = gp.tileSize * 40;
        i++;

        gp.monster[mapNum][i] = new MON_GreenSlime(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 25;
        gp.monster[mapNum][i].worldY = gp.tileSize * 37;
    }

    public void setInteractiveTile() {

        int i = 0;
        int mapNum = 0;
        //SHORTCUT TOP
        gp.iTiles[mapNum][i] = new IT_DryTree(gp, 27, 12);i++;
        gp.iTiles[mapNum][i] = new IT_DryTree(gp, 28, 12);i++;
        gp.iTiles[mapNum][i] = new IT_DryTree(gp, 29, 12);i++;
        gp.iTiles[mapNum][i] = new IT_DryTree(gp, 30, 12);i++;
        gp.iTiles[mapNum][i] = new IT_DryTree(gp, 31, 12);i++;
        gp.iTiles[mapNum][i] = new IT_DryTree(gp, 32, 12);i++;
        gp.iTiles[mapNum][i] = new IT_DryTree(gp, 33, 12);i++;

        //ABILITY TO GET TO TRADER
        gp.iTiles[mapNum][i] = new IT_DryTree(gp, 10, 40);i++;
        gp.iTiles[mapNum][i] = new IT_DryTree(gp, 10, 41);i++;
        gp.iTiles[mapNum][i] = new IT_DryTree(gp, 11, 41);i++;
        gp.iTiles[mapNum][i] = new IT_DryTree(gp, 12, 41);i++;
        gp.iTiles[mapNum][i] = new IT_DryTree(gp, 13, 41);i++;
        gp.iTiles[mapNum][i] = new IT_DryTree(gp, 13, 40);i++;
        gp.iTiles[mapNum][i] = new IT_DryTree(gp, 14, 40);i++;
        gp.iTiles[mapNum][i] = new IT_DryTree(gp, 15, 40);i++;
        gp.iTiles[mapNum][i] = new IT_DryTree(gp, 16, 40);i++;
        gp.iTiles[mapNum][i] = new IT_DryTree(gp, 17, 40);i++;
        gp.iTiles[mapNum][i] = new IT_DryTree(gp, 18, 40);
    }
}
