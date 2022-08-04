package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int left = cathetusLength;
        int right = cathetusLength;
        for (int i = 1; i <= cathetusLength; i ++){
            int digit = i;
            for (int j = 1; j < 2 * cathetusLength; j++){
                if(j >= left && j <= right){
                    System.out.print(digit);
                    digit = j < cathetusLength ? --digit : ++digit;
                } else if (j > right) {
                    break;
                } else
                    System.out.print(' ');
            }
            left--;
            right++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
