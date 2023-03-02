class BestScore{
	public static void main(String args[])
	{
		BestScore bs = new BestScore();
		int[] scores = {1,3,5,10,15};
		int[] ages = {1,2,3,4,5};
		
		System.out.println(bs.bestTeamScore(scores, ages));
	}
	
	public int bestTeamScore(int[] scores, int[] ages) 
    {
		
        for(int i = 0 ; i < scores.length ; i++)
        {
            for(int j = 0 ; j < scores.length ; j++)
            {
                if(scores[i] < scores[j]) {
                    int temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;

                    temp = ages[i];
                    ages[i] = ages[j];
                    ages[j] = temp;
                }
            }
        }        
    }
}