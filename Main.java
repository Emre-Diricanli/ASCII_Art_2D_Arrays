public class Main {
    public static void main(String[] args) {
        char[][] arr = new char[4][13];
        arr = AssignmentTasks.make_forward();
        for(int i=0; i<4; i++){
            System.out.println();
            for(int j=0; j<13; j++){
                System.out.print(arr[i][j]);
            }
        char[][] mirror = new char[4][13];
        mirror = AssignmentTasks.make_mirror(arr);
            for(i = 0; i<4; i++) {
                System.out.println();
                for (int j = 0; j < 13; j++) {
                    System.out.print(mirror[i][j]);
                }
                for(i = 0; i<4; i++) {
                    System.out.println();
                    for (int j = 0; j < 26; j++) {
                        if (j < 13)
                            System.out.print(arr[i][j]);
                        else
                            System.out.print(mirror[i][j % 13]);
                    }
                }
            }

        }

    }
}














