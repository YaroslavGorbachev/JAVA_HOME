
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.*;
 
public class task_5 {
 
    public static void main(String[] args) throws FileNotFoundException {
        new tasksOl().soluction();
    }
 
    void soluction() throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("INPUT.TXT"));
       PrintWriter out = new PrintWriter("OUTPUT.TXT");
        run(in, out);
    }
 
    void run(Scanner in, PrintWriter out){
        class Virus {
            final int x, y;
            Virus(int x, int y) { this.x = x; this.y = y; }
            int to(int tox, int toy) { return Math.abs(tox - x) + Math.abs(toy - y); }
        }
        final int width = in.nextInt(), height = in.nextInt();
        final Virus[] viruses;
        Arrays.setAll(viruses = new Virus[in.nextInt()], n -> new Virus(in.nextInt(), in.nextInt()));
 
        int result = Integer.MIN_VALUE;
 
        for (int x = 1; x <= width; x++)
            for (int y = 1; y <= height; y++) {
                int min = Integer.MAX_VALUE;
                for (Virus v : viruses) min = Math.min(min, v.to(x, y));
                result = Math.max(result, min);
            }
        out.println(result);
        out.flush();
    }
 
        int max = -1;
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                if(mas[i][j]>max)
                    max = mas[i][j];
            }
        }
 
        out.println(max);
 
        in.close();
        out.close();
 
}
