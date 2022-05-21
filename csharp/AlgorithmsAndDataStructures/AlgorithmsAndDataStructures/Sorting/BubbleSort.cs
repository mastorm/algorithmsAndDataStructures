namespace AlgorithmsAndDataStructures.Sorting;

public class BubbleSort : ISorter
{
    public void Sort(int[] arr)
    {

        while (true)
        {
            var swapped = false;
            for (int i = 0; i < arr.Length; i++)
            {
                if (i + 1 < arr.Length && arr[i] > arr[i + 1])
                {
                    swapped = true;
                    (arr[i], arr[i + 1]) = (arr[i + 1], arr[i]);
                }
            }

            if (!swapped)
            {
                break;
            }
        }
    }
}