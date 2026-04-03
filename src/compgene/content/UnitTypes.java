package compgene.content;

import mindustry.content.Fx;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.type.UnitType;
import mindustry.type.Weapon;

public class UnitTypes {
    public static UnitType

            //air attack
            firefly;

    public static void load() {

        firefly = new UnitType("dagger"){{
            researchCostMultiplier = 0.5f;
            speed = 0.5f;
            hitSize = 8f;
            health = 150;
            stepSoundVolume = 0.4f;

            weapons.add(new Weapon("large-weapon"){{
                reload = 13f;
                x = 4f;
                y = 2f;
                top = false;
                ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(2.5f, 9){{
                    width = 7f;
                    height = 9f;
                    lifetime = 60f;
                }};
            }});
        }};
    }
}