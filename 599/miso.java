public class miso {
    public static void main(String[] args) {
       String[] list1 = {"KFC","Shogun","Tapioca Express","Burger King","KFC"} , list2 = {"KFC","Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
       miso misso = new miso();
       System.out.println(misso.findMISO(list1 , list2));
    }

    public String[] findMISO(String[] list1 , String[] list2)
    {
        int indexSum = list1.length + list2.length , count = -1;
        String[] result = new String[indexSum];
        for(int i=0 ; i < list1.length ; i++)
        {
            for(int j=0 ; j < list2.length ; j++)
            {
                if( list1[i].equals(list2[j]) && ( i+j < indexSum ) ) 
                {
                    indexSum = i + j;
                    result[++count] = list1[i];
                }
            }
        }
        return result;
    }
}
