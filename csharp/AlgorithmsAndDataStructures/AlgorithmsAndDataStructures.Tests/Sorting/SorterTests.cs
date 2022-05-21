using AlgorithmsAndDataStructures.Sorting;
using Xunit;

namespace AlgorithmsAndDataStructures.Tests.Sorting;

public class SorterTests
{
    [Theory]
    [ClassData(typeof(SorterDataGenerator))]
    public void SortingAlgo_DoesSortArrays(ISorter sorter, int[] input, int[] expectedOutput)
    {
        sorter.Sort(input);

        
        Assert.Equal(input.Length, expectedOutput.Length);
        for(var i = 0; i < input.Length; i++)
        {
            Assert.Equal(expectedOutput[i], input[i]);
        }
    }
}