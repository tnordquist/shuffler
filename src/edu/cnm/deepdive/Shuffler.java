package edu.cnm.deepdive;

import java.util.Random;

public class Shuffler {

  public static void shuffle(int[] data, Random random) {

    for (int i = data.length -1; i > 0; --i) {

      int source = random.nextInt(i+1);
      int temp = data[source];
      data[source] = data[i];
      data[i] = temp;
    }

  }

  public static void shuffle(int[] data) {

    shuffle(data, new Random());

  }



}
