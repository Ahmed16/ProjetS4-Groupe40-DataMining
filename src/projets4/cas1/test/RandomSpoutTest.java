package projets4.cas1.test;

import projets4.cas1.generator.RandomSpout;

public class RandomSpoutTest {
	public static void main(String [] args) {
		RandomSpout randomSpout = new RandomSpout("/home/sbt/code/Projet40 Cas1 Justin.tv/data/data");
		for (int i = 0; i < 100; i++) {
			randomSpout.printRandomEvent();
		}
	}
}
