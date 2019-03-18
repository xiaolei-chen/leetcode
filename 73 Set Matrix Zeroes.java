class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean rowZero = false;
        boolean colZero = false;
        //��ɨ���һ�е�һ�У������0���򽫸��Ե�flag����Ϊtrue
        for(int i=0; i<m; ++i){
            if(matrix[i][0]==0){
                colZero = true;
            }
        }
        for(int j=0; j<n; ++j){
            if(matrix[0][j]==0){
                rowZero = true;
            }
        }
        //Ȼ��ɨ���ȥ��һ�е�һ�е��������飬�����0���򽫶�Ӧ�ĵ�һ�к͵�һ�е����ָ�0
        for(int i=1; i<m; ++i){
            for(int j=1; j<n; ++j){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        //�ٴα�����ȥ��һ�е�һ�е��������飬�����Ӧ�ĵ�һ�к͵�һ�е�������һ��Ϊ0���򽫵�ǰֵ��0
        for(int i=1; i<m; ++i){
            for(int j=1; j<n; ++j){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        //�����ݵ�һ�е�һ�е�flag�����µ�һ�е�һ��
        if(colZero == true){
            for(int i=0; i<m; ++i){
                matrix[i][0] = 0;
            }
        }
        if(rowZero == true){
            for(int j=0; j<n; ++j){
                matrix[0][j] = 0;
            }
        }
    }
}