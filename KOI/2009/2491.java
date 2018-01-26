import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  private void solve() {

    int n = sc.nextInt();
    int[] array = new int[n];

    for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
    }

    int before = array[0];
    int max = 1;
    int cnt = 1;

    for (int i = 1; i < n; i++) {

      if (before <= array[i]) {

        cnt++;

      } else {
        cnt = 1;
      }

      before = array[i];

      if (max < cnt) {
        max = cnt;
      }

    }

    before = array[0];
    cnt = 1;

    for (int i = 1; i < n; i++) {

      if (before >= array[i]) {

        cnt++;

      } else {
        cnt = 1;
      }

      before = array[i];

      if (max < cnt) {
        max = cnt;
      }

    }

    System.out.println(max);

  }

  public static void main(String[] args) {
    sc.init();

    new Main().solve();
  }

  static class sc {
    private static BufferedReader br;
    private static StringTokenizer st;

    static void init() {
      br = new BufferedReader(new InputStreamReader(System.in));
      st = new StringTokenizer("");
    }

    static String readLine() {
      try {
        return br.readLine();
      } catch (IOException e) {
      }
      return null;
    }

    static String readLineReplace() {
      try {
        return br.readLine().replaceAll("\\s+", "");
      } catch (IOException e) {
      }
      return null;
    }

    static String next() {
      while (!st.hasMoreTokens()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
        }
      }
      return st.nextToken();
    }

    static long nextLong() {
      return Long.parseLong(next());
    }

    static int nextInt() {
      return Integer.parseInt(next());
    }

    static double nextDouble() {
      return Double.parseDouble(next());
    }
  }
}