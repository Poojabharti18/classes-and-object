package classandobject;

public class Addition {
        int x; //fields
        int y;
         public int calculatesum() //methods 
        {
        	int sum=x+y;
        	return sum;
        }
        public String tostring()
        {
        	return"X:="+x+"Y:="+y+"Sum:="+ calculatesum();
        }
}
