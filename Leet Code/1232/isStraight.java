public class isStraight {
    public static void main(String[] args) {
        int[][] points = {{0,0} , {0,1} , {0,-1}};
        isStraight obj = new isStraight();
        System.out.println(obj.checkStraightLine(points));
    }

    public boolean checkStraightLine(int[][] coordinates) {
    if(coordinates.length <= 1) return true;

    // equation = ax + by = c
	int a = (coordinates[1][1] - coordinates[0][1]);
	int b = (coordinates[0][0] - coordinates[1][0]);
	int c = a * coordinates[0][0] + b * coordinates[0][1];

	for(int i = 2; i < coordinates.length; i++) {
		int val = a * coordinates[i][0] + b * coordinates[i][1];
		if(val != c)
			return false;
	}

	return true;
    }
}
