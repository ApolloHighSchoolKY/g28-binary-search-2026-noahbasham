import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		Arrays.sort(ray);
		if(ray[ray.length/2]==item)
			return ray.length/2;

		else if(ray[ray.length/2]<item)
		{
			int[] newRay = new int[ray.length/2];
			for(int i=0; i<newRay.length; i++)
			{
				newRay[i] = ray[i];
			}
			return binarySearch(newRay, item);
		}
		else
		{
			int[] newRay = new int[ray.length/2];
			for(int i=ray.length/2; i<ray.length; i++)
			{
				newRay[i] = ray[i];
			}
			return binarySearch(newRay, item);
		}
	}
}
