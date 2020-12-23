package task4;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSum {
    // 最大m段和方法
    public static int Sum(int[] a  ,int m ,int n) {
        int num_m = m;
        System.out.println("输入数据："+Arrays.toString(a));
        System.out.println("段数："+m);
        System.out.println("结束位置："+n);
        System.out.println("----------------------------------------");
        if(n < m || m < 1){
            return 0;
        }
        int[][] b = new int[m+1][n+1];
        for(int p = 0; p <= m; p++)    {
            b[p][0] = 0;
        }
        for (int p = 1; p <= n; p++) {
            b[0][p] = 0;
        }
        // 主要算法部分 m:段数 n：数组内数的个数
        for(int i=1;i<=m;i++){
            for (int j = i;j<=n-m+i;j++){
                // j 比i 大时
                if(j>i){
                    //先假设 第j个数作为最后一个子段的一部分
                    b[i][j] = b[i][j-1] + a[j-1];
                    for (int k = i-1; k < j; k++) {
                        if(b[i][j] < b[i-1][k]+a[j-1]){
                            b[i][j] = b[i-1][k] + a[j-1];
                        }
                    }
                }else {  // i = j
                    b[i][j] = b[i-1][j-1] + a[j-1];
                }
            }
        }//end for
        Object[] c;
        c= Arrays.stream(b).toArray();
        int sum = 0; 
        int end = 0; 
        for (int j = m; j <= n ; j++) {
            // 最大m段和
            if (sum < b[m][j]){
                sum = b[m][j];
                end = j; 
            }
        }

        while(m > 0){
            int dd = 0; 
            int s = index(end,m,n,b,a);
            m--;
            if (m != 0){
                end = s;
                int max = 0;
                for (int i = end; i >= m ; i--) {
                    if (dd < b[m][i]){
                        dd = b[m][i];
                        end = i;
                    }
                }
            }
        }
        // 输出结果
        System.out.println("----------------------------------------");
        System.out.println("最大"+num_m+"段和："+sum);
        return sum;
    }// end of method
    // 计算m段的分段位置 返回一个分段的初始位置的前一个位置

    /**
     * 确定各分段位置
     * @param endIndex  结束位置
     * @param m 段数
     * @param n 结束位置
     * @param b 存储的数据
     * @param a 原始数组
     * @return
     */
    public static int index( int endIndex, int m, int n, int[][] b, int[] a){
        ArrayList arrayList=new ArrayList();
        int z = m; 
        for (int i = 1; i < n; i++) {
            int stp = endIndex-i+1;  // 开始是最后分段的最后位置
            if(stp <= 0){ 
                return 0;
            }
            if (b[m][endIndex+1-i] - b[m][endIndex-i] == a[endIndex-i] && stp != 1){ // 判断一个数是单独的分段，还是作为分段的一部分
//                System.out.println("数字："+a[endIndex-i]+"第"+z+"段的一部分，" +
//                        "序列位置为："+stp);
                arrayList.add(0,a[endIndex-i]);

            }else{
//                System.out.println("数字："+a[endIndex-i]+"第"+z+"段，" +
//                        "序列位置："+stp);

                arrayList.add(0,a[endIndex-i]);
                System.out.println("第"+z+"段数据为："+arrayList);
                z = z-1;
                return endIndex-i;
            }
        }
        return 0;
    }
    // 主函数
    public static void main(String[] args) {
        int[] a = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        // 调用方法 m:段数 n:结束位置
        Sum(a, 3,8);
    }
}