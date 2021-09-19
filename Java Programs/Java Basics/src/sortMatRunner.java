import java.util.*;


public class sortMatRunner {

	public static void merge(int v[], int l, int m, int r) {
        int n1 = m-l+1;
        int n2 = r-m;
        int lv[] = new int[n1];
        int rv[] = new int[n2];
        for (int i=0;i<n1;i++) {
        	lv[i] = v[l+i];        	
        }
        for (int j=0;j<n2;j++) {
        	rv[j] = v[m+1+j];        	
        }
        int i = 0, j = 0;
        int k = l;
        while (i<n1 && j<n2) {
            if (lv[i]<=rv[j]) {
                v[k] = lv[i];
                i++;
            }
            else {
                v[k] = rv[j];
                j++;
            }
            k++;
        }
        while (i<n1) {
            v[k] = lv[i];
            i++;
            k++;
        }
        while (j<n2) {
            v[k] = rv[j];
            j++;
            k++;
        }
    }
 
    public static void sort(int v[], int l, int r) {
        if (l < r) {
            int m =l+(r-l)/2;
            sort(v,l,m);
            sort(v,m+1,r);
            merge(v,l,m,r);
        }
    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of Rows: ");
		int n=sc.nextInt();
		System.out.print("Enter the number of Columns: ");
		int m=sc.nextInt();
		int[][] v = new int[n][m];
		int [] srt = new int[n*m];
		for(int i=0;i<n*m;i++) {
				srt[i] = sc.nextInt();
		}
		sort(srt,0,srt.length-1);
		int k=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				v[i][j]=srt[k++];
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(v[i][j]+" ");
			}
			System.out.println();
		}
	}

}
