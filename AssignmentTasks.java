public class AssignmentTasks {
    static char[][] make_forward(){
        char[][] art = new char[4][13];
        for(int i=0; i<4; i++){
            for(int j =0; j<13; j++){
                art[i][j] = ' ';
            }
        }
        art[0][1] = art[0][2] = art[0][3] = art[0][4] = art[0][5] = art[0][6] = art[1][2] = art[1][5] = art[1][9] = art[1][10] = art[2][4] = art[2][9] = art[2][11] = '_';
        art[1][0] = '/';
        art[1][6] = art[2][12] = '\\';
        art[2][0] = art[3][3] = art[3][8] = '(';
        art[3][5] = art[3][10] = ')';
        art[1][1] = art[1][3]= art[1][4]= '|';
        art[3][0] = '=';
        art[1][8] = '.';
        art[3][2] = art[3][6] = art[3][7] = art[3][11] = '-';
        art[3][1] = art[3][12] = art[1][7] = '\'';
        return art;
    }

    static char[][] make_mirror(char[][] arr){
        char[][] art = new char[4][13];
        for(int i=0; i<4; i++){
            for(int j =0; j<13; j++){
                art[i][j] = arr[i][j];
            }
        }
        for(int i=0; i<4; i++){
            for(int j =0; j<=6; j++){
                int new_column = (art[i].length-1) - j;

                char a = art[i][j];
                char b = art[i][new_column];
                art[i][j] = b;
                art[i][new_column] = a;
            }
        }
        for(int i=0; i<4; i++){
            for(int j =0; j<13; j++){
                if(art[i][j] == '\\') {
                    art[i][j] = '/'; continue;
                }
                if(art[i][j] == '/') {
                    art[i][j] = '\\';continue;
                }
                if(art[i][j] == '(') {
                    art[i][j] = ')';continue;
                }
                if(art[i][j] == ')') {
                    art[i][j] = '(';continue;
                }
            }
        }
        return art;
    }
}
