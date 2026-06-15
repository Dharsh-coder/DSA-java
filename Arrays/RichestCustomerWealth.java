public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int row = accounts.length;
        int col = accounts[0].length;
        int max = 0;
        for(int i = 0;i<row;i++){
            int n = 0;
            for(int j=0;j<col;j++){
                n = n+accounts[i][j];
            }
            if(max<n){
                max = n;
            }
        }
        return max;
    }
}
