import java.util.Scanner;

class MyFirst{

    static int Substr(char S1[], char S2[], int a, int b) {
        int Siva[][] =new int [a+1][b+1];
        int result =0;
        System.out.println(a);
        for (int i=0;i<=a;i++) {
            for(int j=0;j<=b;j++) {
                if(i==0 || j==0){
                    Siva[i][j]=0;
                    System.out.println("siva" + Siva[i][j]);
                    
                }else if (S1[i-1]==S2[j-1]){
                    System.out.println("enter" + i);
                    System.out.println("enter" + j);
                    Siva[i][j] = Siva[i-1][j-1] +1;
                    System.out.println(Siva[i][j]);
                    result  = Integer.max(result,Siva[i][j]);
                    System.out.println("result" + result);
                
                }else{
                    Siva[i][j] =0;
                    System.out.println(Siva[i][j]);
                }
            }
        }
        return result;
    }

    public static  void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the S1: ");
        String S1 = scan.nextLine();
        System.out.println("enter the S2: ");
        String S2 = scan.nextLine();
        //String S1 = "ABCDGH";
        //String S2 = "ACDGHR";

        int a = S1.length();
        int b = S2.length();

        System.out.println("output: " + Substr(S1.toCharArray(),S2.toCharArray(),a,b));
        scan.close();
    }
}