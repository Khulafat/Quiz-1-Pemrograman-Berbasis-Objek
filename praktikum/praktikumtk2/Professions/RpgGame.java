package com.praktikum.praktikumtk2.Professions;
/**
 *
 * @author HP
 */
public class RpgGame {
    public static void main(String[] args) {
        BattleMage bm = new BattleMage();
        bm.namaProfession = "Battle Mage";
        bm.mana = 400.5;
        bm.basicAttack = 42.3;
        bm.setBattlePoint(4);
        
        Necromancer nc = new Necromancer();
        nc.namaProfession = "Necromancer";
        nc.mana = 600.23;
        nc.basicAttack = 25.0;
        nc.setSummoner(4);
        
        SwordMaster sm = new SwordMaster();
        sm.namaProfession = "Sword Master";
        sm.aura = 10.5;
        sm.basicAttack = 55.0;
        sm.setEvasion(14.2);
        
        EliteMArtialArt ema = new EliteMArtialArt();
        ema.namaProfession = "Elite Martial Art";
        ema.aura = 17.5;
        ema.basicAttack = 52.0;
        ema.setRadiance(12.2);
        
        Cleric cl = new Cleric();
        cl.namaProfession = "Healer";
        cl.basicAttack = 8.2;
        cl.setFollower(12);
        cl.setPointBlessing(407.4);
        
        EyeOfGalaxy eog = new EyeOfGalaxy();
        eog.namaProfession = "Eye Of Galaxy";
        eog.basicAttack = 44.5;
        eog.vision = 9.0;
        eog.setMultitarget(12);
        
        Sniper sp = new Sniper();
        sp.namaProfession = "Sniper";
        sp.basicAttack = 49.0;
        sp.vision = 21.0;
        sp.setCritical(11);
        
        System.out.println("====================================");
        System.out.println("Nama Class      : "+bm.namaProfession);
        System.out.println("Mana            : "+bm.mana);
        System.out.println("Basic Attack    : "+bm.basicAttack);
        System.out.println("Battle Point    : "+bm.getBattlePoint());
        System.out.println("Total Damage    : "+bm.damageBM());
        System.out.println("====================================");
        
        System.out.println("====================================");
        System.out.println("Nama Class      : "+nc.namaProfession);
        System.out.println("Mana            : "+nc.mana);
        System.out.println("Basic Attack    : "+nc.basicAttack);
        System.out.println("Skeleton        : "+nc.getSummoner());
        System.out.println("Skeleton Damage : "+nc.damageNC());
        System.out.println("====================================");
        
        System.out.println("====================================");
        System.out.println("Nama Class      : "+sm.namaProfession);
        System.out.println("Aura            : "+sm.aura);
        System.out.println("Basic Attack    : "+sm.basicAttack);
        System.out.println("Evasion         : "+sm.getEvasion());
        System.out.println("Sword Damage    : "+sm.damageSM());
        System.out.println("====================================");
        
        System.out.println("====================================");
        System.out.println("Nama Class      : "+ema.namaProfession);
        System.out.println("Aura            : "+ema.aura);
        System.out.println("Basic Attack    : "+ema.basicAttack);
        System.out.println("Radiance        : "+ema.getRadiance());
        System.out.println("Punch           : "+ema.damageEMA());
        System.out.println("====================================");
        
        System.out.println("====================================");
        System.out.println("Nama Class      : "+cl.namaProfession);
        System.out.println("Basic Attack    : "+cl.basicAttack);
        System.out.println("Follower        : "+cl.getFollower());
        System.out.println("Blessing        : "+cl.getPointBlessing());
        System.out.println("Healing         : "+cl.healing());
        System.out.println("====================================");
        
        System.out.println("====================================");
        System.out.println("Nama Class      : "+eog.namaProfession);
        System.out.println("Basic Attack    : "+eog.basicAttack);
        System.out.println("Vision          : "+eog.vision);      
        System.out.println("Multi Target    : "+eog.getMultitarget());
        System.out.println("Total Damage    : "+eog.damageEOG());
        System.out.println("====================================");
        
        System.out.println("====================================");
        System.out.println("Nama Class      : "+sp.namaProfession);
        System.out.println("Basic Attack    : "+sp.basicAttack);
        System.out.println("Vision          : "+sp.vision);      
        System.out.println("Critical        : "+sp.getCritical());
        System.out.println("Total Damage    : "+sp.damageSP());
        System.out.println("====================================");
    }
}
