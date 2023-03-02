class RectangleOverlap
{
	public static void main(String args[])
	{
		int[] rec1 = {0,0,1,1}, rec2 = {1,0,2,1};
		RectangleOverlap lap = new RectangleOverlap();
		System.out.println(lap.isRectangleOverlap(rec1, rec2));
	}
	
	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if(rec2[0] - rec1[0] > 0 && rec2[1] - rec1[1] > 0)
		{
			if(rec1[2] - rec2[0] > 0 && rec1[3] - rec2[0] > 0)
				return true;
		}
		else if(rec2[2] - rec1[0] > 0 && rec2[3] - rec1[1] > 0)
		{
			if(rec1[2] - rec2[2] > 0 && rec1[3] - rec2[3] > 0)
				return true;
		}
		
		return false;
    }
}