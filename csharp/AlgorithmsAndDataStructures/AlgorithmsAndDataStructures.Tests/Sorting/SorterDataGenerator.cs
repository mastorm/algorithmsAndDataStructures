using System;
using System.Collections;
using System.Collections.Generic;
using AlgorithmsAndDataStructures.Sorting;

namespace AlgorithmsAndDataStructures.Tests.Sorting;

public class SorterDataGenerator : IEnumerable<object[]>
{
    private List<ISorter> _algos = new()
    {
        new SelectionSort(),
        new BubbleSort()
    };

    private List<(int[], int[])> _testLoads = new()
    {
        (new[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 }, new[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),

        (new[] { 5, 2, 3, 1, 4, 6, 9, 8, 7 }, new[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }),
    };

    private void CopyArray(int[] input, int[] output)
    {
        if (output.Length != input.Length)
        {
            throw new ArgumentException(nameof(output), $"Output array doesnt match expected length");
        }

        for (var i = 0; i < input.Length; i++)
        {
            output[i] = input[i];
        }
    }
    
    public IEnumerator<object[]> GetEnumerator()
    {
        foreach (var algo in _algos)
        {
            foreach (var testLoad in _testLoads)
            {
                var (input, expectedOutput) = testLoad;
                var cpyIn = new int[input.Length];
                var cpyOut = new int[expectedOutput.Length];

                CopyArray(input, cpyIn);
                CopyArray(expectedOutput, cpyOut);
                
                yield return new object[] { algo, cpyIn, cpyOut };
            }
        }
    }

    IEnumerator IEnumerable.GetEnumerator() => GetEnumerator();
}