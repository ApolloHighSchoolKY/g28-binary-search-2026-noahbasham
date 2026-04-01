import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		System.out.println(Arrays.toString(ray));

		Arrays.sort(ray);
		int bottom = 0;
		int top = ray.length;
		boolean foundIt = false;

		while(foundIt==false)
		{
			if ((ray[bottom] > item && ray[top-1] > item) || (ray[bottom] < item && ray[top-1] < item))
				return -1;
			else if(ray[(bottom+top)/2] < item)
			{
				bottom = (bottom+top)/2;
			}
			else if(ray[(bottom+top)/2] > item)
			{
				top = ((bottom+top)/2);
			}
			else if(ray[(bottom+top)/2] == item)
			{
				foundIt = true;
			}
		}
		
		return (top + bottom)/2;

	}
}
