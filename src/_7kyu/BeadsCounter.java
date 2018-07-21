package _7kyu;

/**
 * Two red beads are placed between every two blue beads.
 * There are N blue beads. After looking at the arrangement below work out the number of red beads.
 *
 *  @ @@ @ @@ @ @@ @ @@ @ @@ @
 *  R BB R BB R BB R BB R BB R (R - red; B - blue)
 *
 * Implement count_red_beads(N_blue) (in PHP count_red_beads($n); in Java, Javascript countRedBeads(n))
 * so that it returns the number of red beads.
 * If there are less than 2 blue beads return 0.
 */
public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
        return nBlue > 1 ? (nBlue - 1) * 2 : 0;
    }
}
