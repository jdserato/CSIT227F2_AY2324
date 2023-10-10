package Plants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Plant> plants = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Game Mode: ");
        String mode = sc.nextLine();
        boolean state = mode.equals("Fog") || mode.equals("Night");
        String input;
        do {
            System.out.print("Add a plant: ");
            input = sc.nextLine();
            switch (input) {
                case "DONE":
                    break;
                case "Wall Nut":
                    plants.add(new Plant.WallNut());
                    break;
                case "Sun-shroom":
                    plants.add(new Mushroom.SunShroom(state));
                    break;
                case "Doom-shroom":
                    plants.add(new Mushroom.DoomShroom(state));
                    break;
                case "Puff-shroom":
                    plants.add(new Mushroom.PuffShroom(state));
                    break;
                case "Peashooter":
                    plants.add(new Plant.Peashooter());
                    break;
                case "Squash":
                    plants.add(new Plant.Squash());
                    break;
                case "Jalapeno":
                    plants.add(new Plant.Jalapeno());
                    break;
                case "Sunflower":
                    plants.add(new Plant.Sunflower());
                    break;
                case "Lily Pad":
                    plants.add(new Plant.LilyPad());
                    break;
                case "Coffee Bean":
                    for (Plant p : plants) {
                        if (p instanceof Mushroom && !((Mushroom) p).isAwake()) {
                            ((Mushroom) p).awaken(new Plant.CoffeeBean());
                            break;
                        }
                    }
                    break;
                case "Twin Sunflower":
                    for (Plant p : plants) {
                        if (p instanceof Plant.Sunflower) {
                            int pos = plants.indexOf(p);
                            plants.add(pos, (Plant) ((Upgradable) p).upgrade());
                            plants.remove(p);
                            break;
                        }
                    }
                    break;
                case "Cattail":
                    for (Plant p : plants) {
                        if (p instanceof Plant.LilyPad) {
                            int pos = plants.indexOf(p);
                            plants.add(pos, (Plant) ((Upgradable) p).upgrade());
                            plants.remove(p);
                            break;
                        }
                    }
                    break;

                // add more plants here
                default:
                    System.out.println(input + " is not a plant");
            }
        } while (!input.equals("DONE"));

        do {
            int num = 0, total = 0;
            System.out.print("Do something: ");
            input = sc.nextLine();
            switch (input) {
                case "DONE":
                    break;
                case "Produce Sun":
                    // add implementation here
                    for (Plant p : plants) {
                        if (p instanceof SunProducer && p.isAlive()) {
                            num++;
                            total += ((SunProducer) p).produce_sun();
                        }
                    }
                    if (num == 0) {
                        System.out.println("You have no sun producers");
                    } else {
                        System.out.println(num + " sun producers gather " + total + " suns");
                    }
                    break;
                case "Attack":
                    // add implementation here
                    for (Plant p : plants) {
                        if (p instanceof Attacker && p.isAlive()) {
                            num++;
                            total += ((Attacker) p).attack();
                        }
                    }
                    if (num == 0) {
                        System.out.println("You have no attackers");
                    } else {
                        System.out.println(num + " attackers dealing " + total + " damage");
                    }
                    break;
                // add more cases here
                case "Instant Kill Status":
                    for (Plant p : plants) {
                        if (p instanceof InstantKiller && p.isAlive()) {
                            num++;
                            switch (((InstantKiller) p).killType()) {
                                case INSTANT:
                                    System.out.println(p.name + " can kill instantly");
                                    break;
                                case CLOSE_CONTACT:
                                    System.out.println(p.name + " can kill on contact");
                                    break;
                            }
                        }
                    }
                    if (num == 0) {
                        System.out.println("You have no plants which can kill instantly");
                    }
                    break;
                case "Attacker Status":
                    for (Plant p : plants) {
                        if (p instanceof Attacker && p.isAlive()) {
                            num++;
                            switch (((Attacker) p).rangeType()) {
                                case SINGLE_LINE:
                                    System.out.println(p.name + " can attack on a single line");
                                    break;
                                case LIMITED:
                                    System.out.println(p.name +  " can attack only when enemy is nearby");
                                    break;
                                case AOE:
                                    System.out.println(p.name + " can attack using area-of-effect");
                                    break;
                                case FREE_RANGE:
                                    System.out.println(p.name +  " can attack any enemies from anywhere");
                                    break;
                            }
                        }
                    }
                    if (num == 0) {
                        System.out.println("You have no attackers");
                    }
                    break;
                case "Sort by Name":
                    Collections.sort(plants);
                    for (Plant p : plants) {
                        System.out.println(p);
                    }
                    break;
                case "Sort by HP":
                    plants.sort(new Plant.PlantHPComparator());
                    for (Plant p : plants) {
                        System.out.println(p);
                    }
                    break;
                case "Sort by Sun Cost":
                    plants.sort(new Plant.PlantSunCostComparator());
                    for (Plant p : plants) {
                        System.out.println(p);
                    }
                    break;
                case "Sort by Close Sun Cost":
                    System.out.print("Close to how many suns: ");
                    int target = sc.nextInt();
                    sc.nextLine();
                    plants.sort(new Plant.PlantCloseSCComparator(target));
                    for (Plant p : plants) {
                        System.out.println(p);
                    }
                    break;

                default:
                    System.out.println("Unknown action: " + input);
            }
        } while (!input.equals("DONE"));
    }
}
