class Solution {
    class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public void setZeroes(int[][] matrix) {
        List<Point> points = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    points.add(new Point(i, j));
                }
            }
        }

        for(Point p : points){
            update(matrix, p);
        }
    }

    private void update(int [][] matrix, Point p){
        for(int i = 0; i < matrix[0].length; i++){
            matrix[p.x][i] = 0;

        }

        for(int i = 0; i < matrix.length; i++){
            matrix[i][p.y] = 0;
        }
    }
}