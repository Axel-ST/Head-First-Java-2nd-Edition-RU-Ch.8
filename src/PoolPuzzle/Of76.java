/*
 * Created by Axel_ST on 10.03.2023
 *
 *  Head First Java, 2nd Edition (RU) p. 262
 */

package PoolPuzzle;

public class Of76 extends Clowns {
    public static void main(String[] args) {
        Nose[] i = new Nose[3];
        i[0] = new Acts();
        i[1] = new Clowns();
        i[2] = new Of76();
        for (int j = 0; j < 3; j++) {
            System.out.println(i[j].iMethod() + " " + i[j].getClass());
        }
    }
}
