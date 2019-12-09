package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldRunner {
public static void main(String[] args) {
//	World w = new World();
//	w.show();
//	
//	Bug bee = new Bug();
//	bee.setColor(Color.YELLOW);
//	Location b = new Location(0, 3);
//	w.add(b, bee);
//	
//	Random random = new Random();
//	int x = random.nextInt(10);
//	int y = random.nextInt(10);
//	Bug ran = new Bug();
//	ran.setColor(Color.BLUE);
//	Location r = new Location(x, y);
//	w.add(r, ran);
//	ran.turn();
//	ran.turn();
//	
//	Flower f = new Flower();
//	Location flo = new Location(x-1, y);
//	w.add(flo, f);
//	
//	Flower f2 = new Flower();
//	Location flo2 = new Location(x+1, y);
//	w.add(flo2, f2);
	
	
	World america = new World();
	
		for(int y = 0; y < 10; y+=2){
				for(int x = 0; x<10; x++){
					Flower f = new Flower();
					f.setColor(Color.WHITE);
					Location l = new Location(y, x);
					america.add(l, f);
			}
		}
		for(int y = 1; y < 10; y+=2){
			for(int x = 0; x<10; x++){
				Flower f = new Flower();
				f.setColor(Color.RED);
				Location l = new Location(y, x);
				america.add(l, f);
			}
		}
		america.show();
	}

}


