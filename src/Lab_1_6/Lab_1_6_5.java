package Lab_1_6;

public class Lab_1_6_5 {
    public static void main(String[] args) {


        int[][] matrix = new int[4][4];


        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length; j++)

                matrix[i][j]=(int)(Math.random()*30);



        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i;j<matrix.length;j++)
            {
                int temp=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
