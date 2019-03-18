class Solution {
    public int numTrees(int n) {
    int[] G = new int[n+1];
    G[0] = 1;
        
	//����ʽ��Ct+1 += Ci*Ct-i(0<= i <= t)
    //��num = t+1
    //�� t = num-1;
    //��˵���ʽ��Ϊ��
    //Cnum += Ci*Cnum-1-i(0<=i<=num-1, 1<=num<=n)
    //C0 = 1
    for (int i=1; i<=n; ++i) {
        for (int j=0; j<=i-1; ++j) {
            G[i] += G[j] * G[i-1-j];
        }
    }
    return G[n];
  }
}