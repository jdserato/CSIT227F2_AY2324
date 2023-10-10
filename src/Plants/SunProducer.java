package Plants;

interface SunProducer {
    int produce_sun();
}

interface Attacker {
    int attack();
    RangeType rangeType();
}

interface InstantKiller {
    KillType killType();
}

interface PlantUpgrade {
    int concurrentSunCost();
}

interface Upgradable {
    PlantUpgrade upgrade();
}

// add more interfaces here
enum RangeType {
    SINGLE_LINE, AOE, LIMITED, FREE_RANGE;
}

enum KillType {
    INSTANT, CLOSE_CONTACT
}