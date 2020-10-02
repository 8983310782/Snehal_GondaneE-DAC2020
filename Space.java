class Space{

     public static void main(String[] args)
        {
 
            for (int i=1; i<= 9 ; i++)
            {
                for (int j = i; j < 9 ; j++) 
                {
                    System.out.print(" ");
                }   
                for (int k = 1; k <= (2*i -1) ;k++) 
                {
                    if( k==1 || i == 9 || k==(2*i-1)) 
                    {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
            
        }
    }