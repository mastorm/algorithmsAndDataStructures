using System.Collections;
using System.Collections.Generic;
using AlgorithmsAndDataStructures.Sorting;

namespace AlgorithmsAndDataStructures.Tests.Sorting;

public class SorterDataGenerator : IEnumerable<object[]>
{
    private List<ISorter> _algos = new List<ISorter>
    {
        new SelectionSort()
    };

    private List<(int[], int[])> _testLoads = new()
    {
        (new[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 }, new[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),

        (new[] { 5, 2, 3, 1, 4, 6, 9, 8, 7 }, new[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
    };

    public IEnumerator<object[]> GetEnumerator()
    {
        foreach (var algo in _algos)
        {
            foreach (var testLoad in _testLoads)
            {
                var (input, expectedOutput) = testLoad;
                yield return new object[] { algo, input, expectedOutput };
            }
        }
    }

    IEnumerator IEnumerable.GetEnumerator() => GetEnumerator();
}