namespace AlgorithmsAndDataStructures.Sorting;

public class SelectionSort : ISorter
{
    public void Sort(int[] arr)
    {
        for (var i = 0; i < arr.Length; i++)
        {
            var smallestSeen = i;
 
            for (var j = i; j < arr.Length; j++)
            {
                if (arr[smallestSeen] > arr[j])
                {
                    smallestSeen = j;
                }
            }

            (arr[i], arr[smallestSeen]) = (arr[smallestSeen], arr[i]);
        }
    }
}