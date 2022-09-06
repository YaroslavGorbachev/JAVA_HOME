package HomeWork;

public class task_1{
    static void solveRec(int a, int b, int c, int d, int[] arr, int i) {
        if (i > b)
          return;
        else if ((i % c == 0) && (i - d >= 0))
          arr[i] = arr[i - d] + arr[i / c];
        else if (i - d >= 0)
          arr[i] = arr[(i - d)];
        else if (i % c == 0)
          arr[i] = arr[i / c];    
        solveRec(a, b, c, d, arr, i + 1);
    }

    static String routeRec(int a, int b, int c, int d, int[] arr) {
        String solution = "";
        if (arr[b] == 0)
          return solution;
        if (b == a)
          return solution;
        if ((b % c == 0) && (arr[b / c] != 0))
          solution = routeRec(a, (b / c), c, d, arr) + "k1 ";
        else if ((b - d >= a) && (arr[b - d] != 0))
          solution = routeRec(a, (b - d), c, d, arr) + "k2 ";
        return solution;
      }
  public static void main(String[] args) {
    int a = 3;
    int b = 15;
    int c = 2;
    int d = 1;
    int[] arr = new int[b + 1];
    arr[a] = 1;
    solveRec(a, b, c, d, arr, (a+1)); 

    for (int i = 0; i < arr.length; i++) {
        System.out.printf("%d -> %d\n", i, arr[i]);
        }

    String routeRecString = routeRec(a, b, c, d, arr);
    System.out.printf("\nОдин из возможных мартшрутов: \n%s", routeRecString);
    }  


}   