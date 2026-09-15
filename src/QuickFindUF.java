public class QuickFindUF {

    private int[] id;

    // TODO: Implement the constructor
    // Initialize id[] so that each object is its own component (id[i] = i)
    public QuickFindUF(int N) {
        // YOUR CODE HERE
        id = new int[N];
        for(int i = 0; i < id.length; i++) {
            id[i]=i;
        }
    }

    // TODO: Implement connected()
    // Return true if p and q are in the same component
    public boolean connected(int p, int q) {
        // YOUR CODE HERE
        return false; // placeholder
    }

    // TODO: Implement union()
    // Merge the components containing p and q
    // HINT: Save id[p] to a variable BEFORE the loop — why does this matter?
    public void union(int p, int q) {
        // YOUR CODE HERE
    }

    public static void main(String[] args) {

        // -------------------------------------------------------
        // EXAMPLE TEST (provided) — do not modify
        // -------------------------------------------------------
        QuickFindUF uf = new QuickFindUF(10);
        uf.union(4, 3);
        uf.union(3, 8);
        // After union(4,3) and union(3,8), nodes 4 and 8 should be connected
        System.out.println("Test 1 (expect true):  " + uf.connected(4, 8));

        // -------------------------------------------------------
        // YOUR TESTS — write 4 more tests below
        // Each test should print a label and the expected result
        // -------------------------------------------------------

        // Test 2:
        // TODO: Write your test here

        // Test 3:
        // TODO: Write your test here

        // Test 4:
        // TODO: Write your test here

        // Test 5:
        // TODO: Write your test here

        // -------------------------------------------------------
        // FILE TESTS — read union commands from a file using Scanner
        // Run with: java QuickFindUF < tinyUF.txt
        //
        // File format (tinyUF.txt):
        //   Line 1:        N  (number of objects)
        //   Lines 2+:      p q  (pairs to union if not already connected)
        //
        // Use this pattern:
        //   Scanner sc = new Scanner(System.in);
        //   int N = sc.nextInt();
        //   QuickFindUF uf = new QuickFindUF(N);
        //   while (sc.hasNextInt()) {
        //       int p = sc.nextInt();
        //       int q = sc.nextInt();
        //       if (!uf.connected(p, q)) {
        //           uf.union(p, q);
        //           System.out.println(p + " " + q);
        //       }
        //   }
        // -------------------------------------------------------

        // Test 6 — tinyUF.txt (10 objects, 11 pairs)
        // Run with: java QuickFindUF < tinyUF.txt
        // After processing all pairs, check: are nodes 0 and 7 connected? (expect true)
        // TODO: Read N from Scanner, build QuickFindUF, process all pairs, then print:
        // System.out.println("Test 6 (expect true):  " + uf6.connected(0, 7));

        // Test 7 — mediumUF.txt (larger file)
        // Run with: java QuickFindUF < mediumUF.txt
        // After processing all pairs, check: are nodes 0 and 1 connected? (expect true)
        // TODO: Read N from Scanner, build QuickFindUF, process all pairs, then print:
        // System.out.println("Test 7 (expect true):  " + uf7.connected(0, 1));
    }
}
