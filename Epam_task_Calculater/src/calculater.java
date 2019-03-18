import java.util.*;
public class calculater {
	private Scanner in;
	int add_elements(int n,int a[])
    {
        int i;
        int s=0;
        for(i=0;i<n;i++)
            s+=a[i];
        return s;
    }
    int multiply_elements(int n,int a[])
    {
        int i;
        int s=1;
        for(i=0;i<n;i++)
            s*=a[i];
        return s;
    }
    int division(int a,int b)
    {
        return (a/b);
    }
}
